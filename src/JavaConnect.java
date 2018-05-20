
import java.sql.*;
import javax.swing.*;


public class JavaConnect {

      Connection conn = null;
      
    public static Connection connect() {
      
        try {
            // db parameters
            Class.forName("org.sqlite.JDBC");
            // create a connection to the database
           Connection conn = DriverManager.getConnection("C:\\Users\\Mohammad Zahid\\Documents\\NetBeansProjects\\BankingProject\\bank.db");
             return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return null;
    }
}
