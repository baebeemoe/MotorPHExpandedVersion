/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Form;

import Form.subform.ChangePassword;
import Form.subform.OvertimeRequestForm;
import Form.subform.Payslip;
import Methods.Attendance;
import Methods.DatabaseManager;
import com.sun.jdi.connect.spi.Connection;
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
import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

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
        jPanel3 = new javax.swing.JPanel();
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
        AttendancePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        attendanceTable = new javax.swing.JTable();
        attendanceRequestOvertimebtn = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
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
        jLabel115 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
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
        jPanel6 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        itRolebtn = new javax.swing.JButton();
        supervisorRolebtn = new javax.swing.JButton();
        hrRolebtn = new javax.swing.JButton();
        payrollRolebtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0,90));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PayslipPanel.setBackground(new java.awt.Color(0, 0, 0));
        PayslipPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.white, new java.awt.Color(255, 153, 51)));
        PayslipPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel55.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("Payslip Records");
        PayslipPanel.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, new java.awt.Color(255, 102, 0)));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("PayPeriod ID");
        jLabel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel12.setOpaque(true);

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Start Date");
        jLabel16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel16.setOpaque(true);

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("End Date");
        jLabel17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel17.setOpaque(true);

        jLabel34.setBackground(new java.awt.Color(255, 255, 255));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("400002");
        jLabel34.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel34.setOpaque(true);

        jLabel43.setBackground(new java.awt.Color(255, 255, 255));
        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("2022-09-16");
        jLabel43.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel43.setOpaque(true);

        jLabel44.setBackground(new java.awt.Color(255, 255, 255));
        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("2022-09-30");
        jLabel44.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel44.setOpaque(true);

        jLabel45.setBackground(new java.awt.Color(255, 255, 255));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("400003");
        jLabel45.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel45.setOpaque(true);

        jLabel46.setBackground(new java.awt.Color(255, 255, 255));
        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("2022-10-01");
        jLabel46.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel46.setOpaque(true);

        jLabel47.setBackground(new java.awt.Color(255, 255, 255));
        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("2022-10-15");
        jLabel47.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel47.setOpaque(true);

        jLabel48.setBackground(new java.awt.Color(255, 255, 255));
        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("2022-09-15");
        jLabel48.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel48.setOpaque(true);

        jLabel49.setBackground(new java.awt.Color(255, 255, 255));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("400001");
        jLabel49.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel49.setOpaque(true);

        jLabel50.setBackground(new java.awt.Color(255, 255, 255));
        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("2022-09-01");
        jLabel50.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel50.setOpaque(true);

        jLabel51.setBackground(new java.awt.Color(255, 255, 255));
        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("2022-10-31");
        jLabel51.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel51.setOpaque(true);

        jLabel52.setBackground(new java.awt.Color(255, 255, 255));
        jLabel52.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("2022-10-16");
        jLabel52.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel52.setOpaque(true);

        jLabel53.setBackground(new java.awt.Color(255, 255, 255));
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("400004");
        jLabel53.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel53.setOpaque(true);

        jLabel54.setBackground(new java.awt.Color(255, 255, 255));
        jLabel54.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("2022-11-01");
        jLabel54.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel54.setOpaque(true);

        jLabel56.setBackground(new java.awt.Color(255, 255, 255));
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("400005");
        jLabel56.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel56.setOpaque(true);

        jLabel57.setBackground(new java.awt.Color(255, 255, 255));
        jLabel57.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("2022-11-15");
        jLabel57.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel57.setOpaque(true);

        jLabel58.setBackground(new java.awt.Color(255, 255, 255));
        jLabel58.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("2022-11-30");
        jLabel58.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel58.setOpaque(true);

        jLabel59.setBackground(new java.awt.Color(255, 255, 255));
        jLabel59.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("2022-11-16");
        jLabel59.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel59.setOpaque(true);

        jLabel60.setBackground(new java.awt.Color(255, 255, 255));
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("400006");
        jLabel60.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel60.setOpaque(true);

        viewbtn400001.setText("View");
        viewbtn400001.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        viewbtn400001.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtn400001ActionPerformed(evt);
            }
        });

        viewbtn400002.setText("View");
        viewbtn400002.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        viewbtn400002.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtn400002ActionPerformed(evt);
            }
        });

        viewbtn400003.setText("View");
        viewbtn400003.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        viewbtn400003.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtn400003ActionPerformed(evt);
            }
        });

        viewbtn400004.setText("View");
        viewbtn400004.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        viewbtn400004.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtn400004ActionPerformed(evt);
            }
        });

        viewbtn400005.setText("View");
        viewbtn400005.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        viewbtn400005.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtn400005ActionPerformed(evt);
            }
        });

        viewbtn400006.setText("View");
        viewbtn400006.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        viewbtn400006.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtn400006ActionPerformed(evt);
            }
        });

        jLabel61.setBackground(new java.awt.Color(255, 255, 255));
        jLabel61.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
                    .addComponent(viewbtn400006, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewbtn400001, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewbtn400002, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewbtn400003, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewbtn400004, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewbtn400005, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(viewbtn400006, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        PayslipPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 790, 250));

        jPanel3.add(PayslipPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 125, 971, 380));

        ProfilePanel.setBackground(new java.awt.Color(0, 0, 0));
        ProfilePanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(255, 204, 51), null, null, java.awt.Color.white));

        jPanel8.setBackground(new java.awt.Color(153, 153, 153));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Profile", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user (2).png"))); // NOI18N

        profileName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        profilePosition.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

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

        jPanel9.setBackground(new java.awt.Color(153, 153, 153));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "My Account Numbers", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel35.setText("SSS No");

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel36.setText("TIN No");

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel37.setText("Pagibig No");

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel38.setText("Philhealth No");

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel39.setText(":");

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel40.setText(":");

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel41.setText(":");

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel42.setText(":");

        profileChangePasswordbtn.setText("Change Password");
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
                        .addComponent(profileChangePasswordbtn)
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
                .addComponent(profileChangePasswordbtn)
                .addGap(22, 22, 22))
        );

        jPanel10.setBackground(new java.awt.Color(153, 153, 153));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1)));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel28.setText("Status");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel29.setText("Department");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel30.setText("Birth Date");

        jLabel31.setText(":");

        jLabel32.setText(":");

        jLabel33.setText(":");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
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
                .addContainerGap(20, Short.MAX_VALUE))
        );
        ProfilePanelLayout.setVerticalGroup(
            ProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfilePanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(ProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ProfilePanelLayout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel3.add(ProfilePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 970, 380));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnProfile.setText("Profile");
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });

        btnAttendance.setText("Attendance");
        btnAttendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttendanceActionPerformed(evt);
            }
        });

        btnLeave.setText("Leave");
        btnLeave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeaveActionPerformed(evt);
            }
        });

        btnPayslip.setText("Payslip");
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
                .addComponent(btnHome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnProfile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAttendance)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLeave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPayslip)
                .addContainerGap(186, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 122, -1, 380));

        DashboardPanel.setBackground(new java.awt.Color(0, 0, 0,50));
        DashboardPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51,70), 3, true));
        DashboardPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("Dashboard");
        DashboardPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 21, -1, 56));

        jSeparator3.setBackground(new java.awt.Color(255, 153, 51));
        jSeparator3.setForeground(new java.awt.Color(255, 153, 0));
        jSeparator3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        DashboardPanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, -1, 100));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0,10));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Welcome, ");

        dashboardfnamelbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dashboardfnamelbl.setForeground(new java.awt.Color(255, 255, 255));

        logoutbtn.setBackground(new java.awt.Color(204, 0, 0));
        logoutbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logoutbtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutbtn.setText("LogOut");
        logoutbtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 51, 0), 1, true));
        logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbtnActionPerformed(evt);
            }
        });

        dashboardempNolbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dashboardempNolbl.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dashboardfnamelbl, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                    .addComponent(dashboardempNolbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logoutbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(dashboardfnamelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dashboardempNolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );

        DashboardPanel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 340, 80));

        jPanel3.add(DashboardPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 19, 971, -1));

        AttendancePanel.setBackground(new java.awt.Color(0, 0, 0));

        attendanceTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, new java.awt.Color(255, 153, 0)));
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

        attendanceRequestOvertimebtn.setText("Request Overtime");
        attendanceRequestOvertimebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendanceRequestOvertimebtnActionPerformed(evt);
            }
        });

        jButton4.setText("Overtime Request List");

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
                        .addComponent(jButton4))
                    .addComponent(jLabel11))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        AttendancePanelLayout.setVerticalGroup(
            AttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AttendancePanelLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(attendanceRequestOvertimebtn))
                .addGap(9, 9, 9))
        );

        jPanel3.add(AttendancePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 970, 380));

        LeavePanel.setBackground(new java.awt.Color(0, 0, 0));
        LeavePanel.setPreferredSize(new java.awt.Dimension(970, 370));

        jPanel11.setBackground(new java.awt.Color(153, 153, 153));
        jPanel11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, new java.awt.Color(255, 153, 0)));

        jLabel112.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel112.setText("Leave Type");

        LeavePanelLeaveSelector.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        LeavePanelLeaveSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Leave Type", "Vacation Leave", "Sick Leave", "Emergency Leave" }));
        LeavePanelLeaveSelector.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        LeavePanelLeaveSelector.setName("Choose the Type of Leave"); // NOI18N

        jLabel114.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel114.setText("Date");

        jLabel62.setText("Start Date");

        jLabel63.setText("End Date");

        jLabel113.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel113.setText("Reason");

        LeavePanelReason.setColumns(20);
        LeavePanelReason.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        LeavePanelReason.setRows(5);
        LeavePanelReason.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        LeavePanelSubmitButton.setText("Submit");
        LeavePanelSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeavePanelSubmitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel112)
                            .addComponent(jLabel114))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(LeavePanelLeaveSelector, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LeavePanelReason, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addComponent(LeavePanelSubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel11Layout.createSequentialGroup()
                                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel113)
                                                .addGroup(jPanel11Layout.createSequentialGroup()
                                                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(0, 0, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 212, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jLabel113)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LeavePanelReason, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LeavePanelSubmitButton)
                .addContainerGap())
        );

        jPanel12.setBackground(new java.awt.Color(153, 153, 153));
        jPanel12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, new java.awt.Color(255, 153, 0)));

        jLabel117.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel117.setText("Sick Leave");

        jLabel116.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel116.setText("Vacation Leave");

        jLabel115.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel115.setText("Leave Balance");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel115)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(leaveSickLeaveBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(leaveVacationLeaveBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel117)
                        .addGap(106, 106, 106)
                        .addComponent(jLabel116)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel115)
                .addGap(31, 31, 31)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(leaveSickLeaveBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(leaveVacationLeaveBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel117)
                    .addComponent(jLabel116))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel111.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel111.setForeground(new java.awt.Color(255, 255, 255));
        jLabel111.setText("Leave Application");

        javax.swing.GroupLayout LeavePanelLayout = new javax.swing.GroupLayout(LeavePanel);
        LeavePanel.setLayout(LeavePanelLayout);
        LeavePanelLayout.setHorizontalGroup(
            LeavePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeavePanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(LeavePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeavePanelLayout.createSequentialGroup()
                        .addComponent(jLabel111)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(LeavePanelLayout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );
        LeavePanelLayout.setVerticalGroup(
            LeavePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeavePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel111)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LeavePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(43, 43, 43))
        );

        jPanel3.add(LeavePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 970, 390));

        HomePanel.setBackground(new java.awt.Color(0, 0, 0));
        HomePanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.white, new java.awt.Color(255, 153, 51)));
        HomePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));
        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(255, 153, 0), new java.awt.Color(255, 102, 0)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Department :");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 69, 121, -1));

        timeInlbl.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        timeInlbl.setForeground(new java.awt.Color(0, 204, 51));
        timeInlbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(timeInlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 104, 80));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Time In ");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Time Out ");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, -1, -1));

        timeOutlbl.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        timeOutlbl.setForeground(new java.awt.Color(204, 51, 0));
        timeOutlbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(timeOutlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 104, 80));

        jSeparator2.setBackground(new java.awt.Color(255, 153, 51));
        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jPanel5.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 30, -1, 208));

        departmentNamelbl.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(departmentNamelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 91, 121, 20));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Schedule :");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 119, 121, -1));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 141, 121, 20));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Schedule Status :");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 169, 121, -1));

        scheduleStatuslbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        scheduleStatuslbl.setForeground(new java.awt.Color(102, 255, 0));
        jPanel5.add(scheduleStatuslbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 191, 121, 20));

        jSeparator5.setBackground(new java.awt.Color(255, 153, 51));
        jSeparator5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jPanel5.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 30, 0, 208));

        timeInbtn.setBackground(new java.awt.Color(0, 255, 0));
        timeInbtn.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        timeInbtn.setText("Time In");
        timeInbtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 0), 1, true));
        timeInbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeInbtnActionPerformed(evt);
            }
        });
        jPanel5.add(timeInbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 320, 50));

        timeOutbtn.setBackground(new java.awt.Color(255, 0, 0));
        timeOutbtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        timeOutbtn.setText("Time Out");
        timeOutbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0), 3));
        timeOutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeOutbtnActionPerformed(evt);
            }
        });
        jPanel5.add(timeOutbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 320, 50));

        HomePanel.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 578, 290));

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));
        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(255, 153, 0), new java.awt.Color(255, 153, 0)));

        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Present");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Absent");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Payroll Health");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addGap(116, 116, 116))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21))
                .addGap(14, 14, 14))
        );

        HomePanel.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(622, 12, -1, -1));

        jPanel7.setBackground(new java.awt.Color(153, 153, 153));
        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(255, 153, 0), new java.awt.Color(255, 153, 0)));

        jLabel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Requests");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Leave Request");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Overtime Request");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(99, 99, 99))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel27))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(49, 49, 49)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(37, 37, 37))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        HomePanel.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(622, 185, 317, -1));

        itRolebtn.setText("System Records");
        HomePanel.add(itRolebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 308, 580, 40));

        supervisorRolebtn.setText("Requests Records");
        HomePanel.add(supervisorRolebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 308, 580, 40));

        hrRolebtn.setText("Employee Records");
        hrRolebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hrRolebtnActionPerformed(evt);
            }
        });
        HomePanel.add(hrRolebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 308, 580, 40));

        payrollRolebtn.setText("Payroll Reports");
        HomePanel.add(payrollRolebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 308, 578, 40));

        jPanel3.add(HomePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 125, 971, 380));

        jLabel4.setFont(new java.awt.Font("Lucida Bright", 1, 21)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("People Portal");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 75, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("PH");
        jLabel3.setIconTextGap(0);
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 33, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Motor");
        jLabel2.setIconTextGap(0);
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 33, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 153, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 153, 0));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 547, 1216, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 600));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Default.LAPTOP-JISTTHH9\\Downloads\\background.png")); // NOI18N
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
        // TODO add your handling code here:
    }//GEN-LAST:event_hrRolebtnActionPerformed

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
         String empID = dashboardempNolbl.getText();
       
         dbManager = new DatabaseManager();
         con = dbManager.getConnection();
         
        try {
       String query = "SELECT * FROM `employee_details` WHERE employeeID = ?";
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
    HomePanel.show(true);
    ProfilePanel.show(false);
    AttendancePanel.show(false);
    LeavePanel.show(false);
    PayslipPanel.show(false);
    
    // TODO add your handling code here:
    }//GEN-LAST:event_btnHomeActionPerformed

    private void LeavePanelSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeavePanelSubmitButtonActionPerformed
     
    }//GEN-LAST:event_LeavePanelSubmitButtonActionPerformed

    private void btnAttendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttendanceActionPerformed
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
    // Show and Hide Panels
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
      OvertimeRequestForm overtimeform = new OvertimeRequestForm(this);
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
            String empID = dashboardempNolbl.getText();
            String view401 = "400001";
           
            
            stmt = con.createStatement();
             
            String query = "SELECT * FROM `payslip_view` where payPeriodID ='" +view401+"'and employeeID='"+empID+"'" ; 
            rs = stmt.executeQuery(query);
            if(rs.next()){
                
                
                String payperiodID = rs.getString("payPeriodID");
                String employeeID = rs.getString("employeeID");
                String name  = rs.getString("name");
                String startdate = rs.getString("startDate");
                String enddate = rs.getString("endDate");
                String position = rs.getString("position_department");
                
                
                String monthlyrate = rs.getString("basicSalary");
                String dailyrate = rs.getString("dailyrate");
                String daysworked = rs.getString("DaysWorked");
                String overtime = rs.getString("accumulatedOvertime");
                String grosssalary = rs.getString("grossSalaryWithOvertime");
                
                
                String rice = rs.getString("Rice");
                String clothing = rs.getString("Clothing");
                String phone = rs.getString("Phone");
                String totalben = rs.getString("TotalIndividualBenefits");
                
                String sss = rs.getString("SSS");
                String pagibig = rs.getString("PagIBIG");
                String philhealth = rs.getString("PhilHealth");
                String tax = rs.getString("Tax");
                String totaldeduction = rs.getString("TotalDeduction");
                
                
                String netpay = rs.getString("netpay");
                
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
                payslip.setSetphone(phone);
                payslip.setSetclothing(clothing);
                payslip.setSettotalbenefit(totalben);
                payslip.setSetsss(sss);
                payslip.setSetphilhealth(philhealth);
                payslip.setSetpagibig(pagibig);
                payslip.setSettax(tax);
                payslip.setSettotalDeduction(totaldeduction);
                payslip.setSettotaldeduction(totaldeduction);
                payslip.setSetgrossIncome(grosssalary);
                payslip.setSettotalBenefit(totalben);
                payslip.setSetnetPay(netpay);
                
                payslip.show(true);
                
                
                
                
               
              
                
            }else{
                JOptionPane.showMessageDialog(this, "unmatched data");
            }
            
            
            con.close();
            
        }catch(Exception e){
            
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
            String empID = dashboardempNolbl.getText();
            String view402 = "400002";
           
            
            stmt = con.createStatement();
             
            String query = "SELECT * FROM `payslip_view` where payPeriodID ='" +view402+"'and employeeID='"+empID+"'" ; 
            rs = stmt.executeQuery(query);
            if(rs.next()){
                
                
                String payperiodID = rs.getString("payPeriodID");
                String employeeID = rs.getString("employeeID");
                String name  = rs.getString("name");
                String startdate = rs.getString("startDate");
                String enddate = rs.getString("endDate");
                String position = rs.getString("position_department");
                
                
                String monthlyrate = rs.getString("basicSalary");
                String dailyrate = rs.getString("dailyrate");
                String daysworked = rs.getString("DaysWorked");
                String overtime = rs.getString("accumulatedOvertime");
                String grosssalary = rs.getString("grossSalaryWithOvertime");
                
                
                String rice = rs.getString("Rice");
                String clothing = rs.getString("Clothing");
                String phone = rs.getString("Phone");
                String totalben = rs.getString("TotalIndividualBenefits");
                
                String sss = rs.getString("SSS");
                String pagibig = rs.getString("PagIBIG");
                String philhealth = rs.getString("PhilHealth");
                String tax = rs.getString("Tax");
                String totaldeduction = rs.getString("TotalDeduction");
                
                
                String netpay = rs.getString("netpay");
                
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
                payslip.setSetphone(phone);
                payslip.setSetclothing(clothing);
                payslip.setSettotalbenefit(totalben);
                payslip.setSetsss(sss);
                payslip.setSetphilhealth(philhealth);
                payslip.setSetpagibig(pagibig);
                payslip.setSettax(tax);
                payslip.setSettotalDeduction(totaldeduction);
                payslip.setSettotaldeduction(totaldeduction);
                payslip.setSetgrossIncome(grosssalary);
                payslip.setSettotalBenefit(totalben);
                payslip.setSetnetPay(netpay);
                
                payslip.show(true);
                
                
                
                
               
              
                
            }else{
                JOptionPane.showMessageDialog(this, "unmatched data");
            }
            
            
            con.close();
            
        }catch(Exception e){
            
        }


       
    }//GEN-LAST:event_viewbtn400002ActionPerformed

    private void btnPayslipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayslipActionPerformed
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
            String empID = dashboardempNolbl.getText();
            String view403 = "400003";
           
            
            stmt = con.createStatement();
             
            String query = "SELECT * FROM `payslip_view` where payPeriodID ='" +view403+"'and employeeID='"+empID+"'" ; 
            rs = stmt.executeQuery(query);
            if(rs.next()){
                
                
                String payperiodID = rs.getString("payPeriodID");
                String employeeID = rs.getString("employeeID");
                String name  = rs.getString("name");
                String startdate = rs.getString("startDate");
                String enddate = rs.getString("endDate");
                String position = rs.getString("position_department");
                
                
                String monthlyrate = rs.getString("basicSalary");
                String dailyrate = rs.getString("dailyrate");
                String daysworked = rs.getString("DaysWorked");
                String overtime = rs.getString("accumulatedOvertime");
                String grosssalary = rs.getString("grossSalaryWithOvertime");
                
                
                String rice = rs.getString("Rice");
                String clothing = rs.getString("Clothing");
                String phone = rs.getString("Phone");
                String totalben = rs.getString("TotalIndividualBenefits");
                
                String sss = rs.getString("SSS");
                String pagibig = rs.getString("PagIBIG");
                String philhealth = rs.getString("PhilHealth");
                String tax = rs.getString("Tax");
                String totaldeduction = rs.getString("TotalDeduction");
                
                
                String netpay = rs.getString("netpay");
                
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
                payslip.setSetphone(phone);
                payslip.setSetclothing(clothing);
                payslip.setSettotalbenefit(totalben);
                payslip.setSetsss(sss);
                payslip.setSetphilhealth(philhealth);
                payslip.setSetpagibig(pagibig);
                payslip.setSettax(tax);
                payslip.setSettotalDeduction(totaldeduction);
                payslip.setSettotaldeduction(totaldeduction);
                payslip.setSetgrossIncome(grosssalary);
                payslip.setSettotalBenefit(totalben);
                payslip.setSetnetPay(netpay);
                
                payslip.show(true);
                
                
                
                
               
              
                
            }else{
                JOptionPane.showMessageDialog(this, "unmatched data");
            }
            
            
            con.close();
            
        }catch(Exception e){
            
        }

        
        
    }//GEN-LAST:event_viewbtn400003ActionPerformed

    private void viewbtn400004ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbtn400004ActionPerformed
                      
Payslip payslip = new Payslip();

dbManager = new DatabaseManager();
        //logIn Code
        try{
            //Class.forName("com.mysql.cj.jdbc.Driver");
            con = dbManager.getConnection();
            String empID = dashboardempNolbl.getText();
            String view404 = "400004";
           
            
            stmt = con.createStatement();
             
            String query = "SELECT * FROM `payslip_view` where payPeriodID ='" +view404+"'and employeeID='"+empID+"'" ; 
            rs = stmt.executeQuery(query);
            if(rs.next()){
                
                
                String payperiodID = rs.getString("payPeriodID");
                String employeeID = rs.getString("employeeID");
                String name  = rs.getString("name");
                String startdate = rs.getString("startDate");
                String enddate = rs.getString("endDate");
                String position = rs.getString("position_department");
                
                
                String monthlyrate = rs.getString("basicSalary");
                String dailyrate = rs.getString("dailyrate");
                String daysworked = rs.getString("DaysWorked");
                String overtime = rs.getString("accumulatedOvertime");
                String grosssalary = rs.getString("grossSalaryWithOvertime");
                
                
                String rice = rs.getString("Rice");
                String clothing = rs.getString("Clothing");
                String phone = rs.getString("Phone");
                String totalben = rs.getString("TotalIndividualBenefits");
                
                String sss = rs.getString("SSS");
                String pagibig = rs.getString("PagIBIG");
                String philhealth = rs.getString("PhilHealth");
                String tax = rs.getString("Tax");
                String totaldeduction = rs.getString("TotalDeduction");
                
                
                String netpay = rs.getString("netpay");
                
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
                payslip.setSetphone(phone);
                payslip.setSetclothing(clothing);
                payslip.setSettotalbenefit(totalben);
                payslip.setSetsss(sss);
                payslip.setSetphilhealth(philhealth);
                payslip.setSetpagibig(pagibig);
                payslip.setSettax(tax);
                payslip.setSettotalDeduction(totaldeduction);
                payslip.setSettotaldeduction(totaldeduction);
                payslip.setSetgrossIncome(grosssalary);
                payslip.setSettotalBenefit(totalben);
                payslip.setSetnetPay(netpay);
                
                payslip.show(true);
                
                
                
                
               
              
                
            }else{
                JOptionPane.showMessageDialog(this, "unmatched data");
            }
            
            
            con.close();
            
        }catch(Exception e){
            
        }

        
        
    }//GEN-LAST:event_viewbtn400004ActionPerformed

    private void viewbtn400005ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbtn400005ActionPerformed
       
                       
Payslip payslip = new Payslip();

dbManager = new DatabaseManager();
        //logIn Code
        try{
            //Class.forName("com.mysql.cj.jdbc.Driver");
            con = dbManager.getConnection();
            String empID = dashboardempNolbl.getText();
            String view405 = "400005";
           
            
            stmt = con.createStatement();
             
            String query = "SELECT * FROM `payslip_view` where payPeriodID ='" +view405+"'and employeeID='"+empID+"'" ; 
            rs = stmt.executeQuery(query);
            if(rs.next()){
                
                
                String payperiodID = rs.getString("payPeriodID");
                String employeeID = rs.getString("employeeID");
                String name  = rs.getString("name");
                String startdate = rs.getString("startDate");
                String enddate = rs.getString("endDate");
                String position = rs.getString("position_department");
                
                
                String monthlyrate = rs.getString("basicSalary");
                String dailyrate = rs.getString("dailyrate");
                String daysworked = rs.getString("DaysWorked");
                String overtime = rs.getString("accumulatedOvertime");
                String grosssalary = rs.getString("grossSalaryWithOvertime");
                
                
                String rice = rs.getString("Rice");
                String clothing = rs.getString("Clothing");
                String phone = rs.getString("Phone");
                String totalben = rs.getString("TotalIndividualBenefits");
                
                String sss = rs.getString("SSS");
                String pagibig = rs.getString("PagIBIG");
                String philhealth = rs.getString("PhilHealth");
                String tax = rs.getString("Tax");
                String totaldeduction = rs.getString("TotalDeduction");
                
                
                String netpay = rs.getString("netpay");
                
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
                payslip.setSetphone(phone);
                payslip.setSetclothing(clothing);
                payslip.setSettotalbenefit(totalben);
                payslip.setSetsss(sss);
                payslip.setSetphilhealth(philhealth);
                payslip.setSetpagibig(pagibig);
                payslip.setSettax(tax);
                payslip.setSettotalDeduction(totaldeduction);
                payslip.setSettotaldeduction(totaldeduction);
                payslip.setSetgrossIncome(grosssalary);
                payslip.setSettotalBenefit(totalben);
                payslip.setSetnetPay(netpay);
                
                payslip.show(true);
                
                
                
                
               
              
                
            }else{
                JOptionPane.showMessageDialog(this, "unmatched data");
            }
            
            
            con.close();
            
        }catch(Exception e){
            
        }

        
    }//GEN-LAST:event_viewbtn400005ActionPerformed

    private void viewbtn400006ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbtn400006ActionPerformed
       
                       
Payslip payslip = new Payslip();

dbManager = new DatabaseManager();
        //logIn Code
        try{
            //Class.forName("com.mysql.cj.jdbc.Driver");
            con = dbManager.getConnection();
            String empID = dashboardempNolbl.getText();
            String view406 = "400006";
           
            
            stmt = con.createStatement();
             
            String query = "SELECT * FROM `payslip_view` where payPeriodID ='" +view406+"'and employeeID='"+empID+"'" ; 
            rs = stmt.executeQuery(query);
            if(rs.next()){
                
                
                String payperiodID = rs.getString("payPeriodID");
                String employeeID = rs.getString("employeeID");
                String name  = rs.getString("name");
                String startdate = rs.getString("startDate");
                String enddate = rs.getString("endDate");
                String position = rs.getString("position_department");
                
                
                String monthlyrate = rs.getString("basicSalary");
                String dailyrate = rs.getString("dailyrate");
                String daysworked = rs.getString("DaysWorked");
                String overtime = rs.getString("accumulatedOvertime");
                String grosssalary = rs.getString("grossSalaryWithOvertime");
                
                
                String rice = rs.getString("Rice");
                String clothing = rs.getString("Clothing");
                String phone = rs.getString("Phone");
                String totalben = rs.getString("TotalIndividualBenefits");
                
                String sss = rs.getString("SSS");
                String pagibig = rs.getString("PagIBIG");
                String philhealth = rs.getString("PhilHealth");
                String tax = rs.getString("Tax");
                String totaldeduction = rs.getString("TotalDeduction");
                
                
                String netpay = rs.getString("netpay");
                
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
                payslip.setSetphone(phone);
                payslip.setSetclothing(clothing);
                payslip.setSettotalbenefit(totalben);
                payslip.setSetsss(sss);
                payslip.setSetphilhealth(philhealth);
                payslip.setSetpagibig(pagibig);
                payslip.setSettax(tax);
                payslip.setSettotalDeduction(totaldeduction);
                payslip.setSettotaldeduction(totaldeduction);
                payslip.setSetgrossIncome(grosssalary);
                payslip.setSettotalBenefit(totalben);
                payslip.setSetnetPay(netpay);
                
                payslip.show(true);
                
                
                
                
               
              
                
            }else{
                JOptionPane.showMessageDialog(this, "unmatched data");
            }
            
            
            con.close();
            
        }catch(Exception e){
            
        }

        
        
    }//GEN-LAST:event_viewbtn400006ActionPerformed

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
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
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
