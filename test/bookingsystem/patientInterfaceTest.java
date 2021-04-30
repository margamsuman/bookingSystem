/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingsystem;

import java.io.IOException;
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
public class patientInterfaceTest {
    
    public patientInterfaceTest() {
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
     * Test of physiciandata method, of class patientInterface.
     */
    @Test
    public void testPhysiciandata() throws IOException {
        System.out.println("physiciandata");
        mainLogin instance1 = new mainLogin();
        String[] args = null;
        mainLogin.main(args);
        physicians[] phy = null;
        patientInterface instance = new patientInterface();
        instance.physiciandata(mainLogin.phys);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        assertEquals(mainLogin.phys.length>0, true);
    }


    
}
