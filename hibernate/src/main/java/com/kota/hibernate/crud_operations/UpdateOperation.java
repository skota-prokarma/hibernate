package com.kota.hibernate.crud_operations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateOperation {
    public static void main(String[] args) {
    System.out.println("Entered Main");
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();
        UserDetails userDetails = session.get(UserDetails.class, 5);
        userDetails.setUserName("Fivee");
        UserDetails userDetails1 = session.get(UserDetails.class, 5);
        System.out.println("userDetails1.toString() = " + userDetails1.toString());
        
        session.getTransaction().commit();
        session.close();
        System.out.println("userDetails.toString() = " + userDetails.toString());

        System.out.println("Exist Main");
    }
}
