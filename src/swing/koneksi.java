/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Z
 */
public class koneksi {
Connection conn = null;
    public static Connection ConnectDB(){
        try{
                Class.forName("com.mysql.jdbc.Driver");
            //Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull","root","");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","");
            JOptionPane.showMessageDialog(null, "Connection Success!");
            return conn;
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Connection Failure!");
            return null;
        }    
}
}
