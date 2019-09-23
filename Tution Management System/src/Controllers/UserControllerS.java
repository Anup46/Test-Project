 
package Controllers;

import Database.Database;
import Models.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

 
public class UserControllerS extends User{
    
    Database db;
    Connection con;
    PreparedStatement pst;
    
    public UserControllerS() {
        super();
        db = new Database();
        con = db.getConnection();
    }
    
    public int createAccount(User u) {
        int res = 0;
        String sql = "";
        
        try {
            sql = "INSERT INTO userS(`id`,`name`,`email`,`password`) VALUES(NULL, ?, ?, ?)";
            pst = con.prepareStatement(sql);
            
            pst.setString(1, u.getName());
            pst.setString(2, u.getEmail());
            pst.setString(3, u.getPassword());
            
            res = pst.executeUpdate();
            pst.close();
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return res;
    }
    
    
}
