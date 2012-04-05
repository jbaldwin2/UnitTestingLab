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
        Customer c = new Customer("John", "123-123-1234");
        Product p1 = new Product("A100", "Hat", 20.50);
        Product p2 = new Product("A200", "Shirt", 10.50);
        // List<LineItem> lineItems = new ArrayList<LineItem>();

        instance = new Invoice(c);
        instance.addLineItem(p2, 12);
        instance.addLineItem(p1, 2);
    }

    @After
    public void tearDown() {
        instance = null;
    }

    /**
     * This method tests if the total quantity is greater than zero.
     */
    @Test(expected = IllegalArgumentException.class)
    public void qtyShouldBeGreaterThanZero() {
        Customer c2 = new Customer("John", "123-123-1234");
        Product p1 = new Product("A100", "Hat", 20.50);
        Product p2 = new Product("A200", "Shirt", 10.50);
        instance = new Invoice(c2);
        instance.addLineItem(p2, 0);
        instance.addLineItem(p1, 0);
        instance.getTotalQty();

    }

    @Test
    public void discountedTotalShouldNotBeHigherThanNetTotal() {
        //Testing various values via console output
//        System.out.println(instance.getDiscount()+
//                "  "+instance.getNetTotal()+
//                "  "+instance.getDiscountedTotal());
        assertTrue(instance.getDiscountedTotal()
                <= instance.getNetTotal());

    }
}
