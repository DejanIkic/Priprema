package com.example.sql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {

    public static ResultSet getTable(){
        String sql = "SELECT * FROM names"; // Replace "your_table_name" with your actual table name

        // Step 4: Execute the query
        ResultSet resultSet = null;
        PreparedStatement statement = null;
        try {
            statement = MyConnection.connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        // Step 5: Process the results
        return resultSet;
    }
}
