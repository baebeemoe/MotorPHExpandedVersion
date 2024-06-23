/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Form.subform;

import Methods.DatabaseManager;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

/**
 *
 * @author Default
 */
public class IncidentReportsForm extends javax.swing.JFrame {
 private DatabaseManager dbManager;
    java.sql.Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;  
    /**
     * Creates new form IncidentReportsForm
     */
    public IncidentReportsForm() {
        initComponents();
       
    }

    public JTable getjTable2() {
        return jTable2;
    }

   // Private method to initialize GUI components
 
    private void customizeComponents() {
        // Example: Add a JTable to display incident reports
        jTable2 = new JTable();

        // Set up table model with column names
        DefaultTableModel model = new DefaultTableModel(
                new Object[][]{},
                new String[]{"Incident Report ID", "Employee ID", "Date", "Issue", "Description", "Status"}
        );
        jTable2.setModel(model);

        // Add table to a scroll pane and add the scroll pane to the frame
        JScrollPane scrollPane = new JScrollPane(jTable2);
        add(scrollPane, java.awt.BorderLayout.CENTER);

        // Example: Set default close operation
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        // Pack the frame to adjust its size based on its contents
        pack();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.pink));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "incidentreportID", "employeeID", "date", "issue", "description", "status"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Incident Reports");

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("User Records");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 335, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(329, 329, 329))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Get the table model for jTable2
    DefaultTableModel model = (DefaultTableModel) jTable2.getModel();

    // Iterate through the rows in the table model
    for (int row = 0; row < model.getRowCount(); row++) {
        int incidentreportID = (int) model.getValueAt(row, 0); // assuming incidentreportID is in the first column
        String employeeID = (String) model.getValueAt(row, 1);
        String date = (String) model.getValueAt(row, 2);
        String issue = (String) model.getValueAt(row, 3);
        String description = (String) model.getValueAt(row, 4);
        String status = (String) model.getValueAt(row, 5);

        // Construct the SQL UPDATE statement
        String updateSql = "UPDATE incidentreports SET employeeID = ?, date = ?, issue = ?, description = ?, status = ? WHERE incidentreportID = ?";

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/newdummy", "root", "");
             PreparedStatement stmt = con.prepareStatement(updateSql)) {

            // Set parameters for the prepared statement
            stmt.setString(1, employeeID);
            stmt.setString(2, date);
            stmt.setString(3, issue);
            stmt.setString(4, description);
            stmt.setString(5, status);
            stmt.setInt(6, incidentreportID);

            // Execute the update
            int rowsUpdated = stmt.executeUpdate();

             if (rowsUpdated > 0) {
                System.out.println("Record updated successfully for incidentreportID: " + incidentreportID);
                JOptionPane.showMessageDialog(this, "Record updated successfully for incidentreportID: " + incidentreportID);
            } else {
                System.out.println("No records updated for incidentreportID: " + incidentreportID);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

UserForm inc = new UserForm();
    // Get database connection
    dbManager = new DatabaseManager();
    con = dbManager.getConnection();
// SQL query to retrieve data from the incidentreports table
        String sql = "SELECT userID, employeeID, password, roleID FROM user";

        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            // Get the table model for jTable2
            DefaultTableModel model = (DefaultTableModel) inc.getjTable2().getModel();

            // Clear existing rows
            model.setRowCount(0);

            // Iterate through the result set and populate the table model
            while (rs.next()) {
                int incidentreportID = rs.getInt("userID");
                String employeeID = rs.getString("employeeID");
                String date = rs.getString("password");
                String issue = rs.getString("roleID");
               

                // Add row to the table model
                model.addRow(new Object[]{incidentreportID, employeeID, date, issue});
                
                // Debug statement to verify row addition
                System.out.println("Added row: " + incidentreportID + ", " + employeeID + ", " + date + ", " + issue );
            }

            // Set the custom cell editor for the "Status" column
            JComboBox<String> comboBox = new JComboBox<>(new String[]{"password", "password01"});
            inc.getjTable2().getColumnModel().getColumn(3).setCellEditor(new DefaultCellEditor(comboBox));

            // Refresh the table view
            inc.getjTable2().repaint();

        } catch (SQLException e) {
            e.printStackTrace();
        }

   

    // Ensure the form is visible after data population
    inc.setVisible(true);





        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(IncidentReportsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IncidentReportsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IncidentReportsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IncidentReportsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IncidentReportsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
