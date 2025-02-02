package Lecture1Classwork;
/**
 * 
 * @author nikolabaci
 *
 * Description: Debit Card class, a child of Card class. Inherits all variables 
 * and methods from the Card class, but we also add some more.
 */
public class DebitCard extends Card {
	private double balance;
	
	public DebitCard() {
		super();
		balance=0.0;
	}
	
	public DebitCard(String cardHolder, String cardNumber, int exprMonth, int exprYear, int cvv) {
		super(cardHolder, cardNumber, exprMonth, exprYear, cvv);
		balance=0.0;
	}
	
	public DebitCard(String cardHolder, String cardNumber, int exprMonth, int exprYear, int cvv,
	double balance) {
		super(cardHolder, cardNumber, exprMonth, exprYear, cvv);
		this.balance=balance; 		
	}
	
	public void printInfo() {
		super.println("Card Balance: ", "$"+this.balance); 
	}

}
