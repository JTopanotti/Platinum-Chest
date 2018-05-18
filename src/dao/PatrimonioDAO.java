package dao;

import db.Conexao;
import db.SessionCreator;
import objetos.Patrimonio;
import org.hibernate.Session;
import utils.Utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PatrimonioDAO {

    public ArrayList<Patrimonio> getPatrimoniosPorNome(String nome){
        ArrayList<Patrimonio> patrimonios = null;
        if(nome.isEmpty() || nome == null){
            Session session = SessionCreator.getSession();
            patrimonios = new ArrayList<>(session.createCriteria(Patrimonio.class).list());
        } else {
            try {
                Connection conexao = Conexao.getConexao();
                String query_string =
                        "select id, nome, valor, data_geracao from patrimonio where nome like \"%" + nome + "%\";";
                System.out.println(query_string);
                ResultSet rs = conexao.createStatement().executeQuery(query_string);
                patrimonios = new ArrayList<>();
                while(rs.next()){
                    Patrimonio patrimonio = new Patrimonio();
                    patrimonio.setId(rs.getInt("id"));
                    patrimonio.setNome(rs.getString("nome"));
                    patrimonio.setValor(rs.getFloat("valor"));
                    patrimonio.setData_geracao(rs.getDate("data_geracao"));
                    patrimonios.add(patrimonio);
                }

            } catch(Exception e){
                Utils.gravarException();
            }
        }
        return patrimonios;
    }

    public Patrimonio getPatrimonioPorId(int id){
        try {
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("Platinum-Chest");
            EntityManager em = factory.createEntityManager();
            Patrimonio pat = em.find(Patrimonio.class, id);
            em.flush();
            em.close();
            factory.close();
            return pat;
        } catch (Exception e){
            Utils.gravarException();
            return null;
        }
    }

    public boolean salvarPatrimonio(Patrimonio pat){
        try {
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("Platinum-Chest");
            EntityManager em = factory.createEntityManager();
            em.getTransaction().begin();
            em.persist(pat);
            em.getTransaction().commit();
            System.out.println("Patrimonio cadastrado: " + pat.getId() + ", Nome: " + pat.getNome());
            em.close();
            factory.close();
            return true;
        } catch (Exception e){
            Utils.gravarException();
            return false;
        }
    }
}
