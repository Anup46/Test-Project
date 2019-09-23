 
package Database;

import java.sql.*;

 
public class Database {
    
    private Connection con;
    private String url;
    
    
    public Database() {
        url = "jdbc:sqlite:Tution.db";   
    }
    
    public Connection getConnection() {
        //loading driver
        try {
            Class.forName("org.sqlite.JDBC");
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
        try {
           con = DriverManager.getConnection(url); 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return con;
    }
    
}
