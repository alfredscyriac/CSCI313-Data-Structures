package Lecture1Classwork;
/**
 * 
 * @author nikolabaci
 *
 * Description: An abstract card class, cannot be initialized. 
 * Used to store common info that a debit and a credit card share.
 * 
 */
abstract class Card {
	private String cardHolder;
	private String cardNumber;
	private int expirationMonth;
	private int expirationYear;
	private int cvv;
	
	public Card() { //Default constructor
		
	}
	
	//Non-default constructor (also constructor overloading)
	public Card(String cardHolder, String cardNumber, int month, int year, int cvv) {
		
	}
	
	//Used to shorten my typing (System.out.prin... zzz, too long)
	public void println(String field, String data) {
		
	}
	
	//Used to shorten my typing (System.out.prin... zzz, too long)
	public void println(String s) {
		
	}
	
	//Helper method
	private String cardNumberSecure() {
		return null;
	}
	
	//Helper method
	private String expirationDate() {
		return null;
	}
	
	//Used to print general card info
	//Will be overridden for more specific use
	public void printInfo() {
		
	}
	
	//Notice the PRIVATE instance variables at the top?
	//Use getter and setters to work with those variables.
	public void setCardHolder(String cardHolder) { this.cardHolder = cardHolder; }
	public void setCardNumber(String cardNumber) { this.cardNumber = cardNumber; }
	public void setExpirationMonth(int expirationMonth) { this.expirationMonth = expirationMonth; }
	public void setExpirationYear(int expirationYear) { this.expirationYear = expirationYear; }
	public void setcvv(int cvv) { this.cvv = cvv; }
	
	public String getCardHolder() { return this.cardHolder; }
	public String getCardNumber() { return this.cardNumber; }
	public int getExpirationMonth() { return this.expirationMonth; }
	public int getExpirationYear() {return this.expirationYear; }
	public int getcvv() { return this.cvv; }
	
}
