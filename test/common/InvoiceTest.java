/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author jbaldwin2
 */
public class InvoiceTest {
    private Invoice instance;
    
    public InvoiceTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        Customer c = new Customer();
        instance = new Invoice(c);
    }
    
    @After
    public void tearDown() {
         instance = null;
    }
/**
     * This method tests if the total quantity is greater than zero.
     */
    @Test
    public void qtyShouldBeGreaterThanZero() {
        assertTrue(instance.getTotalQty()>0);
        
    }
}
