package com.kota.hibernate;

import com.kota.hibernate.OneToMany.Address;
import com.kota.hibernate.OneToMany.UserDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class HibernateTest {

    public static void main(String[] args) {
    System.out.println("Entered Main");
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();



        com.kota.hibernate.OneToMany.UserDetails userDetails1 = new UserDetails();
        userDetails1.setUserName("kota2");

        com.kota.hibernate.OneToMany.Address homeAddress = new com.kota.hibernate.OneToMany.Address();
        homeAddress.setStreet("strret");
        homeAddress.setState("AP");
        homeAddress.setCity("HYD");
        homeAddress.setPincode("500023");
       // homeAddress.getUserDetails().add(userDetails1);

        List<com.kota.hibernate.OneToMany.Address> add = new ArrayList<>();
        add.add(homeAddress);

        com.kota.hibernate.OneToMany.Address officeAddress = new Address();
        officeAddress.setStreet("strret");
        officeAddress.setState("Telangana");
        officeAddress.setCity("HYD");
        officeAddress.setPincode("500023");
        add.add(officeAddress);

        userDetails1.setAddresses(officeAddress);

        session.save(userDetails1);
        session.save(officeAddress);
       // session.save(homeAddress);




        session.getTransaction().commit();
        session.close();

        System.out.println("Exist Main");
    }
}
