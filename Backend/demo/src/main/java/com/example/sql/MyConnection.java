package com.example.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MyConnection {
    static String jdbcUrl = "jdbc:mysql://localhost:3306/LatinoAmerika"; // Replace "localhost" with your MySQL server IP or hostname, and "mydatabase" with your database name
    static String username = "root"; // Replace with your MySQL username
    static String password = "VesnaMima1!2@";

    static Connection connection;

    static {
        try {
            connection = DriverManager.getConnection(jdbcUrl, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public static void  openConnection() throws ClassNotFoundException, SQLException {
        try {
            // Step 1: Register the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Establish the connection
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // Step 3: Use the connection (perform database operations)

            // Step 4: Close the connection
            connection.close();

            System.out.println("Connection to MySQL server established successfully!");
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection to MySQL failed!");
            e.printStackTrace();
        }
    }

    public static void closeConnection() {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
