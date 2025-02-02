package Lecture1Classwork;
/**
 * 
 * @author nikolabaci
 *
 * Description: Credit Card class, a child of Card class. Inherits all variables 
 * and methods from the Card class, but we also add some more.
 */
public class CreditCard extends Card {
	private int limit;
	private int points;
	private int minPayment;
	
	//Default constructor
	public CreditCard() { 
		
	}
	
	public CreditCard(String cardHolder, String cardNumber, int exprMonth, int exprYear, int cvv) {
		
	}
	
	public CreditCard(String cardHolder, 
						String cardNumber, 
						int exprMonth, 
						int exprYear, 
						int cvv,
						int limit, 
						int points, 
						int minPayment) {
		
	}
	
	//Overridden print method
	public void printInfo() {
				
	}
}
