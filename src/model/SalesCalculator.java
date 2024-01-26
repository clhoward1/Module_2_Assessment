/**
 * @author Cory Howard - clhoward1
 * CIS175 - Spring 2024
 * Jan 25, 2024
 */
package model;

public class SalesCalculator {
	
	private double itemPrice;
	private int itemAmount;
	private final double SALES_TAX = 0.07;
	private final double DISCOUNT_LIMIT = 24.99;
	
	
	/**
	 * Constructors
	 */
	public SalesCalculator() {
		
	}
	
	public SalesCalculator(double itemPrice, int itemAmount) {
		this.itemPrice = itemPrice;
		this.itemAmount = itemAmount;
	}
	
	
	/**
	 * Getters and Setters
	 */
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	public int getItemAmount() {
		return itemAmount;
	}
	public void setItemAmount(int itemAmount) {
		this.itemAmount = itemAmount;
	}
	
	
	/**
	 * Methods
	 * 
	 * Calculates sale price before tax is added
	 */
	public double calculateBeforeTaxSalePrice() {
		double cost = (itemPrice * itemAmount);
		return cost;
	}
	
	/**
	 * Calculates sale price with tax
	 */
	public double calculateAfterTaxSalePrice() {
		double cost = (itemPrice * itemAmount);
		return cost + (cost * SALES_TAX);
	}
	
	/**
	 * Checks to see if pre tax sale price is above limit to qualify for discount
	 */
	public boolean discountQualifier() {
		double cost = (itemPrice * itemAmount);
		
		if (cost >= DISCOUNT_LIMIT) {
			return true;
		} else {
			return false;
		}
	}	
}
