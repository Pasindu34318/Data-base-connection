
package dao;

import java.sql.*;
import util.DBConnection;

public class UserDao {
    
    // Method to insert data 
    public boolean insertUser(String username, String email) {
        
        String query = "INSERT INTO users (username, email) VALUES (?, ?)";
        
        try (Connection conn = DBConnection.getConnection();
               PreparedStatement stmt = conn.prepareStatement(query)) {
            if (conn != null) {
                System.out.println("Database connection is successful!");}
                   stmt.setString(1, username);
                   stmt.setString(2, email);
                   int rowInserted = stmt.executeUpdate();
                   return rowInserted > 0;
            
        } catch (SQLException e) {
            e.printStackTrace();
                return false;
        }
    }
    
    
     // Method to delete user
    public boolean deleteUser(int id) {
        String sql = "DELETE FROM users WHERE id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            int rowsDeleted = stmt.executeUpdate();
            return rowsDeleted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
}
