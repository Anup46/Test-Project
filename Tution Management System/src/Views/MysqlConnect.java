 
package Views;

import java.sql.*;
import javax.swing.*;


/**
 *
 * 
 */
public class MysqlConnect {
    Connection con= null;
    public static Connection ConnectDB(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection con= DriverManager.getConnection("jdbc:sqlite:Tution.db"); 
            return con;
        
        }
        catch(Exception e){
JOptionPane.showMessageDialog(null, e);
      } 
        return null;
   }      
    
 }
