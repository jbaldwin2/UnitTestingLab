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
public class ProductTest {
    private Product instance;
    
    public ProductTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        instance = new Product();
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

     @Test(expected = IllegalArgumentException.class)
    public void  unitCostShouldNotBeNegative() {
       instance.setUnitCost(-12);
    }
    @Test(expected = IllegalArgumentException.class)
    public void  unitProductNameNotBeNNull() {
      instance.setProdName(null);
    }
}
