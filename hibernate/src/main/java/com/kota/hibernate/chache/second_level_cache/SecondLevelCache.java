package com.kota.hibernate.chache.second_level_cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SecondLevelCache {

    public static void main(String[] args) {
    System.out.println("Entered Main");

        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();

        session.beginTransaction();
        UserDetails userDetails = session.get(UserDetails.class, 1);
        session.getTransaction().commit();
        session.close();

        Session session1 = sf.openSession();

      /*  session1.beginTransaction();
        UserDetails userDetails1 = session1.get(UserDetails.class, 1);
        session1.getTransaction().commit();
        session1.close();*/



        System.out.println("Exist Main");
    }

}
