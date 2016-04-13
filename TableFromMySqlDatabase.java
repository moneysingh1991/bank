/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

package cs_146_project;

import java.awt.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

public class TableFromMySqlDatabase extends JFrame

{
    
    String url = "jdbc:mysql://localhost:3306/Bank";
    String userid = "root";
    String password = "";
    String sql = "";
    
    
    public void connect_database() {
        
    }
    public TableFromMySqlDatabase() throws SQLException
    {
        
        
        ArrayList columnNames = new ArrayList();
        ArrayList data = new ArrayList();
        
        //sql = "SELECT * FROM person";
        
        sql = "SELECT * from Client";
        
        try (Connection connection = DriverManager.getConnection( url, userid, password );
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery( sql ))
        {
            ResultSetMetaData md = rs.getMetaData();
            int columns = md.getColumnCount();
            
            //  Get column names
            for (int i = 1; i <= columns; i++)
            {
                columnNames.add( md.getColumnName(i) );
            }
            
            //  Get row data
            while (rs.next())
            {
                ArrayList row = new ArrayList(columns);
                
                for (int i = 1; i <= columns; i++)
                {
                    row.add( rs.getObject(i) );
                }
                
                data.add( row );
            }
        }
        catch (SQLException e)
        {
            System.out.println( e.getMessage() );
        }
        
        // Create Vectors and copy over elements from ArrayLists to them
        // Vector is deprecated but I am using them in this example to keep
        // things simple - the best practice would be to create a custom defined
        // class which inherits from the AbstractTableModel class
        Vector columnNamesVector = new Vector();
        Vector dataVector = new Vector();
        
        for (int i = 0; i < data.size(); i++)
        {
            ArrayList subArray = (ArrayList)data.get(i);
            Vector subVector = new Vector();
            for (int j = 0; j < subArray.size(); j++)
            {
                subVector.add(subArray.get(j));
            }
            dataVector.add(subVector);
        }
        
        for (int i = 0; i < columnNames.size(); i++ )
            columnNamesVector.add(columnNames.get(i));
        
        //  Create table with database data
        JTable table = new JTable(dataVector, columnNamesVector)
                
        {
            public Class getColumnClass(int column)
            {
                for (int row = 0; row < getRowCount(); row++)
                {
                    Object o = getValueAt(row, column);
                    
                    if (o != null)
                    {
                        return o.getClass();
                    }
                }
                
                return Object.class;
            }
        };
        
        JScrollPane scrollPane = new JScrollPane( table );
        getContentPane().add( scrollPane );
        
        JPanel buttonPanel = new JPanel();
        getContentPane().add( buttonPanel, BorderLayout.SOUTH );
        
        
        
    }
    
    
    public void addcolumn(String sql) throws SQLException {
        
        this.sql = sql;
        
        Connection connection = DriverManager.getConnection( url, userid, password );
        
        Statement stmt = connection.createStatement();
        
        ResultSet rs = stmt.executeQuery( sql );
        
        rs.close();
        stmt.close();
        connection.close();
        
    }
    
    
    public void run_show_all ()throws SQLException
    {
        TableFromMySqlDatabase frame = new TableFromMySqlDatabase();
        frame.setDefaultCloseOperation( DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main(String[] args) throws SQLException
    {
        // TODO Auto-generated method stub
        TableFromMySqlDatabase frame = new TableFromMySqlDatabase();
        frame.setDefaultCloseOperation( DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        
    }
    
}