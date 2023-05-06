package class6;

import java.util.Scanner;

public class FindLargestNumber {
	public static void main(String[] args) {
		/*
		 * Write a program to find largest of three double values using if-else..if and
		 * logical operators provided by a user (numbers must be distinct)
		 */
		double num1 = 13.8;
		double num2 = 6.3;
		double num3 = 9.1;
		if (num1 > num2 && num2 > num3) {
			System.out.println("The largest number is " + num1);
		} else if (num2 > num3) {
			System.out.println("The largest number is " + num2);
		} else {
			System.out.println("The largset number is " + num3);

		}
		System.out.println("=====================");
		// customerInput

		/*
		 * Program to find largest number among three numbers using nested if provided
		 * by a user (numbers must be distinct)
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Please add three different number to find the largest number");
		int number1 = input.nextInt();
		System.out.println("Please add number 2");
		int number2 = input.nextInt();
		System.out.println("Please add number 3");
		int number3 = input.nextInt();
		if (number1 > number2) {
			if (number2 > number3) {
				System.out.println("The largest number is " + number1);
			}
		} else if (number2 > number3) {
			System.out.println("The largest number is " + number2);
		} else {
			System.out.println("The largest number is " + number3);
		}

	}

}
