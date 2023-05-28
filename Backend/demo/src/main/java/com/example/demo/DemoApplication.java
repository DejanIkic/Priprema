package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.sql.*;

import java.sql.ResultSet;
import java.sql.SQLException;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws SQLException {

		MyConnection connection = new MyConnection();
		ResultSet resultSet = DAO.getTable();
		while (resultSet.next()) {
			// Retrieve data from the current row
			int id = resultSet.getInt("id"); // Replace with the actual column name
			String name = resultSet.getString("name"); // Replace with the actual column name

			// Do something with the retrieved data
			System.out.println("ID: " + id);
			System.out.println("Name: " + name);
		}

		SpringApplication.run(DemoApplication.class, args);
	}

}
