/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Saint Luang
 */
public class ConnectionBuilder {
        public static Connection getConnection() throws ClassNotFoundException{
            Connection con = null;
            String user = "root";
            String password = "root";
            String url = "jdbc:derby://localhost:1527/helloworld";
            
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con  = (Connection) DriverManager.getConnection(url, user, password);
            } catch (SQLException ex) {
               return null;
            }
            
            return con;
        }
        
        public static void main(String[] args) throws ClassNotFoundException {
        Connection con = ConnectionBuilder.getConnection();
        if(con != null){
            System.out.println(con);
        }else{
            System.out.println("fail");
        }
    }
}
