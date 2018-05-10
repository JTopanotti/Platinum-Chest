package dao;

import db.Conexao;
import db.SessionCreator;
import objetos.Fornecedor;
import org.hibernate.Session;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class FornecedorDAO {

    public List<Fornecedor> getFornecedores(){
        Session session = SessionCreator.getSession();
        List<Fornecedor> fornecedores = session.createCriteria(Fornecedor.class).list();
        session.close();
        return fornecedores;
    }

    public ArrayList<Fornecedor> getFornecedoresPorNome(String nome){
        ArrayList<Fornecedor> fornecedores = null;
        if(nome.isEmpty() || nome == null){
            Session session = SessionCreator.getSession();
            fornecedores = new ArrayList<>(session.createCriteria(Fornecedor.class).list());
        } else {
            try {
                Connection conexao = Conexao.getConexao();
                String query_string =
                        "select id, nome from fornecedor where nome like \"%" + nome + "%\";";
                System.out.println(query_string);
                ResultSet rs = conexao.createStatement().executeQuery(query_string);
                fornecedores = new ArrayList<>();
                while(rs.next()){
                    Fornecedor fornecedor = new Fornecedor();
                    fornecedor.setId(rs.getInt("id"));
                    fornecedor.setNome(rs.getString("nome"));
                    fornecedores.add(fornecedor);
                }

            } catch(SQLException e){
                e.printStackTrace();
            }
        }
        return fornecedores;
    }

    public Fornecedor getFornecedorPorId(int id){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Platinum-Chest");
        EntityManager em = factory.createEntityManager();
        Fornecedor forn = em.find(Fornecedor.class, id);
        System.out.println(forn.getNome());
        em.flush();
        em.close();
        factory.close();
        return forn;
    }

    public boolean salvarFornecedor(Fornecedor forn){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Platinum-Chest");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        em.persist(forn);
        em.getTransaction().commit();
        System.out.println("Fornecedor cadastrado: " + forn.getId() + ", Nome: " + forn.getNome());
        em.close();
        factory.close();
        return true;
    }

}
