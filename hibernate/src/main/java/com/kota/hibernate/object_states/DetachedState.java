package com.kota.hibernate.object_states;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DetachedState {
    public static void main(String[] args) {
        System.out.println("Entered Main");
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();

        UserDetails userDetails = new UserDetails();
        userDetails.setUserName("New User");
        session.save(userDetails);
        userDetails.setUserName("Updated Once");

        session.getTransaction().commit();
        session.close();

        SessionFactory sf1 = new Configuration().configure().buildSessionFactory();
        Session session1 = sf1.openSession();
        session1.beginTransaction();
        session1.save(userDetails);

        userDetails.setUserName("Updated Once Again");
        session1.getTransaction().commit();
        session1.close();



        System.out.println("Exist Main");
    }
}
