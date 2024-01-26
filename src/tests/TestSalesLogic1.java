/**
 * @author Cory Howard - clhoward1
 * CIS175 - Spring 2024
 * Jan 25, 2024
 */
package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.SalesCalculator;

public class TestSalesLogic1 {

	SalesCalculator salesCalc = new SalesCalculator(15.00, 2);
	
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testBeforeTax() {
		double price = salesCalc.calculateBeforeTaxSalePrice();
		assertEquals(30.00, price, 0.0);
	}
	
	@Test
	public void testAfterTax() {
		double price = salesCalc.calculateAfterTaxSalePrice();
		assertEquals(32.10, price, 0.0);
	}
	
	@Test
	public void testItemPriceNotNull() {
		assertNotNull(salesCalc.getItemPrice());
	}

}
