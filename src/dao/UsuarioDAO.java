package dao;

import db.Conexao;
import db.SessionCreator;
import objetos.Usuario;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import utils.Utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    public List<Usuario> getUsuarios(){
        try {
            Session session = SessionCreator.getSession();
            List<Usuario> usuarios = session.createCriteria(Usuario.class).list();
            session.close();
            return usuarios;
        } catch (Exception e){
            Utils.gravarException();
            return null;
        }
    }

    public ArrayList<Usuario> getUsuariosPorNome(String nome){
        ArrayList<Usuario> usuarios = null;
        if(nome.isEmpty() || nome == null){
            Session session = SessionCreator.getSession();
            usuarios = new ArrayList<>(session.createCriteria(Usuario.class).list());
        } else {
            try {
                Connection conexao = Conexao.getConexao();
                String query_string =
                        "select id, nome from usuario where nome like \"%" + nome + "%\";";
                System.out.println(query_string);
                ResultSet rs = conexao.createStatement().executeQuery(query_string);
                usuarios = new ArrayList<>();
                while(rs.next()){
                    Usuario usuario = new Usuario();
                    usuario.setId(rs.getInt("id"));
                    usuario.setNome(rs.getString("nome"));
                    usuarios.add(usuario);
                }

            } catch(Exception e){
                Utils.gravarException();
            }
        }
        return usuarios;
    }

    public boolean salvarUsuario(Usuario usuario){
        try{
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("Platinum-Chest");
            EntityManager em = factory.createEntityManager();
            em.getTransaction().begin();
            em.persist(usuario);
            em.getTransaction().commit();
            System.out.println("Usuario cadastrado: " + usuario.getId() + ", Nome: " + usuario.getNome());
            em.close();
            factory.close();
            return true;
        } catch (Exception e){
            Utils.gravarException();
            return false;
        }
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
