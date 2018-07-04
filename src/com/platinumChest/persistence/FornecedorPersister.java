package com.platinumChest.persistence;

import com.platinumChest.dao.FornecedorDAO;
import com.platinumChest.db.SessionCreator;
import com.platinumChest.objetos.Fornecedor;
import com.platinumChest.utils.Utils;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import java.util.ArrayList;

public class FornecedorPersister implements FornecedorDAO {

    public ArrayList<Fornecedor> getFornecedores(){
        return getFornecedoresPorNome("");
    }

    public ArrayList<Fornecedor> getFornecedoresPorNome(String nome){
        ArrayList<Fornecedor> fornecedores;
        Session session = SessionCreator.getSession();
        try{
            if(nome == null || nome.isEmpty()){
                fornecedores = new ArrayList<Fornecedor>(
                        session.createCriteria(Fornecedor.class).list());
            } else {
                Criteria criterio = session.createCriteria(Fornecedor.class);
                fornecedores = new ArrayList<Fornecedor>(criterio
                        .add(Restrictions.like("nome", "%" + nome + "%"))
                        .addOrder(Order.asc("nome")).list());
            }
        } catch (HibernateException e){
            Utils.gravarException();
            return null;
        } finally {
            session.close();
        }
        return fornecedores;
    }


    public boolean salvarFornecedor(Fornecedor forn) {
        Session session = SessionCreator.getSession();
        Transaction transacao = session.getTransaction();
        try {
            transacao.begin();
            session.persist(forn);
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
