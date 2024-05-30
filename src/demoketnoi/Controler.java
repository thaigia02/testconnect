/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoketnoi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class Controler {
    public static Connection getJDBCConnection(){
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password ="1235";
        
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url,user,password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Controler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Controler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
    public static void main(String[] args) {
        Connection conn = getJDBCConnection();
        if(conn != null){
            System.out.println("Ket noi tc");
        }else{
            System.out.println("Thất bại");
        }
    }

    }
        

        
    
