
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class JavaConnect {

Connection conn = null;

public static Connection connect(){
    
    try {
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Mohammad Zahid\\Documents\\NetBeansProjects\\BankingProject\\Bank.db");
        return conn;
        
       
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, ex);
        return null;
    }
}



  
}
      
   
    

    

