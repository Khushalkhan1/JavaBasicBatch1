package class5;

import java.util.Scanner;

public class ScannerPractice {
	public static void main(String[] args) {

		// Ask the user to tell his/her name and you should store it in a variable

		Scanner scan = new Scanner(System.in);
		System.out.println("Please add your name");
		String name = scan.next();
		System.out.println("Your name is " + name);
		System.out.println("======================");

		/*
		 * YOU ARE A LOAN SPECIALIST AND YOU NEED TO ASK USER WHAT IS THE AMOUNT OF LOAN
		 * IS NEEDED. IF LOAN IS LESS THAN 200,000 THEN YOU WOULD LEND THE MONEY
		 * OTHERWISE YOU WOULD REJECT THE CLIENT.
		 */
		Scanner inputscan = new Scanner(System.in);
		System.out.println("Please tell us what amount of loan you need");
		int number = inputscan.nextInt();
		if (number < 200000) {
			System.out.println("Congratulation you are eligible for the loan");
		} else {
			System.out.println("Sorry, We can not give you the loan");

		}

	}

}
