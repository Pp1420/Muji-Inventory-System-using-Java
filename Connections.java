/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InventorySystem;
import java.sql.*;
/**
 *
 * @author ASUS
 */
public class Connections {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String CONN_STRING = "jdbc:mysql://localhost:3306/hershee";
   
    public static Connection getConnection(){
        Connection con = null;
        
        try {
            con = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
            //System.out.println("Connected!");
        }catch (SQLException e){
            System.err.println(e);
        }
        return con;
        
    }
    
}
