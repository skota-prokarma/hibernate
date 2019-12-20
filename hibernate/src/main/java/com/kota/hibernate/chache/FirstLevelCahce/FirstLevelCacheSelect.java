package com.kota.hibernate.chache.FirstLevelCahce;

import com.kota.hibernate.crud_operations.UserDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FirstLevelCacheSelect {
    public static void main(String[] args) {
        System.out.println("Entered Main");
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();

        UserDetails userDetails = session.get(UserDetails.class, 1);
        userDetails.setUserName("Changed Name");

        UserDetails userDetails1 = session.get(UserDetails.class, 9);
        session.getTransaction().commit();
        session.close();
        System.out.println("userDetails.toString() = " + userDetails.toString());

        System.out.println("Exist Main");
    }
}
