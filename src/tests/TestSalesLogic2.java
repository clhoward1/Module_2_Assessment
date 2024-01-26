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

public class TestSalesLogic2 {

	SalesCalculator salesCalc = new SalesCalculator(15.00, 2);
	
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testDiscountQualifierTrue() {
		assertTrue(salesCalc.discountQualifier());
	}
	
	@Test
	public void testDiscountQualifierFalse() {
		salesCalc.setItemPrice(5.50);
		assertFalse(salesCalc.discountQualifier());
	}

}
