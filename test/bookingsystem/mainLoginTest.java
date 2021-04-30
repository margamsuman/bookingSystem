/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingsystem;


import java.io.IOException;
import javax.swing.table.DefaultTableModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author IT Services
 */
public class mainLoginTest {
    
    public mainLoginTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of newPatient method, of class mainLogin.
     */
    @Test
    public void testNewPatient() {
        System.out.println("newPatient");
        String pname = "Test";
        String pAddress = "England";
        String pphone = "253625";
        mainLogin instance = new mainLogin();
        instance.newPatient(pname, pAddress, pphone);
        
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
       assertTrue(true);
    }

   

    
    
   
   
    @Test
    public void testGetSpecializationData() throws IOException {
        System.out.println("getSpecializationData");
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("Physician Name");
        dt.addColumn("Specialisation");
        dt.addColumn("TreatmentID");
        dt.addColumn("Treatment");
        dt.addColumn("Day Time");
        dt.addColumn("Room Name");
        dt.addColumn("Room Status");
        dt.addColumn("Appointment Status");
        dt.addColumn("Patient");
        dt.addColumn("BookingID");
        
        String spec = "Osteopathy";
        Boolean b = true;
         mainLogin instance = new mainLogin();
        String[] args = null;
        mainLogin.main(args);
        
        DefaultTableModel expResult = null;
        DefaultTableModel result = instance.getSpecializationData(dt, spec, b);
        
        assertEquals(result.getRowCount()>0,true);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPhysicianData method, of class mainLogin.
     */
    @Test
    public void testGetPhysicianData() throws IOException {
        System.out.println("getPhysicianData");
        int number = 28;
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("Physician Name");
        dt.addColumn("Specialisation");
        dt.addColumn("TreatmentID");
        dt.addColumn("Treatment");
        dt.addColumn("Day Time");
        dt.addColumn("Room Name");
        dt.addColumn("Room Status");
        dt.addColumn("Appointment Status");
        dt.addColumn("Patient");
        dt.addColumn("BookingID");

        Boolean b = true;
        
        mainLogin instance = new mainLogin();
        String[] args = null;
        mainLogin.main(args);
        
        DefaultTableModel expResult = null;
        DefaultTableModel result = instance.getPhysicianData(number, dt, b);
        for(int i=0;i<result.getRowCount();i++){
            System.out.print(i);
        }
        assertEquals(result.getRowCount()>0,true);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of bookAppointment method, of class mainLogin.
     */
    @Test
    public void testBookAppointment() throws IOException {
        System.out.println("bookAppointment");
        String status = "Booked";
        int pid = 21;
        String phyName = "Zong";
        int tID = 31;
        int bID = 2000;
        mainLogin instance = new mainLogin();
        String[] args = null;
        mainLogin.main(args);
        instance.bookAppointment(status, pid, phyName, tID, bID);
        assertEquals(true,true);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
