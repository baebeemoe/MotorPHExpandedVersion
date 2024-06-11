/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Methods;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
public class Attendance {
    
    private DatabaseManager dbManager;
    
    public Attendance() {
     dbManager = new DatabaseManager();
     String employee;
     
}
    
    public String punchIn(String employeeID) {
        Connection con = dbManager.getConnection();
        String currentTime = getCurrentTimeFormatted();
        String currentDate = getCurrentDateFormatted();

       try {
            // Check if a record for today already exists
            String selectQuery = "SELECT * FROM attendancerecord WHERE employeeID = ? AND date = ?";
            PreparedStatement selectStmt = con.prepareStatement(selectQuery);
            selectStmt.setString(1, employeeID);
            selectStmt.setString(2, currentDate);
            ResultSet rs = selectStmt.executeQuery();

            if (rs.next()) {
                // Update existing record with punch-in time
                String updateQuery = "UPDATE attendancerecord SET timeIn = ? WHERE employeeID = ? AND date = ?";
                PreparedStatement updateStmt = con.prepareStatement(updateQuery);
                updateStmt.setString(1, currentTime);
                updateStmt.setString(2, employeeID);
                updateStmt.setString(3, currentDate);
                updateStmt.executeUpdate();
            } else {
                // Insert new record for punch-in
                String insertQuery = "INSERT INTO attendancerecord (employeeID, date, timeIn) VALUES (?, ?, ?)";
                PreparedStatement insertStmt = con.prepareStatement(insertQuery);
                insertStmt.setString(1, employeeID);
                insertStmt.setString(2, currentDate);
                insertStmt.setString(3, currentTime);
                insertStmt.executeUpdate();
            }

            JOptionPane.showMessageDialog(null, "Punch in successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
            return currentTime; // Return the punch-in time
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

   public String punchOut(String employeeID) {
        Connection con = dbManager.getConnection();
        String currentTime = getCurrentTimeFormatted();
        String currentDate = getCurrentDateFormatted();

        try {
            // Check if a record for today already exists
            String selectQuery = "SELECT * FROM attendancerecord WHERE employeeID = ? AND date = ?";
            PreparedStatement selectStmt = con.prepareStatement(selectQuery);
            selectStmt.setString(1, employeeID);
            selectStmt.setString(2, currentDate);
            ResultSet rs = selectStmt.executeQuery();

            if (rs.next()) {
                // Update existing record with punch-out time
                String updateQuery = "UPDATE attendancerecord SET timeOut = ? WHERE employeeID = ? AND date = ?";
                PreparedStatement updateStmt = con.prepareStatement(updateQuery);
                updateStmt.setString(1, currentTime);
                updateStmt.setString(2, employeeID);
                updateStmt.setString(3, currentDate);
                updateStmt.executeUpdate();

                JOptionPane.showMessageDialog(null, "Punch out successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
                return currentTime; // Return the punch-out time
            } else {
                JOptionPane.showMessageDialog(null, "No punch-in record found for today!", "Error", JOptionPane.ERROR_MESSAGE);
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    private String getCurrentTimeFormatted(){
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
        return timeFormat.format(new Date());
    }

    public String getCurrentDateFormatted() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        return format.format(new Date());
    }

    
    public boolean hasPunchedOut(String employeeID, String currentDate) {
    Connection con = dbManager.getConnection();
    
    try {
        String selectQuery = "SELECT * FROM attendancerecord WHERE employeeID = ? AND date = ? AND timeOut IS NOT NULL";
        PreparedStatement selectStmt = con.prepareStatement(selectQuery);
        selectStmt.setString(1, employeeID);
        selectStmt.setString(2, currentDate);
        ResultSet rs = selectStmt.executeQuery();
        
        return rs.next(); // Return true if a punch-out record exists for the employee on the current date
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
    
   
}
    
    
    
    
}
