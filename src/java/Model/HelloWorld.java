/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author saint luang
 */
public class HelloWorld {
   private String data;
     HelloWorld hl = null   ;
     
  public String getData() throws ClassNotFoundException, SQLException{
        Connection con = ConnectionBuilder.getConnection();
        java.sql.PreparedStatement pstm = con.prepareStatement("select data from hellodb where dataid = 2");
        ResultSet rs = pstm.executeQuery();
        while(rs.next()){
           hl = new HelloWorld();
           hl.data  = rs.getString("data");
           
        }
        pstm.close();
        con.close();
        
        return hl.data;
   }
  
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        HelloWorld h =  new HelloWorld();
        String data = h.getData();
        
        System.out.println(data);
        }
  
    
}
