package dao;

import db.SessionCreator;
import objetos.Fornecedor;
import objetos.Usuario;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;


public class FornecedorDAO {

    public List<Fornecedor> getFornecedores(){
        Session session = SessionCreator.getSession();
        List<Fornecedor> fornecedores = session.createCriteria(Fornecedor.class).list();
        session.close();
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
