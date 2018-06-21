package com.platinumChest.dao;

import com.platinumChest.db.SessionCreator;
import com.platinumChest.objetos.Patrimonio;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import com.platinumChest.utils.Utils;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import java.util.ArrayList;

public class PatrimonioDAO {

    public ArrayList<Patrimonio> getPatrimonios(){
        return getPatrimoniosPorNome("");
    }

    public ArrayList<Patrimonio> getPatrimoniosPorNome(String nome){
        ArrayList<Patrimonio> patrimonios;
        Session session = SessionCreator.getSession();
        try{
            if(nome == null || nome.isEmpty()){
                patrimonios= new ArrayList<Patrimonio>(
                        session.createCriteria(Patrimonio.class).list());
            } else {
                Criteria criterio = session.createCriteria(Patrimonio.class);
                patrimonios = new ArrayList<Patrimonio>(criterio
                        .add(Restrictions.like("nome", "%" + nome + "%"))
                        .addOrder(Order.asc("nome")).list());
            }
        } catch (HibernateException e){
            Utils.gravarException();
            return null;
        } finally {
            session.close();
        }
        return patrimonios;
    }


    public boolean salvarPatrimonio(Patrimonio pat) {
        Session session = SessionCreator.getSession();
        Transaction transacao = session.getTransaction();
        try {
            transacao.begin();
            session.persist(pat);
            transacao.commit();
        } catch (HibernateException e) {
            Utils.gravarException();
            return false;
        } finally {
            session.close();
        }
        return true;
    }

}
