/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Form;

import javax.swing.JPanel;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Default
 */
public class DashboardTest {
    
    public DashboardTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getEmployeeID method, of class Dashboard.
     */
    @Test
    public void testGetEmployeeID() {
        System.out.println("getEmployeeID");
        Dashboard instance = new Dashboard();
        String expResult = "";
        String result = instance.getEmployeeID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmployeeName method, of class Dashboard.
     */
    @Test
    public void testGetEmployeeName() {
        System.out.println("getEmployeeName");
        Dashboard instance = new Dashboard();
        String expResult = "";
        String result = instance.getEmployeeName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getdepartmentName method, of class Dashboard.
     */
    @Test
    public void testGetdepartmentName() {
        System.out.println("getdepartmentName");
        Dashboard instance = new Dashboard();
        String expResult = "";
        String result = instance.getdepartmentName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHomePanel method, of class Dashboard.
     */
    @Test
    public void testGetHomePanel() {
        System.out.println("getHomePanel");
        Dashboard instance = new Dashboard();
        JPanel expResult = null;
        JPanel result = instance.getHomePanel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProfilePanel method, of class Dashboard.
     */
    @Test
    public void testGetProfilePanel() {
        System.out.println("getProfilePanel");
        Dashboard instance = new Dashboard();
        JPanel expResult = null;
        JPanel result = instance.getProfilePanel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAttendancePanel method, of class Dashboard.
     */
    @Test
    public void testGetAttendancePanel() {
        System.out.println("getAttendancePanel");
        Dashboard instance = new Dashboard();
        JPanel expResult = null;
        JPanel result = instance.getAttendancePanel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLeavePanel method, of class Dashboard.
     */
    @Test
    public void testGetLeavePanel() {
        System.out.println("getLeavePanel");
        Dashboard instance = new Dashboard();
        JPanel expResult = null;
        JPanel result = instance.getLeavePanel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmployeeID method, of class Dashboard.
     */
    @Test
    public void testSetEmployeeID() {
        System.out.println("setEmployeeID");
        String employeeID = "";
        Dashboard instance = new Dashboard();
        instance.setEmployeeID(employeeID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmployeefName method, of class Dashboard.
     */
    @Test
    public void testSetEmployeefName() {
        System.out.println("setEmployeefName");
        String employeefName = "";
        Dashboard instance = new Dashboard();
        instance.setEmployeefName(employeefName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setdepartmentName method, of class Dashboard.
     */
    @Test
    public void testSetdepartmentName() {
        System.out.println("setdepartmentName");
        String departmentName = "";
        Dashboard instance = new Dashboard();
        instance.setdepartmentName(departmentName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of applyRoleRestrictions method, of class Dashboard.
     */
    @Test
    public void testApplyRoleRestrictions() {
        System.out.println("applyRoleRestrictions");
        int roleID = 0;
        Dashboard instance = new Dashboard();
        instance.applyRoleRestrictions(roleID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Dashboard.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Dashboard.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
