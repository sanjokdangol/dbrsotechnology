/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loancalculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sanjok
 */
public class FunctionsTest {
    
    public FunctionsTest() {
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
     * Test of getSimpleInterest method, of class Functions.
     */
    @Test
    public void testGetSimpleInterest() {
        System.out.println("getSimpleInterest");
        double p = 0.0;
        double t = 0.0;
        double r = 0.0;
        Functions instance = new Functions();
        double expResult = 0.0;
        double result = instance.getSimpleInterest(p, t, r);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAnnualPayment method, of class Functions.
     */
    @Test
    public void testGetAnnualPayment() {
        System.out.println("getAnnualPayment");
        double PV = 0.0;
        double IR = 0.0;
        double NP = 0.0;
        Functions instance = new Functions();
        double expResult = 0.0;
        double result = instance.getAnnualPayment(PV, IR, NP);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDueAmount method, of class Functions.
     */
    @Test
    public void testGetDueAmount() {
        System.out.println("getDueAmount");
        double amt = 0.0;
        double si = 0.0;
        double annualPayment = 0.0;
        Functions instance = new Functions();
        double expResult = 0.0;
        double result = instance.getDueAmount(amt, si, annualPayment);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMonthlyPayment method, of class Functions.
     */
    @Test
    public void testGetMonthlyPayment() {
        System.out.println("getMonthlyPayment");
        double p = 0.0;
        double r = 0.0;
        double n = 0.0;
        Functions instance = new Functions();
        double expResult = 0.0;
        double result = instance.getMonthlyPayment(p, r, n);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPaymentAmount method, of class Functions.
     */
    @Test
    public void testGetPaymentAmount() {
        System.out.println("getPaymentAmount");
        double a = 0.0;
        double n = 0.0;
        double r = 0.0;
        Functions instance = new Functions();
        double expResult = 0.0;
        double result = instance.getPaymentAmount(a, n, r);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of monthlyPayment method, of class Functions.
     */
    @Test
    public void testMonthlyPayment() {
        System.out.println("monthlyPayment");
        double p = 0.0;
        double t = 0.0;
        double r = 0.0;
        Functions instance = new Functions();
        double expResult = 0.0;
        double result = instance.monthlyPayment(p, t, r);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
