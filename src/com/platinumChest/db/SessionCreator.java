package com.platinumChest.db;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionCreator {

    private static SessionFactory factory;

    public static Session getSession(){
        if(factory == null){
            Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");
            factory = configuration.buildSessionFactory();
        }
        return factory.openSession();
    }
}
