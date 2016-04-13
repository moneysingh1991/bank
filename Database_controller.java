/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package cs_146_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author maninderpalsingh
 */
public class Database_controller {
    
    private String url = "jdbc:mysql://localhost:3306/Bank";
    private String userid = "root";
    private String password = "";
    private String sql = "";

    ResultSetMetaData md = null;
    int numRowsChanged;
    
    String primarykey = null;
    
    public ResultSetMetaData connect_database() {
        
         try (Connection connection = DriverManager.getConnection( url, userid, password );
           // Statement stmt = connection.createStatement();
            //ResultSet rs = stmt.executeUpdate()( sql ))
                 PreparedStatement pst =  connection.prepareStatement(sql))
                 
           {
               pst.executeUpdate(sql);
   
          //  md = rs.getMetaData();
             
        } catch (SQLException e)
        {
            System.out.println( e.getMessage() );
        }
        
         return md;
    }
    
    public void set_sql(String s) {
        sql = s; 
    }
    
    public String get_sql() {
        return sql;
    }
    
    public void insert_client_into_db() {
        Client c = new Client();

        
        sql = "INSERT INTO `Bank`.`Client` (`FirstName`, `LastName`, `SocialSecurity`, `Dob`, `Address`, `PhoneNumber`) "
                + "VALUES ('"+c.getFirstName()+"', '"+c.getLastName()+"', '"+c.getSocialSecurityNumber()+"', '"+c.getDob()+"', '"+c.address()+"', '"+c.getPhoneNumbe()+"')";

        
        connect_database();
        
        System.out.println(c.getFirstName()+"', '"+c.getLastName()+"', '"+c.getSocialSecurityNumber()+"', '"+c.getDob()+"', '"+c.address()+"', '"+c.getPhoneNumbe());
        
        
       
    }
    
    public ArrayList getData_from_client_table() throws SQLException {
        
        ArrayList row = null;
        
        
        Connection connection = DriverManager.getConnection( url, userid, password );
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery( sql );
        
            ResultSetMetaData md = rs.getMetaData();
            int columns = md.getColumnCount();
        
        
        if(columns > 0) {
            
            System.out.println(columns + " found");
            
            while (rs.next())
            {
                row = new ArrayList(columns);

                for (int i = 1; i <= columns; i++)
                {
                    row.add( rs.getObject(i) );
                    
                    
                }
            }
            
        }

       return row;
    }
    
    public ArrayList getData_from_Account_table() throws SQLException {
        
        ArrayList row = null;
        
        
        Connection connection = DriverManager.getConnection( url, userid, password );
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery( sql );
        
            ResultSetMetaData md = rs.getMetaData();
            int columns = md.getColumnCount();
        
        
        if(columns > 0) {
            
            System.out.println(columns + " found");
            
            while (rs.next())
            {
                row = new ArrayList(columns);

                for (int i = 1; i <= columns; i++)
                {
                    row.add( rs.getObject(i) );
                    
                    
                }
            }
            
        }

       return row;
    }
    
    public void update_execute_sql_statement() throws SQLException {
        try (Connection connection = DriverManager.getConnection( url, userid, password );
           // Statement stmt = connection.createStatement();
            //ResultSet rs = stmt.executeUpdate()( sql ))
                 PreparedStatement pst =  connection.prepareStatement(sql))
                 
           {
               pst.executeUpdate(sql);
   
          //  md = rs.getMetaData();
             
        } catch (SQLException e)
        {
            System.out.println( e.getMessage() );
        }
    }
    
    public boolean check_db_exist() throws SQLException {
       
        Connection connection = DriverManager.getConnection( url, userid, password );
        
        Statement stmt = connection.createStatement();
        
        ResultSet rs = stmt.executeQuery( sql );
        
        
        ResultSetMetaData md = rs.getMetaData();
        
        int columns = md.getColumnCount();
        
        if(columns > 0) {
        
            return true;
        
        } else {
        
            return false;
        }
        
    }
    
    public String get_primary_key() throws SQLException {
        
        String key = null;
        
        ArrayList arr = null;
        
        if(check_db_exist()) {
            arr = getData_from_Account_table();
        }
        
        return arr.get(0).toString();
    }
  
}
