package class5;

import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		/*
		 * Write a program to determine the classMode. ● If there is no rain →
		 * classMode=”In Class”, otherwise classMode → “Online”.
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Please tell us about the weather condition rainy or snowy with value true or false");
		boolean weather = input.nextBoolean();
		if (weather) {
			System.out.println("We will have the class online today");
		} else {
			System.out.println("We will have in person class");
		}
	}

}
