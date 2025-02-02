package Lecture1Classwork;
public class Main {
	public static void main(String[] args) {
		
		//This is an error! Uncomment and read the message. Why?
		// Card card = new Card();
		// The above line of code would be error due to the fact that the class Card is an abstract class
		// thus Card cannot be instantiated
		
		CreditCard creditcard = new CreditCard("John Doe", "1234 4321 8907 1415", 12, 2028, 123);
		creditcard.printInfo();
		
		DebitCard debitcard = new DebitCard("Jane Smith", "1234 4321 8907 8965", 12, 2028, 123, 25000);
		debitcard.printInfo();
	}
}
