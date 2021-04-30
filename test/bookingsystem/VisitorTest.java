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
public class VisitorTest {
    
    public VisitorTest() {
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
     * Test of setData method, of class Visitor.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        Visitor instance = new Visitor();
        instance.setData();
        // TODO review the generated test code and remove the default call to fail.
        assert(true);
    }

    
   
    /**
     * Test of physiciandata method, of class Visitor.
     */
    @Test
    public void testPhysiciandata() throws IOException {
        System.out.println("physiciandata");
        physicians[] phy = mainLogin.phys;
        mainLogin instance1 = new mainLogin();
        String[] args = null;
        mainLogin.main(args);
        String name = "ABC";
        Visitor instance = new Visitor();
        instance.physiciandata(mainLogin.phys, name);
        // TODO review the generated test code and remove the default call to fail.
        assert(true);
    }

    /**
     * Test of main method, of class Visitor.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Visitor.main(args);
        // TODO review the generated test code and remove the default call to fail.
        assert(true);
    }
    
}
