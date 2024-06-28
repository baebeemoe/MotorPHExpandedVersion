/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Form;

import Form.subform.ChangePassword;
import Form.subform.IncidentReportsForm;
import Form.subform.LeavelistEmployeeview;
import Form.subform.OvertimeRequestForm;
import Form.subform.OvertimelistEmpView;
import Form.subform.PayrollReports;
import Form.subform.Payslip;
import Form.subform.RequestsforApproval;
import Form.subform.employee_details;
import Methods.Attendance;
import Methods.DatabaseManager;
import com.formdev.flatlaf.FlatLightLaf;
import com.sun.jdi.connect.spi.Connection;
import java.io.File;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.TimeUnit;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Default
 */
public class Dashboard extends javax.swing.JFrame {
    private DatabaseManager dbManager;
    java.sql.Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;  
    private String employeeID;
    private String employeefName;
    private String departmentName;
    

   

    public Dashboard() {
        initComponents();
    }
    public String getEmployeeID() {
        return employeeID;
      
    }
    public String getEmployeeName() {
        return employeefName;
    }
    
     public String getdepartmentName() {
        return departmentName;
    }

    public JPanel getHomePanel() {
        return HomePanel;
    }

    public JPanel getProfilePanel() {
        return ProfilePanel;
    }

    public JPanel getAttendancePanel() {
        return AttendancePanel;
    }

    public JPanel getLeavePanel() {
        return LeavePanel;
    }

    public JLabel getDashboardempNolbl() {
        return dashboardempNolbl;
    }

    public JPanel getPayslipPanel() {
        return PayslipPanel;
    }

 
  
    
    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
        dashboardempNolbl.setText(employeeID);
    }
    
     public void profileName(String name) {
      dashboardempNolbl.setText(name);
    }
    
     public void setEmployeefName(String employeefName) {
        this.employeefName = employeefName;
        dashboardfnamelbl.setText(employeefName);
    }
     
    public void setdepartmentName(String departmentName) {
        this.departmentName = departmentName;
        departmentNamelbl.setText(departmentName);
        
    } 
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        HomePanel = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        timeInlbl = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        timeOutlbl = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        departmentNamelbl = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        scheduleStatuslbl = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        timeInbtn = new javax.swing.JButton();
        timeOutbtn = new javax.swing.JButton();
        itRolebtn = new javax.swing.JButton();
        supervisorRolebtn = new javax.swing.JButton();
        hrRolebtn = new javax.swing.JButton();
        payrollRolebtn = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        PayslipPanel = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        viewbtn400001 = new javax.swing.JButton();
        viewbtn400002 = new javax.swing.JButton();
        viewbtn400003 = new javax.swing.JButton();
        viewbtn400004 = new javax.swing.JButton();
        viewbtn400005 = new javax.swing.JButton();
        viewbtn400006 = new javax.swing.JButton();
        jLabel61 = new javax.swing.JLabel();
        LeavePanel = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel112 = new javax.swing.JLabel();
        LeavePanelLeaveSelector = new javax.swing.JComboBox<>();
        jLabel114 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        LeavePanelReason = new javax.swing.JTextArea();
        LeavePanelSubmitButton = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jPanel12 = new javax.swing.JPanel();
        jLabel117 = new javax.swing.JLabel();
        leaveSickLeaveBalance = new javax.swing.JLabel();
        leaveVacationLeaveBalance = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel111 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        AttendancePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        attendanceTable = new javax.swing.JTable();
        attendanceRequestOvertimebtn = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        ProfilePanel = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        profileName = new javax.swing.JLabel();
        profilePosition = new javax.swing.JLabel();
        profilePhoneNumber = new javax.swing.JLabel();
        profileAddress = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        profileSssNo = new javax.swing.JLabel();
        profileTinNo = new javax.swing.JLabel();
        profilePagibigNo = new javax.swing.JLabel();
        profilePhilhealthNo = new javax.swing.JLabel();
        profileChangePasswordbtn = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        profileStatus = new javax.swing.JLabel();
        profileBirthDate = new javax.swing.JLabel();
        profileDepartment = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btnProfile = new javax.swing.JButton();
        btnAttendance = new javax.swing.JButton();
        btnLeave = new javax.swing.JButton();
        btnPayslip = new javax.swing.JButton();
        DashboardPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        dashboardfnamelbl = new javax.swing.JLabel();
        logoutbtn = new javax.swing.JButton();
        dashboardempNolbl = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jLabel20.setText("jLabel20");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HomePanel.setBackground(new java.awt.Color(33, 35, 39));
        HomePanel.setPreferredSize(new java.awt.Dimension(880, 400));
        HomePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(33, 35, 39));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Department:");

        timeInlbl.setBackground(new java.awt.Color(9, 11, 15));
        timeInlbl.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        timeInlbl.setForeground(new java.awt.Color(0, 204, 51));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Time In ");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Time Out ");

        timeOutlbl.setBackground(new java.awt.Color(9, 11, 15));
        timeOutlbl.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        timeOutlbl.setForeground(new java.awt.Color(204, 51, 0));

        jSeparator2.setBackground(new java.awt.Color(255, 153, 51));
        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

        departmentNamelbl.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        departmentNamelbl.setForeground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Schedule:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Schedule Status:");

        scheduleStatuslbl.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        scheduleStatuslbl.setForeground(new java.awt.Color(0, 204, 51));

        jSeparator5.setBackground(new java.awt.Color(255, 153, 51));
        jSeparator5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

        timeInbtn.setBackground(new java.awt.Color(255, 153, 0));
        timeInbtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        timeInbtn.setForeground(new java.awt.Color(255, 255, 255));
        timeInbtn.setText("Time in");
        timeInbtn.setBorderPainted(false);
        timeInbtn.setFocusPainted(false);
        timeInbtn.setFocusable(false);
        timeInbtn.setRequestFocusEnabled(false);
        timeInbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeInbtnActionPerformed(evt);
            }
        });

        timeOutbtn.setBackground(new java.awt.Color(153, 0, 0));
        timeOutbtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        timeOutbtn.setForeground(new java.awt.Color(255, 255, 255));
        timeOutbtn.setText("Time out");
        timeOutbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0), 3));
        timeOutbtn.setBorderPainted(false);
        timeOutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeOutbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(departmentNamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scheduleStatuslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(timeInlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel9)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jLabel10))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(timeOutlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(timeInbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(timeOutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(timeInlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel9))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(jLabel10))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(timeOutlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(timeInbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(timeOutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, 0)
                                .addComponent(departmentNamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15)
                                .addGap(0, 0, 0)
                                .addComponent(scheduleStatuslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(52, 52, 52))
        );

        HomePanel.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 578, 280));

        itRolebtn.setBackground(new java.awt.Color(255, 153, 0));
        itRolebtn.setForeground(new java.awt.Color(255, 255, 255));
        itRolebtn.setText("Incident Reports");
        itRolebtn.setBorderPainted(false);
        itRolebtn.setMaximumSize(new java.awt.Dimension(88, 48));
        itRolebtn.setMinimumSize(new java.awt.Dimension(88, 48));
        itRolebtn.setPreferredSize(new java.awt.Dimension(88, 48));
        itRolebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itRolebtnActionPerformed(evt);
            }
        });
        HomePanel.add(itRolebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 530, 40));

        supervisorRolebtn.setBackground(new java.awt.Color(255, 153, 0));
        supervisorRolebtn.setForeground(new java.awt.Color(255, 255, 255));
        supervisorRolebtn.setText("Requests Records");
        supervisorRolebtn.setBorderPainted(false);
        supervisorRolebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supervisorRolebtnActionPerformed(evt);
            }
        });
        HomePanel.add(supervisorRolebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 530, 40));

        hrRolebtn.setBackground(new java.awt.Color(255, 153, 0));
        hrRolebtn.setForeground(new java.awt.Color(255, 255, 255));
        hrRolebtn.setText("Employee Records");
        hrRolebtn.setBorderPainted(false);
        hrRolebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hrRolebtnActionPerformed(evt);
            }
        });
        HomePanel.add(hrRolebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 530, 40));

        payrollRolebtn.setBackground(new java.awt.Color(255, 153, 0));
        payrollRolebtn.setForeground(new java.awt.Color(255, 255, 255));
        payrollRolebtn.setText("Payroll Reports");
        payrollRolebtn.setBorderPainted(false);
        payrollRolebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payrollRolebtnActionPerformed(evt);
            }
        });
        HomePanel.add(payrollRolebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 530, 40));

        jPanel13.setBackground(new java.awt.Color(51, 51, 51));

        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new-logo.png"))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Lucida Bright", 1, 35)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Motor");
        jLabel18.setIconTextGap(0);

        jLabel19.setFont(new java.awt.Font("Lucida Bright", 1, 35)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 153, 0));
        jLabel19.setText("PH");
        jLabel19.setIconTextGap(0);

        jLabel22.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("The Filipinos' Choice");

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trophy.png"))); // NOI18N

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addComponent(jLabel22)
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel64)
                .addGap(56, 56, 56))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(6, 6, 6)
                .addComponent(jLabel19)
                .addGap(93, 93, 93))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addGap(12, 12, 12)
                .addComponent(jLabel64)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        HomePanel.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 350, 340));

        jPanel3.add(HomePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 125, 971, -1));

        PayslipPanel.setBackground(new java.awt.Color(33, 35, 39));
        PayslipPanel.setPreferredSize(new java.awt.Dimension(880, 400));
        PayslipPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel55.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("Payslip Records");
        PayslipPanel.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel12.setBackground(new java.awt.Color(33, 35, 39));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("PayPeriod ID");
        jLabel12.setOpaque(true);

        jLabel16.setBackground(new java.awt.Color(33, 35, 39));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Start Date");
        jLabel16.setOpaque(true);

        jLabel17.setBackground(new java.awt.Color(33, 35, 39));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("End Date");
        jLabel17.setOpaque(true);

        jLabel34.setBackground(new java.awt.Color(204, 204, 204));
        jLabel34.setForeground(new java.awt.Color(0, 0, 0));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("400002");
        jLabel34.setOpaque(true);
        jLabel34.setPreferredSize(new java.awt.Dimension(36, 36));

        jLabel43.setBackground(new java.awt.Color(204, 204, 204));
        jLabel43.setForeground(new java.awt.Color(0, 0, 0));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("2022-09-16");
        jLabel43.setOpaque(true);
        jLabel43.setPreferredSize(new java.awt.Dimension(58, 36));

        jLabel44.setBackground(new java.awt.Color(204, 204, 204));
        jLabel44.setForeground(new java.awt.Color(0, 0, 0));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("2022-09-30");
        jLabel44.setOpaque(true);

        jLabel45.setBackground(new java.awt.Color(255, 255, 255));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("400003");
        jLabel45.setOpaque(true);
        jLabel45.setPreferredSize(new java.awt.Dimension(36, 36));

        jLabel46.setBackground(new java.awt.Color(255, 255, 255));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("2022-10-01");
        jLabel46.setOpaque(true);
        jLabel46.setPreferredSize(new java.awt.Dimension(58, 36));

        jLabel47.setBackground(new java.awt.Color(255, 255, 255));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("2022-10-15");
        jLabel47.setOpaque(true);

        jLabel48.setBackground(new java.awt.Color(255, 255, 255));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("2022-09-15");
        jLabel48.setOpaque(true);

        jLabel49.setBackground(new java.awt.Color(255, 255, 255));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("400001");
        jLabel49.setOpaque(true);
        jLabel49.setPreferredSize(new java.awt.Dimension(36, 36));

        jLabel50.setBackground(new java.awt.Color(255, 255, 255));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("2022-09-01");
        jLabel50.setOpaque(true);
        jLabel50.setPreferredSize(new java.awt.Dimension(58, 36));

        jLabel51.setBackground(new java.awt.Color(204, 204, 204));
        jLabel51.setForeground(new java.awt.Color(0, 0, 0));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("2022-10-31");
        jLabel51.setOpaque(true);

        jLabel52.setBackground(new java.awt.Color(204, 204, 204));
        jLabel52.setForeground(new java.awt.Color(0, 0, 0));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("2022-10-16");
        jLabel52.setOpaque(true);
        jLabel52.setPreferredSize(new java.awt.Dimension(58, 36));

        jLabel53.setBackground(new java.awt.Color(204, 204, 204));
        jLabel53.setForeground(new java.awt.Color(0, 0, 0));
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("400004");
        jLabel53.setOpaque(true);
        jLabel53.setPreferredSize(new java.awt.Dimension(36, 36));

        jLabel54.setBackground(new java.awt.Color(255, 255, 255));
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("2022-11-01");
        jLabel54.setOpaque(true);
        jLabel54.setPreferredSize(new java.awt.Dimension(58, 36));

        jLabel56.setBackground(new java.awt.Color(255, 255, 255));
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("400005");
        jLabel56.setOpaque(true);
        jLabel56.setPreferredSize(new java.awt.Dimension(36, 36));

        jLabel57.setBackground(new java.awt.Color(255, 255, 255));
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("2022-11-15");
        jLabel57.setOpaque(true);

        jLabel58.setBackground(new java.awt.Color(204, 204, 204));
        jLabel58.setForeground(new java.awt.Color(0, 0, 0));
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("2022-11-30");
        jLabel58.setOpaque(true);

        jLabel59.setBackground(new java.awt.Color(204, 204, 204));
        jLabel59.setForeground(new java.awt.Color(0, 0, 0));
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("2022-11-16");
        jLabel59.setOpaque(true);
        jLabel59.setPreferredSize(new java.awt.Dimension(58, 36));

        jLabel60.setBackground(new java.awt.Color(204, 204, 204));
        jLabel60.setForeground(new java.awt.Color(0, 0, 0));
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("400006");
        jLabel60.setOpaque(true);
        jLabel60.setPreferredSize(new java.awt.Dimension(36, 36));

        viewbtn400001.setText("View");
        viewbtn400001.setBorder(null);
        viewbtn400001.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtn400001ActionPerformed(evt);
            }
        });

        viewbtn400002.setBackground(new java.awt.Color(204, 204, 204));
        viewbtn400002.setForeground(new java.awt.Color(0, 0, 0));
        viewbtn400002.setText("View");
        viewbtn400002.setBorder(null);
        viewbtn400002.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtn400002ActionPerformed(evt);
            }
        });

        viewbtn400003.setText("View");
        viewbtn400003.setBorder(null);
        viewbtn400003.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtn400003ActionPerformed(evt);
            }
        });

        viewbtn400004.setBackground(new java.awt.Color(204, 204, 204));
        viewbtn400004.setForeground(new java.awt.Color(0, 0, 0));
        viewbtn400004.setText("View");
        viewbtn400004.setBorder(null);
        viewbtn400004.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtn400004ActionPerformed(evt);
            }
        });

        viewbtn400005.setText("View");
        viewbtn400005.setBorder(null);
        viewbtn400005.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtn400005ActionPerformed(evt);
            }
        });

        viewbtn400006.setBackground(new java.awt.Color(204, 204, 204));
        viewbtn400006.setForeground(new java.awt.Color(0, 0, 0));
        viewbtn400006.setText("View");
        viewbtn400006.setBorder(null);
        viewbtn400006.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtn400006ActionPerformed(evt);
            }
        });

        jLabel61.setBackground(new java.awt.Color(33, 35, 39));
        jLabel61.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setText("Action");
        jLabel61.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewbtn400003, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewbtn400004, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewbtn400005, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewbtn400006, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewbtn400001, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewbtn400002, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(viewbtn400001, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewbtn400002, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewbtn400003, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewbtn400004, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewbtn400005, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(viewbtn400006, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        PayslipPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 900, 300));

        jPanel3.add(PayslipPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 125, 971, -1));

        LeavePanel.setBackground(new java.awt.Color(33, 35, 39));
        LeavePanel.setPreferredSize(new java.awt.Dimension(880, 440));

        jPanel11.setBackground(new java.awt.Color(51, 51, 51));
        jPanel11.setPreferredSize(new java.awt.Dimension(451, 360));

        jLabel112.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(255, 255, 255));
        jLabel112.setText("Leave Type");

        LeavePanelLeaveSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Leave Type", "Vacation Leave", "Sick Leave", " " }));
        LeavePanelLeaveSelector.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        LeavePanelLeaveSelector.setName("Choose the Type of Leave"); // NOI18N

        jLabel114.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel114.setForeground(new java.awt.Color(255, 255, 255));
        jLabel114.setText("Date");

        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("Start Date");

        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("End Date");

        jLabel113.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(255, 255, 255));
        jLabel113.setText("Reason");

        LeavePanelReason.setColumns(20);
        LeavePanelReason.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LeavePanelReason.setRows(5);
        LeavePanelReason.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        LeavePanelSubmitButton.setBackground(new java.awt.Color(255, 153, 0));
        LeavePanelSubmitButton.setForeground(new java.awt.Color(255, 255, 255));
        LeavePanelSubmitButton.setText("Submit");
        LeavePanelSubmitButton.setBorderPainted(false);
        LeavePanelSubmitButton.setPreferredSize(new java.awt.Dimension(72, 28));
        LeavePanelSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeavePanelSubmitButtonActionPerformed(evt);
            }
        });

        jDateChooser1.setPreferredSize(new java.awt.Dimension(180, 22));

        jDateChooser2.setPreferredSize(new java.awt.Dimension(180, 22));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel112)
                                .addComponent(jLabel114)
                                .addComponent(LeavePanelLeaveSelector, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel113)
                                .addComponent(LeavePanelReason, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE))
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(LeavePanelSubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(20, Short.MAX_VALUE))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel112)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LeavePanelLeaveSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel114)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(jLabel63))
                .addGap(18, 18, 18)
                .addComponent(jLabel113)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LeavePanelReason, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LeavePanelSubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(51, 51, 51));

        jLabel117.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel117.setForeground(new java.awt.Color(255, 255, 255));
        jLabel117.setText("Sick Leave");

        leaveSickLeaveBalance.setFont(new java.awt.Font("Segoe UI", 1, 80)); // NOI18N
        leaveSickLeaveBalance.setForeground(new java.awt.Color(255, 153, 0));
        leaveSickLeaveBalance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        leaveVacationLeaveBalance.setFont(new java.awt.Font("Segoe UI", 1, 80)); // NOI18N
        leaveVacationLeaveBalance.setForeground(new java.awt.Color(255, 153, 0));
        leaveVacationLeaveBalance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel116.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel116.setForeground(new java.awt.Color(255, 255, 255));
        jLabel116.setText("Vacation Leave");

        jButton2.setBackground(new java.awt.Color(255, 153, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Leave List");
        jButton2.setBorderPainted(false);
        jButton2.setPreferredSize(new java.awt.Dimension(81, 28));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel117)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel116)
                .addGap(73, 73, 73))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(leaveSickLeaveBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(leaveVacationLeaveBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(leaveVacationLeaveBalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(leaveSickLeaveBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel117, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel116))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        jLabel111.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel111.setForeground(new java.awt.Color(255, 255, 255));
        jLabel111.setText("Leave Application");

        jLabel115.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel115.setForeground(new java.awt.Color(255, 255, 255));
        jLabel115.setText("Leave Balance");

        javax.swing.GroupLayout LeavePanelLayout = new javax.swing.GroupLayout(LeavePanel);
        LeavePanel.setLayout(LeavePanelLayout);
        LeavePanelLayout.setHorizontalGroup(
            LeavePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeavePanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(LeavePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel111)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(LeavePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel115))
                .addGap(39, 39, 39))
        );
        LeavePanelLayout.setVerticalGroup(
            LeavePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeavePanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(LeavePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel111)
                    .addComponent(jLabel115))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LeavePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel3.add(LeavePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 125, 970, -1));

        AttendancePanel.setBackground(new java.awt.Color(33, 35, 39));
        AttendancePanel.setPreferredSize(new java.awt.Dimension(880, 400));

        attendanceTable.setBackground(new java.awt.Color(51, 51, 51));
        attendanceTable.setForeground(new java.awt.Color(255, 255, 255));
        attendanceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Date", "Time In", "Time Out", "Overtime"
            }
        ));
        attendanceTable.setShowGrid(true);
        attendanceTable.setShowHorizontalLines(false);
        attendanceTable.setShowVerticalLines(false);
        attendanceTable.setSurrendersFocusOnKeystroke(true);
        jScrollPane1.setViewportView(attendanceTable);

        attendanceRequestOvertimebtn.setBackground(new java.awt.Color(255, 153, 0));
        attendanceRequestOvertimebtn.setForeground(new java.awt.Color(255, 255, 255));
        attendanceRequestOvertimebtn.setText("Request Overtime");
        attendanceRequestOvertimebtn.setBorderPainted(false);
        attendanceRequestOvertimebtn.setMaximumSize(new java.awt.Dimension(124, 28));
        attendanceRequestOvertimebtn.setMinimumSize(new java.awt.Dimension(124, 28));
        attendanceRequestOvertimebtn.setPreferredSize(new java.awt.Dimension(124, 28));
        attendanceRequestOvertimebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendanceRequestOvertimebtnActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 153, 0));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Overtime Request List");
        jButton4.setBorderPainted(false);
        jButton4.setMaximumSize(new java.awt.Dimension(145, 28));
        jButton4.setMinimumSize(new java.awt.Dimension(145, 28));
        jButton4.setPreferredSize(new java.awt.Dimension(145, 28));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Attendance Record");

        javax.swing.GroupLayout AttendancePanelLayout = new javax.swing.GroupLayout(AttendancePanel);
        AttendancePanel.setLayout(AttendancePanelLayout);
        AttendancePanelLayout.setHorizontalGroup(
            AttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AttendancePanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(AttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 916, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(AttendancePanelLayout.createSequentialGroup()
                        .addComponent(attendanceRequestOvertimebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        AttendancePanelLayout.setVerticalGroup(
            AttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AttendancePanelLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(AttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(attendanceRequestOvertimebtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        jPanel3.add(AttendancePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 125, 970, -1));

        ProfilePanel.setBackground(new java.awt.Color(33, 35, 39));
        ProfilePanel.setPreferredSize(new java.awt.Dimension(880, 400));

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 1, 1), "Personal Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user (2).png"))); // NOI18N

        profileName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        profileName.setForeground(new java.awt.Color(255, 255, 255));

        profilePosition.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        profilePosition.setForeground(new java.awt.Color(255, 255, 255));

        profilePhoneNumber.setForeground(new java.awt.Color(255, 255, 255));

        profileAddress.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(44, 44, 44)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profilePosition, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(profileAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                            .addComponent(profileName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(profilePhoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(27, 27, 27))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addComponent(profileName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(profilePosition, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(profilePhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(profileAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(51, 51, 51));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 1, 1), "My Account Numbers", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(204, 204, 204));
        jLabel35.setText("SSS No");

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(204, 204, 204));
        jLabel36.setText("TIN No");

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(204, 204, 204));
        jLabel37.setText("Pagibig No");

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(204, 204, 204));
        jLabel38.setText("Philhealth No");

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(204, 204, 204));
        jLabel39.setText(":");

        jLabel40.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(204, 204, 204));
        jLabel40.setText(":");

        jLabel41.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(204, 204, 204));
        jLabel41.setText(":");

        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(204, 204, 204));
        jLabel42.setText(":");

        profileSssNo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        profileSssNo.setForeground(new java.awt.Color(255, 255, 255));

        profileTinNo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        profileTinNo.setForeground(new java.awt.Color(255, 255, 255));

        profilePagibigNo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        profilePagibigNo.setForeground(new java.awt.Color(255, 255, 255));

        profilePhilhealthNo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        profilePhilhealthNo.setForeground(new java.awt.Color(255, 255, 255));

        profileChangePasswordbtn.setBackground(new java.awt.Color(255, 153, 0));
        profileChangePasswordbtn.setForeground(new java.awt.Color(255, 255, 255));
        profileChangePasswordbtn.setText("Change Password");
        profileChangePasswordbtn.setBorderPainted(false);
        profileChangePasswordbtn.setMaximumSize(new java.awt.Dimension(124, 28));
        profileChangePasswordbtn.setPreferredSize(new java.awt.Dimension(124, 28));
        profileChangePasswordbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileChangePasswordbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(profileChangePasswordbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(profileSssNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(profileTinNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(profilePagibigNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(profilePhilhealthNo, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profileSssNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel35)
                        .addComponent(jLabel39)))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profileTinNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel36)
                        .addComponent(jLabel40)))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profilePagibigNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel37)
                        .addComponent(jLabel41)))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(jLabel42)
                    .addComponent(profilePhilhealthNo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(profileChangePasswordbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        jPanel10.setBackground(new java.awt.Color(51, 51, 51));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1)));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(204, 204, 204));
        jLabel28.setText("Status");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(204, 204, 204));
        jLabel29.setText("Department");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(204, 204, 204));
        jLabel30.setText("Birth Date");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(204, 204, 204));
        jLabel31.setText(":");

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(204, 204, 204));
        jLabel32.setText(":");

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(204, 204, 204));
        jLabel33.setText(":");

        profileStatus.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        profileStatus.setForeground(new java.awt.Color(255, 255, 255));

        profileBirthDate.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        profileBirthDate.setForeground(new java.awt.Color(255, 255, 255));

        profileDepartment.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        profileDepartment.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, 11, Short.MAX_VALUE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(profileStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(profileDepartment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(profileBirthDate, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profileStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel28)
                        .addComponent(jLabel31)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profileDepartment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel29)
                        .addComponent(jLabel32)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel33)
                    .addComponent(profileBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout ProfilePanelLayout = new javax.swing.GroupLayout(ProfilePanel);
        ProfilePanel.setLayout(ProfilePanelLayout);
        ProfilePanelLayout.setHorizontalGroup(
            ProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfilePanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(ProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ProfilePanelLayout.setVerticalGroup(
            ProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfilePanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(ProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ProfilePanelLayout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel3.add(ProfilePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 125, 970, -1));

        jPanel2.setBackground(new java.awt.Color(9, 11, 15));
        jPanel2.setPreferredSize(new java.awt.Dimension(225, 400));

        btnHome.setBackground(new java.awt.Color(33, 35, 39));
        btnHome.setForeground(new java.awt.Color(255, 153, 0));
        btnHome.setText("Home");
        btnHome.setBorderPainted(false);
        btnHome.setFocusPainted(false);
        btnHome.setFocusable(false);
        btnHome.setPreferredSize(new java.awt.Dimension(0, 48));
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnProfile.setBackground(new java.awt.Color(9, 11, 15));
        btnProfile.setForeground(new java.awt.Color(255, 255, 255));
        btnProfile.setText("Profile");
        btnProfile.setBorderPainted(false);
        btnProfile.setFocusPainted(false);
        btnProfile.setFocusable(false);
        btnProfile.setPreferredSize(new java.awt.Dimension(0, 48));
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });

        btnAttendance.setBackground(new java.awt.Color(9, 11, 15));
        btnAttendance.setForeground(new java.awt.Color(255, 255, 255));
        btnAttendance.setText("Attendance");
        btnAttendance.setBorderPainted(false);
        btnAttendance.setFocusPainted(false);
        btnAttendance.setFocusable(false);
        btnAttendance.setPreferredSize(new java.awt.Dimension(0, 48));
        btnAttendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttendanceActionPerformed(evt);
            }
        });

        btnLeave.setBackground(new java.awt.Color(9, 11, 15));
        btnLeave.setForeground(new java.awt.Color(255, 255, 255));
        btnLeave.setText("Leave");
        btnLeave.setBorderPainted(false);
        btnLeave.setFocusPainted(false);
        btnLeave.setFocusable(false);
        btnLeave.setPreferredSize(new java.awt.Dimension(0, 48));
        btnLeave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeaveActionPerformed(evt);
            }
        });

        btnPayslip.setBackground(new java.awt.Color(9, 11, 15));
        btnPayslip.setForeground(new java.awt.Color(255, 255, 255));
        btnPayslip.setText("Payslip");
        btnPayslip.setBorderPainted(false);
        btnPayslip.setFocusPainted(false);
        btnPayslip.setFocusable(false);
        btnPayslip.setPreferredSize(new java.awt.Dimension(0, 48));
        btnPayslip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayslipActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAttendance, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(btnLeave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPayslip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAttendance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLeave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPayslip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 125, -1, -1));

        DashboardPanel.setBackground(new java.awt.Color(33, 35, 39));
        DashboardPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(33, 35, 39), 20, true));
        DashboardPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Poppins SemiBold", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Dashboard");
        DashboardPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, 50));

        jSeparator3.setBackground(new java.awt.Color(255, 153, 51));
        jSeparator3.setForeground(new java.awt.Color(255, 153, 0));
        jSeparator3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        DashboardPanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, -1, 100));

        jPanel4.setBackground(new java.awt.Color(33, 35, 39));

        jLabel6.setFont(new java.awt.Font("Poppins Medium", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Welcome, ");

        dashboardfnamelbl.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        dashboardfnamelbl.setForeground(new java.awt.Color(255, 255, 255));

        logoutbtn.setBackground(new java.awt.Color(204, 0, 0));
        logoutbtn.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        logoutbtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutbtn.setText("Log out");
        logoutbtn.setBorderPainted(false);
        logoutbtn.setFocusPainted(false);
        logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbtnActionPerformed(evt);
            }
        });

        dashboardempNolbl.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        dashboardempNolbl.setForeground(new java.awt.Color(255, 255, 255));

        jLabel23.setFont(new java.awt.Font("Poppins Medium", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Employee ID:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(33, 33, 33))
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dashboardfnamelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dashboardempNolbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoutbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dashboardfnamelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dashboardempNolbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        DashboardPanel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 410, 80));

        jLabel24.setFont(new java.awt.Font("Poppins SemiBold", 1, 36)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 153, 0));
        jLabel24.setText("|");
        DashboardPanel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 50));

        jPanel3.add(DashboardPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 19, 971, -1));

        jLabel4.setFont(new java.awt.Font("Poppins SemiBold", 1, 21)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("People Portal");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 75, -1, -1));

        jLabel3.setFont(new java.awt.Font("Poppins SemiBold", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("PH");
        jLabel3.setIconTextGap(0);
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 33, -1, -1));

        jLabel2.setFont(new java.awt.Font("Poppins SemiBold", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Motor");
        jLabel2.setIconTextGap(0);
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 33, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 153, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 153, 0));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 564, 1216, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 600));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public void applyRoleRestrictions(int roleID) {
        switch (roleID) {
            case 701: // Employee
                payrollRolebtn.setVisible(false);
                hrRolebtn.setVisible(false);
                supervisorRolebtn.setVisible(false);
                itRolebtn.setVisible(false);
                break;
            case 702: // Supervisor
                payrollRolebtn.setVisible(false);
                hrRolebtn.setVisible(false);
                itRolebtn.setVisible(false);
                break;
            case 703: // HR Admin
                supervisorRolebtn.setVisible(false);
                itRolebtn.setVisible(false);
                payrollRolebtn.setVisible(false);
                break;
            case 704: // Payroll Admin
                itRolebtn.setVisible(false);
                hrRolebtn.setVisible(false);
                supervisorRolebtn.setVisible(false);
                break;
            case 705: // IT Admin
                hrRolebtn.setVisible(false);
                supervisorRolebtn.setVisible(false);
                payrollRolebtn.setVisible(false);
                break;
            default:
                break;
        }
    }
    
   
        
    


    
    private void hrRolebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hrRolebtnActionPerformed
  employee_details emp = new employee_details();
    DefaultTableModel model = new DefaultTableModel(); // Create a new model instance
    
    try {
        dbManager = new DatabaseManager();
        con = dbManager.getConnection();

        String query = "SELECT * FROM employee";
        try (Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            // Define table columns
            model.addColumn("Employee ID");
            model.addColumn("Last Name");
            model.addColumn("First Name");
            model.addColumn("Birth Date");
            model.addColumn("Street Address");
            model.addColumn("City");
            model.addColumn("Province");
            model.addColumn("Zip");
            model.addColumn("Phone No");
            model.addColumn("Email");
            model.addColumn("SSS No");
            model.addColumn("Philhealth No");
            model.addColumn("TIN");
            model.addColumn("Pagibig No");
            model.addColumn("Position ID");
            model.addColumn("Dep ID");
            model.addColumn("Status");
            model.addColumn("Supervisor ID");
            model.addColumn("Basic Salary ID");

            // Add rows from result set
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("employeeID"),
                    rs.getString("lastName"),
                    rs.getString("firstName"),
                    rs.getDate("birthDate"),
                    rs.getString("streetAddress"),
                    rs.getString("city"),
                    rs.getString("province"),
                    rs.getString("zip"),
                    rs.getString("phoneNo"),
                    rs.getString("email"),
                    rs.getString("sssNo"),
                    rs.getString("philhealthNo"),
                    rs.getString("tin"),
                    rs.getString("pagibigNo"),
                    rs.getString("positionID"),
                    rs.getString("depID"),
                    rs.getString("status"),
                    rs.getObject("supervisorID"),
                    rs.getString("basicSalaryID")
                });
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error refreshing data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    // Pass the model to employee_details
    emp.populateEmployeeTable(model);
     
    emp.setVisible(true);

    }//GEN-LAST:event_hrRolebtnActionPerformed

    
    private DefaultTableModel fetchDataFromDatabase() {
    DefaultTableModel model = new DefaultTableModel();
    // Your database fetching logic to populate 'model' goes here
    return model;
}
    
    private void timeOutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeOutbtnActionPerformed
       String empID = dashboardempNolbl.getText();
    Attendance punchManager = new Attendance();
    
    int dialogResult = JOptionPane.showConfirmDialog(this, "Are you sure you want to punch out?", "Punch Out Confirmation", JOptionPane.YES_NO_OPTION);
    if (dialogResult == JOptionPane.YES_OPTION) {
           try {
               String punchOutTime = punchManager.punchOut(empID);
               
               if (punchOutTime != null) {
                   timeOutlbl.setText(punchOutTime); // Set the label text to the punch-out time
                   timeOutbtn.show(false);
                   timeInbtn.show(true);
                   timeInbtn.setEnabled(false);
               } else {
                   JOptionPane.showMessageDialog(this, "Failed to punch out!", "Error", JOptionPane.ERROR_MESSAGE);
               }  } catch (ParseException ex) {
               Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
           }
    }
    }//GEN-LAST:event_timeOutbtnActionPerformed

    private void timeInbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeInbtnActionPerformed
        try {
            String empID = dashboardempNolbl.getText();
            Attendance punchManager = new Attendance();
            
            String punchInTime = punchManager.punchIn(empID);
            
            if (punchInTime != null) {
                timeInlbl.setText(punchInTime); // Set the label text to the punch-in time
                timeInbtn.show(false);
                timeOutbtn.setEnabled(true);
                scheduleStatuslbl.setText("Present");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to punch in!", "Error", JOptionPane.ERROR_MESSAGE);
            }   } catch (ParseException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }//GEN-LAST:event_timeInbtnActionPerformed

    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtnActionPerformed
Attendance att = new Attendance();
    String employeeID = dashboardempNolbl.getText();
    String currentDate = att.getCurrentDateFormatted();
    
    // Query the database to check if there is a punch-out record for the employee on the current date
    boolean hasPunchedOut = att.hasPunchedOut(employeeID, currentDate);
    
    if (hasPunchedOut) {
        int dialogResult = JOptionPane.showConfirmDialog(this, "Are you sure you want to log out?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION)
        this.dispose();
    } else {
        // Show an error message indicating that the employee has not punched out yet
        JOptionPane.showMessageDialog(this, "You have not punched out yet. Please punch out before logging out.", "Error", JOptionPane.ERROR_MESSAGE);
    }

        // TODO add your handling code here:
    }//GEN-LAST:event_logoutbtnActionPerformed

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        btnProfile.setBackground(new java.awt.Color(33,35,39));
        btnProfile.setForeground(new java.awt.Color(255,153,0));
        btnHome.setBackground(new java.awt.Color(9,11,15));
        btnHome.setForeground(new java.awt.Color(255,255,255));        
        btnAttendance.setBackground(new java.awt.Color(9,11,15));
        btnAttendance.setForeground(new java.awt.Color(255,255,255));
        btnLeave.setBackground(new java.awt.Color(9,11,15));
        btnLeave.setForeground(new java.awt.Color(255,255,255));
        btnPayslip.setBackground(new java.awt.Color(9,11,15));
        btnPayslip.setForeground(new java.awt.Color(255,255,255));
        jLabel5.setText("Profile");
        
        String empID = dashboardempNolbl.getText();
       
         dbManager = new DatabaseManager();
         con = dbManager.getConnection();
         
        try {
       String query = "SELECT * FROM `employeedetails_view` WHERE employeeID = ?";
        PreparedStatement pstmt = con.prepareStatement(query);
        pstmt.setString(1, empID);
        
        // Execute the query
        rs = pstmt.executeQuery();
             
             if(rs.next()){
                
              
               String name = rs.getString("name");
               String position = rs.getString("position");
               String phoneNum = rs.getString("phoneNo");
               String add = rs.getString("address");
               String status = rs.getString("status");
               String dep = rs.getString("department");
               String birthdate = rs.getString("birthDate"); 
               String sss = rs.getString("sssNo");
               String pagibig = rs.getString("pagibigNo");
               String philhealth = rs.getString("philhealthNo");
               String tin = rs.getString("tin");
               
               profileName.setText(name);
               profilePosition.setText(position);
               profilePhoneNumber.setText(phoneNum);
               profileAddress.setText(add);
               profileStatus.setText(status);
               profileDepartment.setText(dep);
               profileBirthDate.setText(birthdate);
               profileSssNo.setText(sss);
               profilePagibigNo.setText(pagibig);
               profilePhilhealthNo.setText(philhealth);
               profileTinNo.setText(tin);
          
                
            }else{
                 
                JOptionPane.showMessageDialog(this, "Error Loading Information");
            }
            
            
            con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
         
       
      ProfilePanel.show(true);
      HomePanel.show(false);
      AttendancePanel.show(false);
      LeavePanel.show(false);
      PayslipPanel.show(false);
    }//GEN-LAST:event_btnProfileActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
    
        btnHome.setBackground(new java.awt.Color(33,35,39));
        btnHome.setForeground(new java.awt.Color(255,153,0));
        btnProfile.setBackground(new java.awt.Color(9,11,15));
        btnProfile.setForeground(new java.awt.Color(255,255,255));
        btnAttendance.setBackground(new java.awt.Color(9,11,15));
        btnAttendance.setForeground(new java.awt.Color(255,255,255));
        btnLeave.setBackground(new java.awt.Color(9,11,15));
        btnLeave.setForeground(new java.awt.Color(255,255,255));
        btnPayslip.setBackground(new java.awt.Color(9,11,15));
        btnPayslip.setForeground(new java.awt.Color(255,255,255));
        jLabel5.setText("Dashboard");
        
        HomePanel.show(true);
        ProfilePanel.show(false);
        AttendancePanel.show(false);
        LeavePanel.show(false);
        PayslipPanel.show(false);
    
    // TODO add your handling code here:
    }//GEN-LAST:event_btnHomeActionPerformed

    private void LeavePanelSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeavePanelSubmitButtonActionPerformed
      
         dbManager = new DatabaseManager();
         con = dbManager.getConnection();

try {
    // Assuming these variables are already defined and initialized:
    String leaveType = (String) LeavePanelLeaveSelector.getSelectedItem();
    Date startDate = jDateChooser1.getDate();
    Date endDate = jDateChooser2.getDate();
    String reason = LeavePanelReason.getText();
    String empID = dashboardempNolbl.getText();
    String remarks = "Pending";
    // Validate constraints
    Date currentDate = new Date(); // Current date
    
    // Check for Sick Leave specific constraints
        if (leaveType.equalsIgnoreCase("Sick Leave")) {
            // Start date should not be equal to or greater than date applied
            if (startDate.after(currentDate) || startDate.equals(currentDate)) {
                JOptionPane.showMessageDialog(this, "For Sick Leave, start date cannot be on or after today's date.");
                return;
            }
        } else {
            // General date constraints for non-Sick Leave types
            if (startDate.before(currentDate) || startDate.equals(currentDate)) {
                JOptionPane.showMessageDialog(this, "Start date cannot be before or equal to today's date.");
                return;
            }
        }

    if (endDate.before(startDate) || endDate.equals(startDate)) {
        JOptionPane.showMessageDialog(this, "End date cannot be before or equal to start date.");
        return; // Exit method or handle accordingly
    }
 
    // Format dates for SQL
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    String formattedStartDate = dateFormat.format(startDate);
    String formattedEndDate = dateFormat.format(endDate);
    String formattedDateApplied = dateFormat.format(currentDate); // Current date as dateapplied

    // Prepare SQL statement
     String sql = "INSERT INTO leaveapplication (employeeID, datefiled, leavetype, startdate, enddate, reason, remarks) VALUES (?, ?, ?, ?, ?, ?, ?)";
    
    // Create prepared statement
    try (PreparedStatement pstmt = con.prepareStatement(sql)) {
        pstmt.setString(1, empID);
        pstmt.setString(2, formattedDateApplied); // Set dateapplied
        pstmt.setString(3, leaveType);
        pstmt.setString(4, formattedStartDate);
        pstmt.setString(5, formattedEndDate);
        pstmt.setString(6, reason);
        pstmt.setString(7, remarks);
        
        // Execute SQL query
        int rowsAffected = pstmt.executeUpdate();
        
        System.out.print(leaveType);
        
        
     
     // Calculate number of days between startDate and endDate
    long diffInMillies = Math.abs(endDate.getTime() - startDate.getTime());
    long diffInDays = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);

    
    
    // Add 1 to include both start and end dates in the count (if counting calendar days)
    diffInDays += 1;
    
    // Retrieve leavetypeID from leavetype table based on leaveType
    String leavetypeID = getLeaveTypeID(leaveType); // Implement this method to fetch leavetypeID
    if (leavetypeID == null) {
        JOptionPane.showMessageDialog(this, "Leave type not found in database.");
        return; // Exit method or handle accordingly
       
    }
    
    
        // Retrieve current leave balance from leavebalance table
    int currentBalance = getCurrentLeaveBalance(empID, leavetypeID); // Implement this method to fetch current leave balance
            System.out.println("employeeID: " + empID); // Debug statement
            System.out.println("leavetypeID: " + leavetypeID); // Debug statement
            System.out.println("currentBalance: " + currentBalance); // Debug statement
    if (currentBalance == -1) {
        JOptionPane.showMessageDialog(this, "Leave balance not found for employee and leave type.");
        return; // Exit method or handle accordingly
    }

    // Deduct from currentBalance based on leave type and number of days
    int deduction = calculateDeduction(leavetypeID, diffInDays); // Implement this method to calculate deduction

    // Ensure deduction does not exceed currentBalance
    deduction = Math.min(deduction, currentBalance);
    int newBalance = currentBalance - deduction;
    
    
    // Update leave balance in the database
    boolean updateSuccessful = updateLeaveBalance(empID, leavetypeID, newBalance); // Implement this method to update leave balance

    if (updateSuccessful) {
        JOptionPane.showMessageDialog(this, "Leave balance updated successfully.");
      
    } else {
        JOptionPane.showMessageDialog(this, "Failed to update leave balance.");
    }

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "Leave application submitted successfully.");
        
        dbManager.updateLeaveBalances(empID, leaveSickLeaveBalance, leaveVacationLeaveBalance);
        LeavePanelLeaveSelector.setSelectedIndex(0);
        jDateChooser1.setDate(null);
        jDateChooser2.setDate(null);
        LeavePanelReason.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Leave application submission failed.");
        }
    
        
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error submitting leave application: " + ex.getMessage());
    }
} catch (Exception ex) {
    ex.printStackTrace();
    JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
} finally {
    // Close database connection
    try {
        if (con != null) {
            con.close();
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
}



             
    }//GEN-LAST:event_LeavePanelSubmitButtonActionPerformed

    // Method to update leave balance in leavebalance table
private boolean updateLeaveBalance(String empID, String leavetypeID, int newBalance) throws SQLException {
    String updateQuery = "UPDATE leavebalance SET leavebalance = ? WHERE employeeID = ? AND leavetypeID = ?";
    try (PreparedStatement updateStmt = con.prepareStatement(updateQuery)) {
        updateStmt.setInt(1, newBalance);
        updateStmt.setString(2, empID);
        updateStmt.setString(3, leavetypeID);
        
        int rowsUpdated = updateStmt.executeUpdate();
        return rowsUpdated > 0;
    }
}
    
  // Method to retrieve current leave balance from leavebalance table
private int getCurrentLeaveBalance(String empID, String leavetypeID) throws SQLException {
   String query = "SELECT leavebalance FROM leavebalance WHERE employeeID = ? AND leavetypeID = ?";
    System.out.println("Executing query: " + query); // Debug statement
    try (PreparedStatement pstmt = con.prepareStatement(query)) {
        pstmt.setString(1, empID);
        pstmt.setString(2, leavetypeID);
        try (ResultSet rs = pstmt.executeQuery()) {
            if (rs.next()) {
                return rs.getInt("leavebalance");
            } else {
                // No record found for the specified employee and leavetype
                return -1; // Or handle this case based on your application logic
            }
        }
    }
}
  
 // Method to calculate deduction based on leavetypeID and number of days
private int calculateDeduction(String leavetypeID, long diffInDays) {
    // Implement your deduction logic based on leavetypeID and diffInDays
    // Example logic:
    // Assuming leavetypeID "10001" is for Sick Leave and "10002" is for Vacation Leave
    switch (leavetypeID) {
        case "1001": // leavetypeID for Sick Leave
            return (int) diffInDays; // Deduct all days for sick leave
        case "1002": // leavetypeID for Vacation Leave
            return (int) diffInDays; // Deduct all days for vacation leave
        // Add cases for other leavetypes as needed
        default:
            return 0; // Default to 0 deduction if no matching leavetypeID
    }
}  


   // Method to retrieve leavetypeID from leavetype table based on leaveType
private String getLeaveTypeID(String leaveType) throws SQLException {
    String query = "SELECT leavetypeID FROM leavetype WHERE leavename = ?";
    try (PreparedStatement pstmt = con.prepareStatement(query)) {
        pstmt.setString(1, leaveType);
        try (ResultSet rs = pstmt.executeQuery()) {
            if (rs.next()) {
                return rs.getString("leavetypeID");
            }
        }
    }
    return null;
}
 
    
    private void btnAttendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttendanceActionPerformed
        btnAttendance.setBackground(new java.awt.Color(33,35,39));
        btnAttendance.setForeground(new java.awt.Color(255,153,0));
        btnProfile.setBackground(new java.awt.Color(9,11,15));
        btnProfile.setForeground(new java.awt.Color(255,255,255));
        btnHome.setBackground(new java.awt.Color(9,11,15));
        btnHome.setForeground(new java.awt.Color(255,255,255));
        btnLeave.setBackground(new java.awt.Color(9,11,15));
        btnLeave.setForeground(new java.awt.Color(255,255,255));
        btnPayslip.setBackground(new java.awt.Color(9,11,15));
        btnPayslip.setForeground(new java.awt.Color(255,255,255));
        jLabel5.setText("Attendance");
        
        String empID = dashboardempNolbl.getText();
        dbManager = new DatabaseManager();
        con = dbManager.getConnection();
        
    
     try {
       String query = "SELECT date, formattedTimein, formattedTimeout, overtime FROM attendance_details WHERE employeeID = ?";
        PreparedStatement pstmt = con.prepareStatement(query);
        pstmt.setString(1, empID);
        
        // Execute the query
      
             
          try (ResultSet resultSet = pstmt.executeQuery()) {
               
              DefaultTableModel tableModel = (DefaultTableModel) attendanceTable.getModel();

                // Clear existing data
                tableModel.setRowCount(0);
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
            Vector<Vector<Object>> data = new Vector<>();
            while (resultSet.next()) {
                Vector<Object> row = new Vector<>();
                row.add(resultSet.getDate("date"));
                row.add(resultSet.getString("formattedTimein"));
                row.add(resultSet.getString("formattedTimeout"));
                row.add(resultSet.getString("overtime"));
                data.add(row);
            }

            // Add rows to the table model
            for (Vector<Object> rowData : data) {
                tableModel.addRow(rowData.toArray());
            }

            
            
            con.close();
            
          }
            
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    // Show and Hide Panels
    HomePanel.show(false);
    ProfilePanel.show(false);
    AttendancePanel.show(true);
    LeavePanel.show(false);    
    PayslipPanel.show(false);   
    }//GEN-LAST:event_btnAttendanceActionPerformed

    private void btnLeaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeaveActionPerformed
        btnLeave.setBackground(new java.awt.Color(33,35,39));
        btnLeave.setForeground(new java.awt.Color(255,153,0));
        btnProfile.setBackground(new java.awt.Color(9,11,15));
        btnProfile.setForeground(new java.awt.Color(255,255,255));
        btnAttendance.setBackground(new java.awt.Color(9,11,15));
        btnAttendance.setForeground(new java.awt.Color(255,255,255));
        btnHome.setBackground(new java.awt.Color(9,11,15));
        btnHome.setForeground(new java.awt.Color(255,255,255));
        btnPayslip.setBackground(new java.awt.Color(9,11,15));
        btnPayslip.setForeground(new java.awt.Color(255,255,255));
        jLabel5.setText("Leave");
        
        String empID = dashboardempNolbl.getText();
        dbManager = new DatabaseManager();
        con = dbManager.getConnection();
        PreparedStatement pstmt = null;
   
    try {
       String query = "SELECT * FROM `leavebalance` WHERE employeeID = ? AND leavetypeID = ?";
       
       // Retrieve Sick Leave balance (leavetypeID 1001)
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, Integer.parseInt (empID));
            pstmt.setInt(2, 1001);  // Sick Leave leavetypeID
            rs = pstmt.executeQuery();
            if (rs.next()) {
                String sickLeaveBalance = rs.getString("leavebalance");
                leaveSickLeaveBalance.setText(sickLeaveBalance);
            } else {
                leaveSickLeaveBalance.setText("0");
            }
       
             // Retrieve Vacation Leave balance (leavetypeID 1002)
        pstmt.setInt(2, 1002);  // Vacation Leave leavetypeID
        rs = pstmt.executeQuery();
        if (rs.next()) {
            String vacationLeaveBalance = rs.getString("leavebalance");
            leaveVacationLeaveBalance.setText(vacationLeaveBalance);
        } else {
            leaveVacationLeaveBalance.setText("0");
        }
            
            
            con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        

    HomePanel.show(false);
    ProfilePanel.show(false);
    AttendancePanel.show(false);
    LeavePanel.show(true);   
    PayslipPanel.show(false); 
    }//GEN-LAST:event_btnLeaveActionPerformed

    private void profileChangePasswordbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileChangePasswordbtnActionPerformed
   
      ChangePassword changepass = new ChangePassword(this);
      changepass.setVisible(true); // Show the ChangePassword form
       
    }//GEN-LAST:event_profileChangePasswordbtnActionPerformed

    private void attendanceRequestOvertimebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendanceRequestOvertimebtnActionPerformed
      String empID = dashboardempNolbl.getText();
        OvertimeRequestForm overtimeform = new OvertimeRequestForm(this);
       overtimeform.setEmployeeid(empID);
       overtimeform.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_attendanceRequestOvertimebtnActionPerformed

    private void viewbtn400001ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbtn400001ActionPerformed

               
Payslip payslip = new Payslip();

dbManager = new DatabaseManager();
        //logIn Code
        try{
            //Class.forName("com.mysql.cj.jdbc.Driver");
            con = dbManager.getConnection();
            int empID = Integer.parseInt(dashboardempNolbl.getText());
            int view401 = 400001;
            
            // Get the application's directory
                File currentDir = new File(System.getProperty("user.dir"));
                
                String reportPath = new File(currentDir, "reports/payslip_mph.jrxml").getAbsolutePath();
                JasperReport jr = JasperCompileManager.compileReport(reportPath);
                
                // Set the path to the image
                String imagePath = new File(currentDir, "reports/mph_logo.png").getAbsolutePath();
                   
//                String payperiodID = rs.getString("PayslipNo");
//                String employeeID = rs.getString("EmployeeID");
//                String name  = rs.getString("Name");
//                String startdate = rs.getString("StartDate");
//                String enddate = rs.getString("EndDate");
//                String position = rs.getString("Position_Department");
                
                Map<String, Object> parameters = new HashMap<>();
                parameters.put("EmployeeID", empID);
                parameters.put("PayslipNo", view401);
                parameters.put("IMAGE_PATH", imagePath); // Pass the image path as a parameter
                
                JasperPrint jp = JasperFillManager.fillReport(jr, parameters, con);
                JasperViewer.viewReport(jp, false);
                
//            
        }catch(Exception e){
            e.printStackTrace();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_viewbtn400001ActionPerformed

    private void viewbtn400002ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbtn400002ActionPerformed

               
Payslip payslip = new Payslip();

dbManager = new DatabaseManager();
        //logIn Code
        try{
            //Class.forName("com.mysql.cj.jdbc.Driver");
            con = dbManager.getConnection();
            int empID = Integer.parseInt(dashboardempNolbl.getText());
            int view402 = 400002;
            
            // Get the application's directory
                File currentDir = new File(System.getProperty("user.dir"));
                
                String reportPath = new File(currentDir, "reports/payslip_mph.jrxml").getAbsolutePath();
                JasperReport jr = JasperCompileManager.compileReport(reportPath);
                
                // Set the path to the image
                String imagePath = new File(currentDir, "reports/mph_logo.png").getAbsolutePath();
                     
//                String payperiodID = rs.getString("PayslipNo");
//                String employeeID = rs.getString("EmployeeID");
//                String name  = rs.getString("Name");
//                String startdate = rs.getString("StartDate");
//                String enddate = rs.getString("EndDate");
//                String position = rs.getString("Position_Department");
                
                Map<String, Object> parameters = new HashMap<>();
                parameters.put("EmployeeID", empID);
                parameters.put("PayslipNo", view402);
                parameters.put("IMAGE_PATH", imagePath); // Pass the image path as a parameter
                
                JasperPrint jp = JasperFillManager.fillReport(jr, parameters, con);
                JasperViewer.viewReport(jp, false);
                
//            
        }catch(Exception e){
            e.printStackTrace();
        }


       
    }//GEN-LAST:event_viewbtn400002ActionPerformed

    private void btnPayslipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayslipActionPerformed
        btnPayslip.setBackground(new java.awt.Color(33,35,39));
        btnPayslip.setForeground(new java.awt.Color(255,153,0));
        btnProfile.setBackground(new java.awt.Color(9,11,15));
        btnProfile.setForeground(new java.awt.Color(255,255,255));
        btnAttendance.setBackground(new java.awt.Color(9,11,15));
        btnAttendance.setForeground(new java.awt.Color(255,255,255));
        btnLeave.setBackground(new java.awt.Color(9,11,15));
        btnLeave.setForeground(new java.awt.Color(255,255,255));
        btnHome.setBackground(new java.awt.Color(9,11,15));
        btnHome.setForeground(new java.awt.Color(255,255,255));
        jLabel5.setText("Payslip");
        
        HomePanel.show(false);
        ProfilePanel.show(false);
        AttendancePanel.show(false);
        LeavePanel.show(false);   
        PayslipPanel.show(true); 
    }//GEN-LAST:event_btnPayslipActionPerformed

    private void viewbtn400003ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbtn400003ActionPerformed
      
                       
Payslip payslip = new Payslip();

dbManager = new DatabaseManager();
        //logIn Code
        try{
            //Class.forName("com.mysql.cj.jdbc.Driver");
            con = dbManager.getConnection();
            int empID = Integer.parseInt(dashboardempNolbl.getText());
            int view403 = 400003;
            
            // Get the application's directory
                File currentDir = new File(System.getProperty("user.dir"));
                
                String reportPath = new File(currentDir, "reports/payslip_mph.jrxml").getAbsolutePath();
                JasperReport jr = JasperCompileManager.compileReport(reportPath);
                
                // Set the path to the image
                String imagePath = new File(currentDir, "reports/mph_logo.png").getAbsolutePath();
//                String payperiodID = rs.getString("PayslipNo");
//                String employeeID = rs.getString("EmployeeID");
//                String name  = rs.getString("Name");
//                String startdate = rs.getString("StartDate");
//                String enddate = rs.getString("EndDate");
//                String position = rs.getString("Position_Department");
                
                Map<String, Object> parameters = new HashMap<>();
                parameters.put("EmployeeID", empID);
                parameters.put("PayslipNo", view403);
                parameters.put("IMAGE_PATH", imagePath); // Pass the image path as a parameter
                
                JasperPrint jp = JasperFillManager.fillReport(jr, parameters, con);
                JasperViewer.viewReport(jp, false);
                
//            
        }catch(Exception e){
            e.printStackTrace();
        }

        
        
    }//GEN-LAST:event_viewbtn400003ActionPerformed

    private void viewbtn400004ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbtn400004ActionPerformed
                      
Payslip payslip = new Payslip();

dbManager = new DatabaseManager();
        //logIn Code
        try{
            //Class.forName("com.mysql.cj.jdbc.Driver");
            con = dbManager.getConnection();
            int empID = Integer.parseInt(dashboardempNolbl.getText());
            int view404 = 400004;
            
            // Get the application's directory
                File currentDir = new File(System.getProperty("user.dir"));
                
                String reportPath = new File(currentDir, "reports/payslip_mph.jrxml").getAbsolutePath();
                JasperReport jr = JasperCompileManager.compileReport(reportPath);
//                String payperiodID = rs.getString("PayslipNo");
//                String employeeID = rs.getString("EmployeeID");
//                String name  = rs.getString("Name");
//                String startdate = rs.getString("StartDate");
//                String enddate = rs.getString("EndDate");
//                String position = rs.getString("Position_Department");
                
                // Set the path to the image
                String imagePath = new File(currentDir, "reports/mph_logo.png").getAbsolutePath();
                
                Map<String, Object> parameters = new HashMap<>();
                parameters.put("EmployeeID", empID);
                parameters.put("PayslipNo", view404);
                parameters.put("IMAGE_PATH", imagePath); // Pass the image path as a parameter
                
                JasperPrint jp = JasperFillManager.fillReport(jr, parameters, con);
                JasperViewer.viewReport(jp, false);
                
//            
        }catch(Exception e){
            e.printStackTrace();
        }

        
        
    }//GEN-LAST:event_viewbtn400004ActionPerformed

    private void viewbtn400005ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbtn400005ActionPerformed
       
                       
Payslip payslip = new Payslip();

dbManager = new DatabaseManager();
        //logIn Code
        try{
            //Class.forName("com.mysql.cj.jdbc.Driver");
            con = dbManager.getConnection();
            int empID = Integer.parseInt(dashboardempNolbl.getText());
            int view405 = 400005;
            
            // Get the application's directory
                File currentDir = new File(System.getProperty("user.dir"));
                
                String reportPath = new File(currentDir, "reports/payslip_mph.jrxml").getAbsolutePath();
                JasperReport jr = JasperCompileManager.compileReport(reportPath);
                
                // Set the path to the image
                String imagePath = new File(currentDir, "reports/mph_logo.png").getAbsolutePath();
                
                Map<String, Object> parameters = new HashMap<>();
                parameters.put("EmployeeID", empID);
                parameters.put("PayslipNo", view405);
                parameters.put("IMAGE_PATH", imagePath); // Pass the image path as a parameter
                
                JasperPrint jp = JasperFillManager.fillReport(jr, parameters, con);
                JasperViewer.viewReport(jp, false);
                
//            
        }catch(Exception e){
            e.printStackTrace();
        }

        
    }//GEN-LAST:event_viewbtn400005ActionPerformed

    private void viewbtn400006ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbtn400006ActionPerformed
       
                       
Payslip payslip = new Payslip();

dbManager = new DatabaseManager();
        //logIn Code
        try{
            //Class.forName("com.mysql.cj.jdbc.Driver");
            con = dbManager.getConnection();
            int empID = Integer.parseInt(dashboardempNolbl.getText());
            int view406 = 400006;
            
            // Get the application's directory
                File currentDir = new File(System.getProperty("user.dir"));
                
                String reportPath = new File(currentDir, "reports/payslip_mph.jrxml").getAbsolutePath();
                JasperReport jr = JasperCompileManager.compileReport(reportPath);
                
                // Set the path to the image
                String imagePath = new File(currentDir, "reports/mph_logo.png").getAbsolutePath();
                
                Map<String, Object> parameters = new HashMap<>();
                parameters.put("EmployeeID", empID);
                parameters.put("PayslipNo", view406);
                parameters.put("IMAGE_PATH", imagePath); // Pass the image path as a parameter
                
                JasperPrint jp = JasperFillManager.fillReport(jr, parameters, con);
                JasperViewer.viewReport(jp, false);
                
//            
        }catch(Exception e){
            e.printStackTrace();
        }

        
        
    }//GEN-LAST:event_viewbtn400006ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
  LeavelistEmployeeview leavelist = new LeavelistEmployeeview();
    String empID = dashboardempNolbl.getText();
    dbManager = new DatabaseManager();
    con = dbManager.getConnection();
        
    
     try {
       String query = "SELECT * FROM leaveapplication WHERE employeeID = ?";
        PreparedStatement pstmt = con.prepareStatement(query);
        pstmt.setString(1, empID);
        
        // Execute the query
      
             
           try (ResultSet resultSet = pstmt.executeQuery()) {
            DefaultTableModel tableModel = (DefaultTableModel) leavelist.getLeaveListTable().getModel();
            
            // Clear existing data
            tableModel.setRowCount(0);
            
            // Get column names if not already set
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
                row.add(resultSet.getInt("leaveapplicationID")); // Assuming leaveapplicationID is an int
                row.add(resultSet.getString("employeeID"));
                row.add(resultSet.getDate("datefiled")); // Assuming datefiled is a Date type in your database
                row.add(resultSet.getString("leavetype"));
                row.add(resultSet.getDate("startdate")); // Assuming startdate is a Date type in your database
                row.add(resultSet.getDate("enddate")); // Assuming enddate is a Date type in your database
                row.add(resultSet.getString("reason"));
                row.add(resultSet.getString("remarks"));
                tableModel.addRow(row);
            }
            
            leavelist.setVisible(true);
        }
            
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
  
    OvertimelistEmpView overtimelist = new OvertimelistEmpView();
    String empID = dashboardempNolbl.getText();
    dbManager = new DatabaseManager();
    con = dbManager.getConnection();
        
    
     try {
       String query = "SELECT * FROM overtimeapplication WHERE employeeID = ?";
        PreparedStatement pstmt = con.prepareStatement(query);
        pstmt.setString(1, empID);
        
        // Execute the query
      
             
           try (ResultSet resultSet = pstmt.executeQuery()) {
            DefaultTableModel tableModel = (DefaultTableModel) overtimelist.getOvertimeTable().getModel();
            
            // Clear existing data
            tableModel.setRowCount(0);
            
            // Get column names if not already set
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
                row.add(resultSet.getInt("overtimerequestID")); // Assuming leaveapplicationID is an int
                row.add(resultSet.getString("employeeID"));
                row.add(resultSet.getDate("datefiled")); // Assuming datefiled is a Date type in your database
                row.add(resultSet.getDate("date"));
                row.add(resultSet.getTime("starttime")); // Assuming startdate is a Date type in your database
                row.add(resultSet.getTime("endtime")); // Assuming enddate is a Date type in your database
                row.add(resultSet.getString("accumulatedovertime"));
                row.add(resultSet.getString("reason"));
                row.add(resultSet.getString("remarks"));
                tableModel.addRow(row);
            }
            
            overtimelist.setVisible(true);
        }
            
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void supervisorRolebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supervisorRolebtnActionPerformed
        RequestsforApproval req = new  RequestsforApproval(); 
        req.setVisible(true);

// TODO add your handling code here:
    }//GEN-LAST:event_supervisorRolebtnActionPerformed

    private void payrollRolebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payrollRolebtnActionPerformed
      PayrollReports pay = new PayrollReports();
      pay.setVisible(true);
    }//GEN-LAST:event_payrollRolebtnActionPerformed

    private void itRolebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itRolebtnActionPerformed
                                         
 IncidentReportsForm inc = new IncidentReportsForm();
    // Get database connection
    dbManager = new DatabaseManager();
    con = dbManager.getConnection();
// SQL query to retrieve data from the incidentreports table
        String sql = "SELECT incidentreportID, employeeID, date, issue, description, status FROM incidentreports";

        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            // Get the table model for jTable2
            DefaultTableModel model = (DefaultTableModel) inc.getjTable2().getModel();

            // Clear existing rows
            model.setRowCount(0);

            // Iterate through the result set and populate the table model
            while (rs.next()) {
                int incidentreportID = rs.getInt("incidentreportID");
                String employeeID = rs.getString("employeeID");
                String date = rs.getString("date");
                String issue = rs.getString("issue");
                String description = rs.getString("description");
                String status = rs.getString("status");

                // Add row to the table model
                model.addRow(new Object[]{incidentreportID, employeeID, date, issue, description, status});
                
                // Debug statement to verify row addition
                System.out.println("Added row: " + incidentreportID + ", " + employeeID + ", " + date + ", " + issue + ", " + description + ", " + status);
            }

            // Set the custom cell editor for the "Status" column
            JComboBox<String> comboBox = new JComboBox<>(new String[]{"pending", "resolved"});
            inc.getjTable2().getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(comboBox));

            // Refresh the table view
            inc.getjTable2().repaint();

        } catch (SQLException e) {
            e.printStackTrace();
        }

   

    // Ensure the form is visible after data population
    inc.setVisible(true);
        
    
    }//GEN-LAST:event_itRolebtnActionPerformed

    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatLightLaf.setup();
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("FlatLightLaf".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AttendancePanel;
    private javax.swing.JPanel DashboardPanel;
    private javax.swing.JPanel HomePanel;
    private javax.swing.JPanel LeavePanel;
    private javax.swing.JComboBox<String> LeavePanelLeaveSelector;
    private javax.swing.JTextArea LeavePanelReason;
    private javax.swing.JButton LeavePanelSubmitButton;
    private javax.swing.JPanel PayslipPanel;
    private javax.swing.JPanel ProfilePanel;
    private javax.swing.JButton attendanceRequestOvertimebtn;
    private javax.swing.JTable attendanceTable;
    private javax.swing.JButton btnAttendance;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLeave;
    private javax.swing.JButton btnPayslip;
    private javax.swing.JButton btnProfile;
    private javax.swing.JLabel dashboardempNolbl;
    private javax.swing.JLabel dashboardfnamelbl;
    private javax.swing.JLabel departmentNamelbl;
    private javax.swing.JButton hrRolebtn;
    private javax.swing.JButton itRolebtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel leaveSickLeaveBalance;
    private javax.swing.JLabel leaveVacationLeaveBalance;
    private javax.swing.JButton logoutbtn;
    private javax.swing.JButton payrollRolebtn;
    private javax.swing.JLabel profileAddress;
    private javax.swing.JLabel profileBirthDate;
    private javax.swing.JButton profileChangePasswordbtn;
    private javax.swing.JLabel profileDepartment;
    private javax.swing.JLabel profileName;
    private javax.swing.JLabel profilePagibigNo;
    private javax.swing.JLabel profilePhilhealthNo;
    private javax.swing.JLabel profilePhoneNumber;
    private javax.swing.JLabel profilePosition;
    private javax.swing.JLabel profileSssNo;
    private javax.swing.JLabel profileStatus;
    private javax.swing.JLabel profileTinNo;
    private javax.swing.JLabel scheduleStatuslbl;
    private javax.swing.JButton supervisorRolebtn;
    private javax.swing.JButton timeInbtn;
    private javax.swing.JLabel timeInlbl;
    private javax.swing.JButton timeOutbtn;
    private javax.swing.JLabel timeOutlbl;
    private javax.swing.JButton viewbtn400001;
    private javax.swing.JButton viewbtn400002;
    private javax.swing.JButton viewbtn400003;
    private javax.swing.JButton viewbtn400004;
    private javax.swing.JButton viewbtn400005;
    private javax.swing.JButton viewbtn400006;
    // End of variables declaration//GEN-END:variables
}
