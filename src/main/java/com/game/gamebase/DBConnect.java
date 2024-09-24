package com.game.gamebase;
import java.sql.*;

public class DBConnect {
    public static Connection connect() throws SQLException {
    try {
        Connection res = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "system","emankamran");
        if (res != null) {
            System.out.println("Connection working");
        } else {
            System.out.println("Failed to make connection!");
        }
        return res;
    } catch (SQLException e) {
        System.out.println("Connection Failed! Check output console");
        throw e;
    }
}}