package class5;

import java.util.Scanner;

public class CreditCardPractice {
	public static void main(String[] args) {

		/*
		 * CREATE A JAVA PROGRAM THAT WILL ASK IF USER HAS A CREDIT CARD OR NOT. IF YOU
		 * USER DOES NOT HAVE A CREDIT CARD THEN OFFER THEM. IF THEY DO HAVE ONE ASK
		 * WHAT IS BALANCE ON THE CARD? IF BALANCE OF the card is larger than 1000, tell
		 * them to pay off immediately, otherwise you can tell them that they can spend
		 * more.
		 */

		Scanner creditcard = new Scanner(System.in);
		System.out.println("Please tell us do you have credit card with true or false");
		boolean card = creditcard.nextBoolean();
		System.out.println("Please can you tell us what is the amount in the card");
		int amount = creditcard.nextInt();
		if (amount > 1000) {
			System.out.println("you need to pay off imediately");
		} else if (amount < 1000) {
			System.out.println("you can spend more");
		} else {
			System.out.println("you can pay cash");
		}
	}

}
