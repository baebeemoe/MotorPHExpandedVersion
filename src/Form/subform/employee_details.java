/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Form.subform;

import Form.Dashboard;
import Form.subform.UpdateForm;
import Methods.DatabaseManager;
import com.mysql.cj.xdevapi.Statement;
import com.sun.jdi.connect.spi.Connection;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Types;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Default
 */
public class employee_details extends javax.swing.JFrame {
    java.sql.Connection con = null;
    PreparedStatement pstmt = null;
    private DatabaseManager dbManager;
    ResultSet rs = null;  
    
    public JTable getEmployee_table() {
        return employee_table;
    }

  
    public employee_details() {
        initComponents();
    }
    
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Addbtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        employee_table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setText("Employee Details");
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));

        Addbtn.setText("Add");
        Addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddbtnActionPerformed(evt);
            }
        });

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Delete");

        employee_table.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, new java.awt.Color(204, 51, 0)));
        employee_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "EmployeeID", "Name", "Birthdate", "Address", "Phone No", "SSS No", "Pagibig No", "Philhealth No", "TIN", "Position", "Department ", "Status"
            }
        ));
        jScrollPane1.setViewportView(employee_table);

        jScrollPane2.setViewportView(jScrollPane1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 765, Short.MAX_VALUE)
                                .addComponent(Addbtn)
                                .addGap(27, 27, 27)
                                .addComponent(jButton2)
                                .addGap(27, 27, 27)
                                .addComponent(jButton3))
                            .addComponent(jScrollPane2))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(19, 894, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Addbtn)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        UpdateForm updateform = new UpdateForm();
    int selectedRow = employee_table.getSelectedRow();
    if (selectedRow != -1) {
        // Get data from the selected row and handle types appropriately
        Object empIDObj = employee_table.getValueAt(selectedRow, 0);
        String empID = empIDObj != null ? empIDObj.toString() : null;

        dbManager = new DatabaseManager();
        con = dbManager.getConnection();

        try {
            String query = "SELECT * FROM `employee` WHERE employeeID = ?";
            try (PreparedStatement pstmt = con.prepareStatement(query)) {
                pstmt.setString(1, empID);

                // Execute the query
                try (ResultSet rs = pstmt.executeQuery()) {
                    if (rs.next()) {
                        String employeeID = rs.getString("employeeID");
                        String lastName = rs.getString("lastName");
                        String firstName = rs.getString("firstName");
                        java.util.Date birthDate = rs.getDate("birthDate");
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
                        // Handling Integer to String conversion for supervisorID and basicSalaryID
                        String supervisorID = rs.getObject("supervisorID") != null ? rs.getObject("supervisorID").toString() : null;
                        String basicSalaryID = rs.getObject("basicSalaryID") != null ? rs.getObject("basicSalaryID").toString() : null;

                        // Populate the UpdateForm with the fetched data
                        updateform.setEmployeeID(employeeID);
                        updateform.setLastname(lastName);
                        updateform.setFirstname(firstName);
                        updateform.setBirthDate(birthDate);
                        updateform.setStreetAddress(streetAddress);
                        updateform.setCity(city);
                        updateform.setProvince(province);
                        updateform.setZip(zip);
                        updateform.setPhoneNo(phoneNo);
                        updateform.setEmail(email);
                        updateform.setSssNo(sssNo);
                        updateform.setPhilhealthNo(philhealthNo);
                        updateform.setTin(tin);
                        updateform.setPagibigNo(pagibigNo);
                       updateform.setPositionComboBox(positionID);
                       updateform.setDepartmentComboBox(depID);
                       updateform.setStatusComboBox(status);
                       updateform.setBasicSalaryComboBox(basicSalaryID);
                       updateform.setSupervisorComboBox(supervisorID);

                        // Show the update form
                        updateform.setVisible(true);
                        this.show(false);

                    } else {
                        JOptionPane.showMessageDialog(this, "Error Loading Information");
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    } else {
        JOptionPane.showMessageDialog(this, "Please select a row to update.", "No Row Selected", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void AddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddbtnActionPerformed
          JFileChooser fileChooser = new JFileChooser();
    int returnValue = fileChooser.showOpenDialog(null);
    if (returnValue == JFileChooser.APPROVE_OPTION) {
        File selectedFile = fileChooser.getSelectedFile();
        importCSV(selectedFile);
    }
}     

private void importCSV(File file) {
     DatabaseManager dbManager = new DatabaseManager();
  

    try {
        con = dbManager.getConnection();
        pstmt = con.prepareStatement("INSERT INTO employee (lastName, firstName, birthDate, streetAddress, city, province, zip, phoneNo, email, sssNo, philhealthNo, tin, pagibigNo, positionID, depID, status, supervisorID, basicSalaryID) " +
                                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            for (int i = 1; i < data.length; i++) {
                data[i] = data[i].replaceAll("\"", "").trim(); // Remove surrounding quotes and trim whitespace
            }

            pstmt.setString(1, data[1]);     // lastName
            pstmt.setString(2, data[2]);     // firstName
            pstmt.setString(3, data[3]);     // birthDate
            pstmt.setString(4, data[4]);     // streetAddress
            pstmt.setString(5, data[5]);     // city
            pstmt.setString(6, data[6]);     // province
            pstmt.setString(7, data[7]);     // zip
            pstmt.setString(8, data[8]);     // phoneNo
            pstmt.setString(9, data[9]);     // email
            pstmt.setString(10, data[10]);   // sssNo
            pstmt.setString(11, data[11]);   // philhealthNo
            pstmt.setString(12, data[12]);   // tin
            pstmt.setString(13, data[13]);   // pagibigNo
            pstmt.setString(14, data[14]);   // positionID
            pstmt.setString(15, data[15]);   // depID
            pstmt.setString(16, data[16]);   // status
            
            if ("NULL".equals(data[17])) {
                pstmt.setNull(17, Types.INTEGER);  // supervisorID as NULL
            } else {
                pstmt.setInt(17, Integer.parseInt(data[17]));  // Assuming supervisorID is an integer
            }
            
            pstmt.setString(18, data[18]);   // basicSalaryID

            pstmt.executeUpdate();
        }

        JOptionPane.showMessageDialog(this, "CSV data imported successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
         dbManager.refreshEmployeeDetailsView();
         this.show(false);
    
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error importing CSV: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        try {
            if (pstmt != null) {
                pstmt.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
   
    }//GEN-LAST:event_AddbtnActionPerformed



    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(employee_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(employee_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(employee_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(employee_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employee_details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addbtn;
    private javax.swing.JTable employee_table;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
