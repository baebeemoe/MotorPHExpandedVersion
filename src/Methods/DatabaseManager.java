/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Methods;

import Form.subform.employee_details;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Default
 */
public class DatabaseManager {
    
    private Connection con;

    public DatabaseManager() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/dummy", "root", "");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return con;
    }
    
    public void refreshEmployeeDetailsView() {
        
        employee_details emp = new employee_details();
    DatabaseManager dbManager = new DatabaseManager();
    try (Connection con = dbManager.getConnection();
         Statement stmt = con.createStatement();
         ResultSet resultSet = stmt.executeQuery("SELECT * FROM employee_details")) {

        DefaultTableModel tableModel = (DefaultTableModel) emp.getEmployee_table().getModel();
        tableModel.setRowCount(0); // Clear existing data

        // Get column names
        if (tableModel.getColumnCount() == 0) {
            int columnCount = resultSet.getMetaData().getColumnCount();
            Vector<String> columnNames = new Vector<>();
            for (int i = 1; i <= columnCount; i++) {
                columnNames.add(resultSet.getMetaData().getColumnName(i));
            }
            tableModel.setColumnIdentifiers(columnNames);
        }

        // Get rows
        while (resultSet.next()) {
            Vector<Object> row = new Vector<>();
            row.add(resultSet.getString("employeeID"));
            row.add(resultSet.getString("name"));
            row.add(resultSet.getString("birthDate"));
            row.add(resultSet.getString("address"));
            row.add(resultSet.getString("phoneNo"));
            row.add(resultSet.getString("sssNo"));
            row.add(resultSet.getString("pagibigNo"));
            row.add(resultSet.getString("philhealthNo"));
            row.add(resultSet.getString("tin"));
            row.add(resultSet.getString("position"));
            row.add(resultSet.getString("department"));
            row.add(resultSet.getString("status"));
            tableModel.addRow(row);
        }

        // Log success message
        System.out.println("Employee details view refreshed successfully.");
        
        
        emp.getEmployee_table().repaint();
        
        
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(emp, "Error refreshing employee details: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    
}
