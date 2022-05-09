package org.example;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import static java.sql.DriverManager.getConnection;


public class App {

    public static void main(String args[]) {
        try {
            // connnect to database 'hotel'
            String DB_URL = "jdbc:mysql://localhost:3306/hotel";
            String USER_NAME = "root";
            String PASSWORD = "2002";
            Connection conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            // crate statement
            Statement stmt = conn.createStatement();
            // get data from table 'userInfor'
            ResultSet rs = stmt.executeQuery("select * from `userInfor`");
            // show data
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2)
                        + "  " + rs.getString(3) + " " + rs.getInt(4) + " " + rs.getInt(5) );
            }
            // close connection

        } catch (Exception ex) {

        }

    }



}


