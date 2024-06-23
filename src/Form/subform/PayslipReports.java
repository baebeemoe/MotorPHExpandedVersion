/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Form.subform;

import Methods.DatabaseManager;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Default
 */
public class PayslipReports extends javax.swing.JFrame {
    private DatabaseManager dbManager;
    private Connection con;
    private PreparedStatement pstmt;
    private ResultSet rs;
    /**
     * Creates new form PayslipReports
     */
    public PayslipReports() {
        initComponents();
        
         // Add a listener for row selection in your JTable
        Payrollreportstbl.getSelectionModel().addListSelectionListener(event -> {
            if (!event.getValueIsAdjusting()) {
                try {
                    handleTableRowSelection(Payrollreportstbl);
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(PayslipReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    java.util.logging.Logger.getLogger(PayslipReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
            }
        });
    }

    
    
    public JTable getPayrollreportstbl() {
        return Payrollreportstbl;
    }
    
 private void fetchPayslipDetailsByEmployeeID(String payslipNo, String empID) {
    System.out.println("Fetching details for PayslipNo: " + payslipNo + " and EmployeeID: " + empID); // Debug statement
    Payslip payslip = new Payslip();
    DatabaseManager dbManager = new DatabaseManager();
    Connection con = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    try {
        con = dbManager.getConnection(); // Ensure getConnection() returns a valid Connection object
        String query = "SELECT * FROM payslip_view WHERE PayslipNo = ? AND EmployeeID = ?";
        pstmt = con.prepareStatement(query); // This should not be underlined in red if con is of type java.sql.Connection
        pstmt.setString(1, payslipNo);
        pstmt.setString(2, empID);
        rs = pstmt.executeQuery();

        if (rs.next()) {
            String payperiodID = rs.getString("PayslipNo");
            String employeeID = rs.getString("EmployeeID");
            String name = rs.getString("Name");
            String startdate = rs.getString("StartDate");
            String enddate = rs.getString("EndDate");
            String position = rs.getString("Position_Departmet");
            String monthlyrate = rs.getString("BasicSalary");
            String dailyrate = rs.getString("DailyRate");
            String daysworked = rs.getString("DaysWorked");
            String overtime = rs.getString("Overtime");
            String grosssalary = rs.getString("GrossSalary");
            String rice = rs.getString("Rice");
            String clothing = rs.getString("Clothing");
            String phone = rs.getString("Phone");
            String totalben = rs.getString("TotalAllowance");
            String sss = rs.getString("SSS");
            String pagibig = rs.getString("PagIbig");
            String philhealth = rs.getString("Philhealth");
            String tax = rs.getString("Tax");
            String totaldeduction = rs.getString("TotalDeduction");
            String netpay = rs.getString("Netpay");

            payslip.setPayslipNo(payperiodID);
            payslip.setEmpNo(employeeID);
            payslip.setSetemployeeName(name);
            payslip.setSetstardate(startdate);
            payslip.setSetendDate(enddate);
            payslip.setSetposition(position);
            payslip.setSetbasicsalary(monthlyrate);
            payslip.setSetdailyrate(dailyrate);
            payslip.setSetdaysworked(daysworked);
            payslip.setSetovertime(overtime);
            payslip.setSetgrossincome(grosssalary);
            payslip.setSetrice(rice);
            payslip.setSetclothing(clothing);
            payslip.setSetphone(phone);
            payslip.setSettotalbenefit(totalben);
            payslip.setSetsss(sss);
            payslip.setSetphilhealth(philhealth);
            payslip.setSetpagibig(pagibig);
            payslip.setSettax(tax);
            payslip.setSettotalDeduction(totaldeduction);
            payslip.setSetnetPay(netpay);

            payslip.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "No data found for PayslipNo: " + payslipNo + " and EmployeeID: " + empID);
        }
    } catch (SQLException ex) {
        Logger.getLogger(PayslipReports.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        try {
            if (rs != null) rs.close();
            if (pstmt != null) pstmt.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            Logger.getLogger(PayslipReports.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
  
  public BufferedImage capturePanelAsImage() {
        Dimension size = jPanel1.getSize();
        BufferedImage image = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = image.createGraphics();
        jPanel1.paint(g2);
        g2.dispose();
        return image;
        
    }
    
    // Method to handle table row selection
    public void handleTableRowSelection(JTable table) throws SQLException, IOException {
        int selectedRow = table.getSelectedRow();
        if (selectedRow >= 0) {
            String empID = table.getValueAt(selectedRow, 1).toString(); 
            String payslipNo = table.getValueAt(selectedRow, 0).toString();
// Assuming EmployeeID is in the second column (index 1)
            fetchPayslipDetailsByEmployeeID(payslipNo,empID);
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row first.");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Payrollreportstbl = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, new java.awt.Color(204, 0, 204)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Payslip Reports");

        Payrollreportstbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Payslip No ", "Employee ID", "Name", "Position/Department", "Total Allowance ", "Total Deduction", "Net Pay"
            }
        ));
        jScrollPane1.setViewportView(Payrollreportstbl);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1375, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setText("Download");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Save PDF File");

        // Set default file name and extension filter
        fileChooser.setSelectedFile(new File("payslip.pdf"));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("PDF files (*.pdf)", "pdf");
        fileChooser.setFileFilter(filter);

        // Show save dialog
        int userSelection = fileChooser.showSaveDialog(PayslipReports.this);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            String filePath = fileToSave.getAbsolutePath();

            // Ensure the file ends with ".pdf"
            if (!filePath.toLowerCase().endsWith(".pdf")) {
                fileToSave = new File(filePath + ".pdf");
            }

            // Capture content pane as an image
            BufferedImage image = capturePanelAsImage();

            // Example: Create a PDF document with a custom size
            float desiredWidth = 310; // Specify your desired width in points (1 inch = 72 points)
            float desiredHeight = 145; // Specify your desired height in points
            Document document = new Document(new com.itextpdf.text.Rectangle(desiredWidth, desiredHeight));

            try {
                PdfWriter.getInstance(document, new FileOutputStream(fileToSave));
                document.open();

                // Convert BufferedImage to iText Image
                Image pdfImage = Image.getInstance(image, null);

                // Example: Scale image to fit within the specified dimensions
                pdfImage.scaleToFit(desiredWidth, desiredHeight);

                // Add image to PDF
                pdfImage.setAbsolutePosition(0, 0); // Position image at top-left corner
                document.add(pdfImage);

            } catch (DocumentException | IOException ex) {
                ex.printStackTrace();
            } finally {
                if (document != null) {
                    document.close();
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(PayslipReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PayslipReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PayslipReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PayslipReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PayslipReports().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Payrollreportstbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
