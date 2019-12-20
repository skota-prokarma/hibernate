package com.kota.hibernate;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaSeH2Server {

    public static void main(String[] args) {

        String url = "jdbc:h2:tcp://localhost:9092/~/test";
        String user = "sa";
        String passwd = "";

        String query = "SELECT * FROM cars";


        try {
            Connection con = DriverManager.getConnection(url, user, passwd);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                System.out.printf("%d %s %d%n", rs.getInt(1),
                        rs.getString(2), rs.getInt(3));
            }

        } catch (SQLException ex) {


            ex.printStackTrace();
        }
    }
}
