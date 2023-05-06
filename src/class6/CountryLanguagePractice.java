package class6;

import java.util.Scanner;

public class CountryLanguagePractice {
	public static void main(String[] args) {
		/*
		 * Ask user to enter their country and capture it. Once values are captured
		 * print which language user speaks.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please add your country name first letter should be capital to show the language");
		String CountryName = scan.nextLine();
		switch (CountryName) {
		case "United State":
			System.out.println("English");
			break;
		case "Afghanistan":
			System.out.println("Pashto/dari");
			break;
		case "Iraq":
			System.out.println("Arabic");
			break;
		case "Turkey":
			System.out.println("Turkish");
			break;
			default:
				System.out.println("Sorry! The country is not in our list");
				

	}
	}
}
