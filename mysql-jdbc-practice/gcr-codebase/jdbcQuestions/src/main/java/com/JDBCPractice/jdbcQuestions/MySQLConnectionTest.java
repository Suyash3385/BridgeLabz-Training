package com.JDBCPractice.jdbcQuestions;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnectionTest {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/"; 
        String username = "root";
        String password = "root@123";

        try (Connection conn = DriverManager.getConnection(url, username, password)) {

            if (conn != null) {
                System.out.println("✅ Connected to MySQL successfully!");
            }

        } catch (SQLException e) {
            System.out.println("❌ Connection failed!");
            e.printStackTrace();
        }
    }
}