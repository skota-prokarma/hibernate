package com.kota.hibernate.inheritence.single_table_per_class;

import com.kota.hibernate.inheritence.single_table_per_class.UserDetails;
import com.kota.hibernate.inheritence.single_table_per_class.Vehicle;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class SingleTableClassTest {
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

            Vehicle vehicle1= new Vehicle();
            vehicle1.setModel("Bike");
            vehicle1.setVehicleNumber(2);



            session.save(userDetails1);
            session.save(vehicle1);
            session.save(vehicle);
            // session.save(homeAddress);




            session.getTransaction().commit();
            session.close();

            System.out.println("Exist Main");
        }
    }
