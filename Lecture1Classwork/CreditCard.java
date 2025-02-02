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
		super();  
		limit=100; 
		points=100;
		minPayment=0;
	}
	
	public CreditCard(String cardHolder, String cardNumber, int exprMonth, int exprYear, int cvv) {
		super(cardHolder, cardNumber, exprMonth, exprYear, cvv);
		limit=100; 
		points=100; 
		minPayment=0; 
	}
	
	public CreditCard(String cardHolder, String cardNumber, int exprMonth, int exprYear, int cvv, int limit, 
	int points, int minPayment) {
		super(cardHolder, cardNumber, exprMonth, exprYear, cvv);
		this.limit=limit; 
		this.points=points;
		this.minPayment=minPayment;
	}
	
	//Overridden print method
	public void printInfo() {
		super.println("Card Limit: ", "$"+this.limit);
		super.println("Card Points: ", "$"+this.points);
		super.println("Card Minimum Payment: ", "$"+this.minPayment);
	}
}
