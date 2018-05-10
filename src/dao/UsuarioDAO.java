package dao;

import db.Conexao;
import db.SessionCreator;
import objetos.Fornecedor;
import objetos.Usuario;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.jdbc.Work;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class UsuarioDAO {

    public List<Usuario> getUsuarios(){
        Session session = SessionCreator.getSession();
        List<Usuario> usuarios = session.createCriteria(Usuario.class).list();
        session.close();
        return usuarios;
    }

    public boolean salvarUsuario(Usuario usuario){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Platinum-Chest");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        em.persist(usuario);
        em.getTransaction().commit();
        System.out.println("Usuario cadastrado: " + usuario.getId() + ", Nome: " + usuario.getNome());
        em.close();
        factory.close();
        return true;
    }

    public String getCredenciais(String username){
        Connection conexao = null;
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

        } catch (SQLException e){
            e.printStackTrace();
        }
        return senha;
    }

}
