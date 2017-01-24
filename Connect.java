/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package loancalculator;

/**
 *
 * @author sanjok
 */
import java.sql.*;

public class Connect {

    Connection con;
    Statement stat;
    ResultSet rs;

    public Connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbros", "root", "dngl");
            stat = con.createStatement();
            System.out.println("connected");
        } catch (Exception ex) {
            System.out.println("COnnect class 1:" + ex);
        }
    }

    public Connection getConnect() {
        return con;
    }
    
    public Statement getStmt(){
        Statement stmt=null;
       try{
           stmt = this.getConnect().createStatement();
       }catch(Exception ex){}
        
        return stmt;
    }
    

    public ResultSet getRecords(String query) {
        try {
            ResultSet rs = stat.executeQuery(query);
        } catch (Exception ex) {
            System.out.println("COnnect class 2:" + ex);
        }
        return rs;
    }
    
    

    

}
