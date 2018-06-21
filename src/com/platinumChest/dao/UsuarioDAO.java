package com.platinumChest.dao;

import com.platinumChest.db.Conexao;
import com.platinumChest.db.SessionCreator;
import com.platinumChest.objetos.Usuario;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import com.platinumChest.utils.Utils;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class UsuarioDAO {

    public ArrayList<Usuario> getUsuarios(){
        return getUsuariosPorNome("");
    }

    public ArrayList<Usuario> getUsuariosPorNome(String nome){
        ArrayList<Usuario> usuarios;
        Session session = SessionCreator.getSession();
        try{
            if(nome == null || nome.isEmpty()){
                usuarios= new ArrayList<Usuario>(
                        session.createCriteria(Usuario.class).list());
            } else {
                Criteria criterio = session.createCriteria(Usuario.class);
                usuarios = new ArrayList<Usuario>(criterio
                        .add(Restrictions.like("nome", "%" + nome + "%"))
                        .addOrder(Order.asc("nome")).list());
            }
        } catch (HibernateException e){
            Utils.gravarException();
            return null;
        } finally {
            session.close();
        }
        return usuarios;
    }

    public boolean salvarUsuario(Usuario usuario){
        Session session = SessionCreator.getSession();
        Transaction transacao = session.getTransaction();
        try {
            transacao.begin();
            session.persist(usuario);
            transacao.commit();
        } catch (HibernateException e) {
            Utils.gravarException();
            return false;
        } finally {
            session.close();
        }
        return true;
    }

    public String getCredenciais(String username){
        Connection conexao;
        String senha = null;
        try{
            conexao = Conexao.getConexao();
            Statement statement = conexao.createStatement();
            String query = "select senha from usuario where usuario = \"" + username +  "\"";
            ResultSet rs = statement.executeQuery(query);
            if(rs.next()){
                senha = rs.getString("senha");
            }
            conexao.close();
            rs.close();
            statement.close();

        } catch (Exception e){
            Utils.gravarException();
        }
        return senha;
    }

}
