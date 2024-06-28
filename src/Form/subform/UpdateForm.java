/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Form.subform;

import Methods.DatabaseManager;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import javax.swing.JComboBox;
/**
 *
 * @author Default
 */
public class UpdateForm extends javax.swing.JFrame {
private DatabaseManager dbManager;
java.sql.Connection con = null;
Statement stmt = null;
ResultSet rs = null;
    
String employeeID;
String lastname;
String firstname;
      
String streetAddress;
String city;
String province;
String zip;
String phoneNo;
String email;
String sssNo;
String philhealthNo;
String Tin;
String pagibigNo;
String positionID;
String depID;
String status;
String supervisorID;
String basicSalaryID;


  // Method to set birth date from a java.util.Date object
    public void setBirthDate(Date birthDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(birthDate);
        tfbirthDate.setText(formattedDate);
    }

    // Method to get birth date as a java.util.Date object
    public Date getBirthDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date birthDate = null;
        try {
            birthDate = dateFormat.parse(tfbirthDate.getText());
        } catch (ParseException ex) {
            // Handle parse exception if necessary
            ex.printStackTrace();
        }
        return birthDate;
    }



public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
        UFEmployeeID.setText(employeeID);
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
        lastName.setText(lastname);
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
        firstName.setText(firstname);
    }

  
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
        StreetAddress.setText(streetAddress);
    }

    public void setCity(String city) {
        this.city = city;
        City.setText(city);
    }

    public void setProvince(String province) {
        this.province = province;
        Province.setText(province);
    }

    public void setZip(String zip) {
        this.zip = zip;
        ZipCode.setText(zip);
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
        PhoneNumber.setText(phoneNo);
    }

    public void setEmail(String email) {
        this.email = email;
        Email.setText(email);
    }

    public void setSssNo(String sssNo) {
        this.sssNo = sssNo;
        sss.setText(sssNo);
    }

    public void setPhilhealthNo(String philhealthNo) {
        this.philhealthNo = philhealthNo;
        philhealth.setText(philhealthNo);
    }

    public void setTin(String tino) {
        Tin = tino;
        TIN.setText(tino);
    }

    public void setPagibigNo(String pagibigNo) {
        this.pagibigNo = pagibigNo;
        pagibig.setText(pagibigNo);
    }

  
   
    public void setPositionComboBox(String positionID) {
    Position.setSelectedItem(positionID);
}

public void setDepartmentComboBox(String depID) {
    Department.setSelectedItem(depID);
}

public void setStatusComboBox(String status) {
    Status.setSelectedItem(status);
}

public void setSupervisorComboBox(String supervisorID) {
    SuperVisor.setSelectedItem(supervisorID);
}

public void setBasicSalaryComboBox(String basicSalaryID) {
    BasicSalary.setSelectedItem(basicSalaryID);
}

    public JComboBox<String> getBasicSalary() {
        return BasicSalary;
    }

    public JComboBox<String> getDepartment() {
        return Department;
    }

    public JComboBox<String> getPosition() {
        return Position;
    }

    public JComboBox<String> getStatus() {
        return Status;
    }

    public JComboBox<String> getSuperVisor() {
        return SuperVisor;
    }
           



            
    public UpdateForm() {
        initComponents();
    }

   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lastName = new Methods.JtextFieldP();
        firstName = new Methods.JtextFieldP();
        tfbirthDate = new Methods.JtextFieldP();
        StreetAddress = new Methods.JtextFieldP();
        City = new Methods.JtextFieldP();
        Province = new Methods.JtextFieldP();
        ZipCode = new Methods.JtextFieldP();
        PhoneNumber = new Methods.JtextFieldP();
        Email = new Methods.JtextFieldP();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        sss = new Methods.JtextFieldP();
        philhealth = new Methods.JtextFieldP();
        pagibig = new Methods.JtextFieldP();
        TIN = new Methods.JtextFieldP();
        savebtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        UFEmployeeID = new javax.swing.JLabel();
        Position = new javax.swing.JComboBox<>();
        Department = new javax.swing.JComboBox<>();
        SuperVisor = new javax.swing.JComboBox<>();
        BasicSalary = new javax.swing.JComboBox<>();
        Status = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Employee Information ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Update Form");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Employee Personal Information");

        lastName.setPlaceHolder("Dela Cruz");

        firstName.setPlaceHolder("Juan");

        tfbirthDate.setPlaceHolder("YYYY-MM-DD");

        StreetAddress.setPlaceHolder("Street Address");

        City.setPlaceHolder("City ");
        City.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CityActionPerformed(evt);
            }
        });

        Province.setPlaceHolder("Province");
        Province.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProvinceActionPerformed(evt);
            }
        });

        ZipCode.setPlaceHolder("Zip Code");

        PhoneNumber.setPlaceHolder("Phone Number");

        Email.setPlaceHolder("Email Address");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Employee Company Information");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Employee Government ID's");

        sss.setPlaceHolder("SSS Number");

        philhealth.setPlaceHolder("Philhealth Number");

        pagibig.setPlaceHolder("Pag Ibig Number");

        TIN.setPlaceHolder("TIN");

        savebtn.setBackground(new java.awt.Color(255, 153, 0));
        savebtn.setForeground(new java.awt.Color(255, 255, 255));
        savebtn.setText("Save");
        savebtn.setBorderPainted(false);
        savebtn.setPreferredSize(new java.awt.Dimension(72, 28));
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Employee ID :");

        UFEmployeeID.setForeground(new java.awt.Color(255, 255, 255));

        Position.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "401 - Chief Executive Officer", "402 - Chief Operating Officer", "403 - Chief Finance Officer", "404 - Chief Marketing Officer", "405 - IT Operations and Systems", "406 - HR Manager", "407 - HR Team Leader", "408 - HR Rank and File", "409 - Accounting Head", "410 - Payroll Manager", "411 - Payroll Team Leader", "412 - Payroll Rank and File", "413 - Account Manager", "414 - Account Team Leader", "415 - Account Rank and File", "416 - Sales & Marketing", "417 -  Supply Chain and Logistics", "418 - Customer Service and Relations" }));

        Department.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "501 - Executive", "502 - Operations", "503 - Finance", "504 - Sales and Marketing", "505 - IT", "506 - HR" }));

        SuperVisor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10001 - Manuell G.", "10002 - Antonio L.", "10003 - Bianca A.", "10004 - Isabella R.", "10006 - Andrea  V.", "10007 - Brad S.", "10008 - Alice R.", "10010 - Roderick A.", "10011 - Anthony S.", "10016 - Christian M.", "10017 - Selena D." }));

        BasicSalary.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "20001- Php 22500", "20002 - Php 23250", "20003 - Php 24000", "20004 - Php 24750", "20005 - Php 38475", "20006 - Php 41850", "20007 - Php 42975", "20008 - Php 50825", "20009 - Php 52670", "20010 - Php 53500", "20011 - Php 60000", "20012 - Php 90000" }));

        Status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Probationary", "Regular" }));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Last Name");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("First Name");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Birthday");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Address");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Phone Number");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Email Address");

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText(" Position");

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText(" Department");

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText(" Status");

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText(" Supervisor");

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Basic Salary");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(StreetAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(City, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Province, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UFEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(287, 287, 287)
                                .addComponent(savebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(42, 42, 42)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(43, 43, 43)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel10)
                                    .addComponent(tfbirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Position, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Department, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(Status, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SuperVisor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(BasicSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(sss, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(philhealth, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(pagibig, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(30, 30, 30)
                                            .addComponent(TIN, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 6, Short.MAX_VALUE)))
                        .addGap(22, 22, 22))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(jLabel3)
                .addGap(34, 34, 34)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfbirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(City, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Province, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel14))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Position, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Department, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18))
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(SuperVisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BasicSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(philhealth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pagibig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(UFEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(savebtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CityActionPerformed

    private void ProvinceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProvinceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProvinceActionPerformed

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
// Get the data from form fields
        String lastname = lastName.getText();
        String firstname = firstName.getText();
        String birthDate = tfbirthDate.getText();
        String streetAddress = StreetAddress.getText();
        String city = City.getText();
        String province = Province.getText();
        String zip = ZipCode.getText();
        String phoneNo = PhoneNumber.getText();
        String email = Email.getText();
        String sssNo = sss.getText();
        String philhealthNo = philhealth.getText();
        String tin = TIN.getText();
        String status = (String) Status.getSelectedItem();
        String pagibigNo = pagibig.getText();
        String positionID = extractID((String) Position.getSelectedItem());
        String depID = extractID((String) Department.getSelectedItem());
        String supervisorID = extractID((String) SuperVisor.getSelectedItem());
        String basicSalaryID = extractID((String) BasicSalary.getSelectedItem());
    
    // Validate birthDate format 'MM/dd/yyyy'
    boolean isValidDateFormat = isValidDateFormat(birthDate); // Implement this method if not already done

    // Update the employee information in the database
    dbManager = new DatabaseManager();

    try {
        con = dbManager.getConnection();
        String updateQuery = "UPDATE employee SET lastName = ?, firstName = ?, birthDate = ?, streetAddress = ?, city = ?, province = ?, zip = ?, phoneNo = ?, email = ?, sssNo = ?, philhealthNo = ?, tin = ?, pagibigNo = ?, positionID = ?, depID = ?, status = ?, supervisorID = ?, basicSalaryID = ? WHERE employeeID = ?";
        PreparedStatement pstmt = con.prepareStatement(updateQuery);

        pstmt.setString(1, lastname);
        pstmt.setString(2, firstname);
        pstmt.setString(3, birthDate);
        pstmt.setString(4, streetAddress);
        pstmt.setString(5, city);
        pstmt.setString(6, province);
        pstmt.setString(7, zip);
        pstmt.setString(8, phoneNo);
        pstmt.setString(9, email);
        pstmt.setString(10, sssNo);
        pstmt.setString(11, philhealthNo);
        pstmt.setString(12, tin);
        pstmt.setString(13, pagibigNo);
        pstmt.setString(14, positionID);
        pstmt.setString(15, depID);
        pstmt.setString(16, status);
        pstmt.setString(17, supervisorID);
        pstmt.setString(18, basicSalaryID);
        pstmt.setString(19, employeeID);

        int rowsUpdated = pstmt.executeUpdate();
        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(this, "Employee updated successfully!");
            dbManager.refreshEmployeeDetailsView();
            this.show(false);
        } else {
            JOptionPane.showMessageDialog(this, "Employee update failed!");
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error updating employee information: " + ex.getMessage());
    } finally {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
            // TODO add your handling code here:
    }//GEN-LAST:event_savebtnActionPerformed

    // Example method to extract ID from JComboBox selection
private String extractID(String selectedItem) {
    if (selectedItem != null && selectedItem.contains(" - ")) {
        return selectedItem.split(" - ")[0].trim(); // Extracts the ID part before " - "
    }
    return null; // Handle appropriately if format doesn't match expected
}

    
    // Method to validate date format
private boolean isValidDateFormat(String dateStr) {
    try {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        sdf.setLenient(false); // Disable lenient parsing
        sdf.parse(dateStr);
        return true;
    } catch (ParseException e) {
        return false;
    }
}

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
            java.util.logging.Logger.getLogger(UpdateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BasicSalary;
    private Methods.JtextFieldP City;
    private javax.swing.JComboBox<String> Department;
    private Methods.JtextFieldP Email;
    private Methods.JtextFieldP PhoneNumber;
    private javax.swing.JComboBox<String> Position;
    private Methods.JtextFieldP Province;
    private javax.swing.JComboBox<String> Status;
    private Methods.JtextFieldP StreetAddress;
    private javax.swing.JComboBox<String> SuperVisor;
    private Methods.JtextFieldP TIN;
    private javax.swing.JLabel UFEmployeeID;
    private Methods.JtextFieldP ZipCode;
    private Methods.JtextFieldP firstName;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private Methods.JtextFieldP lastName;
    private Methods.JtextFieldP pagibig;
    private Methods.JtextFieldP philhealth;
    private javax.swing.JButton savebtn;
    private Methods.JtextFieldP sss;
    private Methods.JtextFieldP tfbirthDate;
    // End of variables declaration//GEN-END:variables
}
