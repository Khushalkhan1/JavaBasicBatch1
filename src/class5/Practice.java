package class5;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {

		/*
		 * Write a program to ask user to enter numbers of worked years and annual
		 * salary. If user worked for more or equals to 5 years than user is eligible
		 * for the bonus, otherwise he is not. Once user is eligible and salary is
		 * larger than 50000 than bonus = 5000, otherwise bonus=3000.
		 */
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Please tell how much year are you working");
		int work = inputScanner.nextInt();
		System.out.println("Please tell what is your income");
		int income = inputScanner.nextInt();
		if(income>50000) {
			System.out.println("you can have the bonus of 5000");
		}else if(work <5) {
			
			System.out.println("you will get the bonus of 3000");
		}
		if (work>=5) {
			System.out.println("you are eligible for the bonus");
		}else {
			System.out.println("you are eligible for the bonus of 3000");
			
		}

	}
}