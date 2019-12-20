package com.kota.hibernate.object_states;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PersistenceState {
    public static void main(String[] args) {
    System.out.println("Entered Main");
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();
        UserDetails userDetails = new UserDetails();
        userDetails.setUserName("New User");
        session.save(userDetails);

        userDetails.setUserName("Updated Once");

        userDetails.setUserName("Updated Again");

        session.getTransaction().commit();
        session.close();

        userDetails.setUserName("Updated Once Again");

        System.out.println("Exist Main");
    }
}
