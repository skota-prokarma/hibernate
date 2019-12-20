package com.kota.hibernate.inheritence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class InheritenceTest {
    public static void main(String[] args) {
    System.out.println("Entered Main");
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();



        UserDetails userDetails1 = new UserDetails();
        userDetails1.setUserName("kota2");

       Vehicle vehicle= new Vehicle();
       vehicle.setModel("Volvo");
        vehicle.setVehicleNumber(1);



        session.save(userDetails1);
        session.save(vehicle);
        // session.save(homeAddress);




        session.getTransaction().commit();
        session.close();

        System.out.println("Exist Main");
    }
}
