package com.kota.hibernate.crud_operations;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SaveOperation {
    public static void main(String[] args) {
    System.out.println("Entered Main");

        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();
        for (int i = 0; i < 10; i++) {
            UserDetails userDetails = new UserDetails();
            userDetails.setUserName("user_" +i);
            session.save(userDetails);
        }
        session.getTransaction().commit();
        session.close();


        System.out.println("Exist Main");
    }

}
