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
public class CustomerTest {
    
    public CustomerTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    /**
     * This method tests if an address is null.
     */
    @Test(expected = IllegalArgumentException.class)
    public void  addressShouldNotBeNull() {
       Customer c = new Customer();
       c.setAddress(null);
       
       //assertNotNull(c.getAddress());
       
        
    }
    
    /**
     * This method tests if an address is empty.
     */
    @Test(expected = IllegalArgumentException.class)
    public void  addressShouldNotBeEmpty() {
       Customer c = new Customer();
       c.setAddress("");
        
    }
    @Test
    public void  addressShouldPass() {
       Customer c = new Customer();
       c.setAddress("123 Main st.");
        
    }
}
