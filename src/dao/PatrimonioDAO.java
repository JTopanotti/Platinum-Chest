package dao;

import db.SessionCreator;
import objetos.Patrimonio;
import org.hibernate.Query;
import org.hibernate.Session;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PatrimonioDAO {

    public List<Patrimonio> getPatrimonios(){
        Session session = SessionCreator.getSession();
        return session.createCriteria(Patrimonio.class).list();
    }

    public Patrimonio getPatrimonioPorId(int id){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Platinum-Chest");
        EntityManager em = factory.createEntityManager();
        Patrimonio pat = em.find(Patrimonio.class, id);
        em.flush();
        em.close();
        factory.close();
        return pat;
    }

    public boolean salvarPatrimonio(Patrimonio pat){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Platinum-Chest");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        em.persist(pat);
        em.getTransaction().commit();
        System.out.println("Patrimonio cadastrado: " + pat.getId() + ", Nome: " + pat.getNome());
        em.close();
        factory.close();
        return true;
    }
}
