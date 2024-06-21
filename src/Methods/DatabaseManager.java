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
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/newdummy", "root", "");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return con;
    }
    
    public void refreshEmployeeDetailsView() {
        
    employee_details emp = new employee_details();
     try {
        // Refresh the JTable with the data from the employee table
        String query = "SELECT * FROM employee";
        try (Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            DefaultTableModel model = (DefaultTableModel) emp.getEmployee_table().getModel();
            model.setRowCount(0);

            while (rs.next()) {
                int employeeID = rs.getInt("employeeID");
                String lastName = rs.getString("lastName");
                String firstName = rs.getString("firstName");
                Date birthDate = rs.getDate("birthDate");
                String streetAddress = rs.getString("streetAddress");
                String city = rs.getString("city");
                String province = rs.getString("province");
                String zip = rs.getString("zip");
                String phoneNo = rs.getString("phoneNo");
                String email = rs.getString("email");
                String sssNo = rs.getString("sssNo");
                String philhealthNo = rs.getString("philhealthNo");
                String tin = rs.getString("tin");
                String pagibigNo = rs.getString("pagibigNo");
                String positionID = rs.getString("positionID");
                String depID = rs.getString("depID");
                String status = rs.getString("status");
                Integer supervisorID = (Integer) rs.getObject("supervisorID");
                String basicSalaryID = rs.getString("basicSalaryID");

                model.addRow(new Object[]{employeeID, lastName, firstName, birthDate, streetAddress, city, province, zip, phoneNo, email, sssNo, philhealthNo, tin, pagibigNo, positionID, depID, status, supervisorID, basicSalaryID});
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(emp, "Error refreshing data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
     
     emp.show(true);
     
    }
    
    

    
}
