package com.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {

    public static void main(String[] args) throws Exception  {
        System.out.println("-------- MySQL JDBC Connection Testing ------------");
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("MySQL JDBC Driver Registered!");
        Connection connection = null;
        while(connection == null) {
            try {
                connection = DriverManager.getConnection(
                    "jdbc:mysql://mysql:3306/mysql", "root", "root");
            } catch (SQLException e) {
                System.out.println("Can't establish SQL connection yet.");
                Thread.sleep(500);
            }
        }
        if (connection != null) {
            System.out.println("You are now successfully connected to SQL database!");
        } else {
            System.out.println("Failed to make connection!");
        }
    }
}
