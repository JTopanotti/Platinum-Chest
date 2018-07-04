package com.platinumChest.persistence;

import com.platinumChest.dao.UsuarioDAO;
import com.platinumChest.db.SessionCreator;
import com.platinumChest.objetos.Usuario;
import com.platinumChest.utils.Utils;
import org.hibernate.*;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import java.util.ArrayList;

public class UsuarioPersister implements UsuarioDAO {

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
        Session session = SessionCreator.getSession();
        String senha = null;
        try{
            String query = "select senha from usuario where usuario = \"" + username +  "\"";
            Query querySQL = session.createSQLQuery(query);
            senha = querySQL.list().get(0).toString();
        } catch (Exception e){
            Utils.gravarException();
        }
        return senha;
    }
}
