/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Form.subform;

import Form.Dashboard;
import Methods.DatabaseManager;
import com.mysql.cj.xdevapi.Statement;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
/**
 *
 * @author Default
 */
public class OvertimeRequestForm extends javax.swing.JFrame {

    private DatabaseManager dbManager;
    private java.sql.Connection con = null;
    private  Statement stmt = null;
    private Dashboard dashboard;
    private String empID;

    public void setEmployeeid(String employeeiD) {
        empID = employeeiD;
        employeeid.setText(employeeiD);
    }
    
    
    
    
     
     public OvertimeRequestForm(Dashboard dashboard) {
        initComponents();
        this.dashboard = dashboard;
    }
    public OvertimeRequestForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        requestDate = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        startTime = new javax.swing.JComboBox<>();
        endTime = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        Submitbtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        employeeid = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)), "Overtime Request Form", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        requestDate.setPreferredSize(new java.awt.Dimension(0, 28));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Date");

        startTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00:00:00", "01:00:00", "02:00:00", "03:00:00", "04:00:00", "05:00:00", "06:00:00", "07:00:00", "08:00:00", "09:00:00", "10:00:00", "11:00:00", "12:00:00", "13:00:00", "14:00:00", "15:00:00", "16:00:00", "17:00:00", "18:00:00", "19:00:00", "20:00:00", "21:00:00", "22:00:00", "23:00:00", "24:00:00" }));
        startTime.setPreferredSize(new java.awt.Dimension(0, 28));

        endTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00:00:00", "01:00:00", "02:00:00", "03:00:00", "04:00:00", "05:00:00", "06:00:00", "07:00:00", "08:00:00", "09:00:00", "10:00:00", "11:00:00", "12:00:00", "13:00:00", "14:00:00", "15:00:00", "16:00:00", "17:00:00", "18:00:00", "19:00:00", "20:00:00", "21:00:00", "22:00:00", "23:00:00", "24:00:00" }));
        endTime.setPreferredSize(new java.awt.Dimension(0, 28));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Start Time");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("End Time ");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Reason");

        jScrollPane2.setViewportView(jTextPane1);

        Submitbtn.setBackground(new java.awt.Color(255, 153, 0));
        Submitbtn.setForeground(new java.awt.Color(255, 255, 255));
        Submitbtn.setText("Submit Request");
        Submitbtn.setBorderPainted(false);
        Submitbtn.setPreferredSize(new java.awt.Dimension(113, 36));
        Submitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitbtnActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Employee ID:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(startTime, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(28, 28, 28))
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(requestDate, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(endTime, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(employeeid, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Submitbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(employeeid, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(requestDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(endTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Submitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
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

    private void SubmitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitbtnActionPerformed

   Dashboard dashboard = new Dashboard();
     // Assuming you have initialized your DB connection and other variables properly
    dbManager = new DatabaseManager();
    con = dbManager.getConnection();
   
    // Get input values from components
    Date dateFiled = new Date(); // datefiled should be current date
    Date chosenDate = (Date) requestDate.getDate(); // Assuming jdatepicker returns a Date object
    String starttime = (String) startTime.getSelectedItem();
    String endtime = (String) endTime.getSelectedItem();
    String reason = jTextPane1.getText();
    String remarks = "Pending"; // Initial value for remarks
    
    if (isValidTime(starttime, endtime)) {  
        // Convert starttime and endtime to LocalTime
        LocalTime startTimeValue = LocalTime.parse(starttime);
        LocalTime endTimeValue = LocalTime.parse(endtime);
        
        // Calculate accumulated overtime hours
        Duration duration = Duration.between(startTimeValue, endTimeValue);
        long accumulatedOvertime = duration.toHours();
        
        // Get employee ID from dashboardempNolbl (assuming it's a JLabel displaying employee ID)
        int employeeID = Integer.parseInt(empID); // Assuming it's an integer
        
        // Display confirmation dialog before inserting into database
        int option = JOptionPane.showConfirmDialog(this, 
                "Are you sure you want to submit the overtime application?", 
                "Confirmation", JOptionPane.YES_NO_OPTION);
        
        if (option == JOptionPane.YES_OPTION) {
            // Insert into database
            String sql = "INSERT INTO overtimeapplication (employeeID, datefiled, date, starttime, endtime, accumulatedovertime, reason, remarks) "
                       + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            
            try (PreparedStatement stmt = con.prepareStatement(sql)) {
                stmt.setInt(1, employeeID);
                stmt.setDate(2, new java.sql.Date(dateFiled.getTime())); // datefiled (current date)
                stmt.setDate(3, new java.sql.Date(chosenDate.getTime())); // date (chosen date from requestDate)
                stmt.setTime(4, java.sql.Time.valueOf(startTimeValue));
                stmt.setTime(5, java.sql.Time.valueOf(endTimeValue));
                stmt.setLong(6, accumulatedOvertime);
                stmt.setString(7, reason);
                stmt.setString(8, remarks);
                
                int rowsAffected = stmt.executeUpdate();
                
                if (rowsAffected > 0) {
                    System.out.println("Overtime application inserted successfully.");
                    requestDate.setDate(null); // Clear date picker
                    startTime.setSelectedIndex(0); // Reset combobox to first item
                    endTime.setSelectedIndex(0); // Reset combobox to first item
                    jTextPane1.setText(""); 
                } else {
                    System.out.println("Failed to insert overtime application.");
                    // Handle failure scenario
                }
            } catch (SQLException ex) {
                Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } else {
            System.out.println("Overtime application submission cancelled.");
            // Optionally, provide feedback or perform actions if submission is cancelled
        }
        
    } else {
        // Show error message for invalid time range
        JOptionPane.showMessageDialog(this, "End time should be after start time.", "Error", JOptionPane.ERROR_MESSAGE);
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_SubmitbtnActionPerformed

    private boolean isValidTime(String startTime, String endTime) {
    LocalTime start = LocalTime.parse(startTime);
    LocalTime end = LocalTime.parse(endTime);
    return end.isAfter(start); // End time should be after start time
}
    
    
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
            java.util.logging.Logger.getLogger(OvertimeRequestForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OvertimeRequestForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OvertimeRequestForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OvertimeRequestForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OvertimeRequestForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Submitbtn;
    private javax.swing.JLabel employeeid;
    private javax.swing.JComboBox<String> endTime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextPane jTextPane1;
    private com.toedter.calendar.JDateChooser requestDate;
    private javax.swing.JComboBox<String> startTime;
    // End of variables declaration//GEN-END:variables
}
