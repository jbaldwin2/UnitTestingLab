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
    private Customer instance;
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
        instance = new Customer();
    }
    
    @After
    public void tearDown() {
        instance=null;
    }
    /**
     * This method tests if an address is null.
     */
    @Test(expected = IllegalArgumentException.class)
    public void  addressShouldNotBeNull() {
       
       instance.setAddress(null);
       
       //assertNotNull(c.getAddress());
       
        
    }
    
    /**
     * This method tests if an address is empty.
     */
    @Test(expected = IllegalArgumentException.class)
    public void  addressShouldNotBeEmpty() {
       
       instance.setAddress("");
        
    }
    @Test
    public void  addressShouldPass() {
       
       instance.setAddress("123 Main st.");
        
    }
    @Test(expected = IllegalArgumentException.class)
    public void  phoneNumberHasTenOrElevenDigits() {
       
       instance.setAddress("1(123)-123-11235");
        
    }
}
