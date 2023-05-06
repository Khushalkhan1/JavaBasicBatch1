package practiceClass;

import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args) {
		/*
		 * HomeWork: Using scanner class create calculator. Allow user to enter 2
		 * numbers and operator(+,-,*,/). Based on operator provide the result to user.
		 */
		Scanner input = new Scanner(System.in);

		System.out.println("Please add a number");
		double number1 = input.nextDouble();
		System.out.println("Please add second number");
		double number2 = input.nextDouble();
		System.out.println("Please add one of these operators +,-,/,*");
		char operator = input.next().charAt(0);

		switch (operator) {

		case '+':
			System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
			break;
		case '-':
			System.out.println(number1 + " + " + number2 + " = " + (number1 - number2));
			break;
		case '/':
			System.out.println(number1 + " + " + number2 + " = " + (number1 / number2));
			break;
		case '*':
			System.out.println(number1 + " + " + number2 + " = " + (number1 * number2));
			break;
		default:
			System.out.println("Sorry! our programe does not know the operation");

		}
		// we can use == for numbers
		// equal for string
		String a = "Hello";
		String b = "hello";

		if (a.equals(b)) {
			System.out.println("These variables are same");
		} else {
			System.out.println("They are not same");
		}

	}

}
