package com.company;

import java.sql.*;


public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/hotel";
        String username = "root";
        String password = "2002";

        System.out.println("Connecting database...");

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Suscessfully!");
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }

    }
}
