/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.*;



/**
 *
 * @author User
 */
public class DBConnection {
    
    private static final String DBURL = "jdbc:mysql://localhost:3306/in-class-assignment";
    private static final String USER = "root";
    private static final String PASS = "";
    
    public static Connection getConnection() throws SQLException {
        Connection connection = null;
        
        try {
            //Load the MYSQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Estabilish the Connection
            connection = DriverManager.getConnection(DBURL, USER, PASS);
            System.out.println("Connection Successfull");
        } catch(ClassNotFoundException e) {
            System.err.println("JDBC Driver not found " + e.getMessage());
        } catch(SQLException e) {
            System.err.println("Database Connection error " + e.getMessage());
        }
        
        return connection;
    }
}
