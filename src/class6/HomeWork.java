package class6;

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
		System.out.println("Please a second number");
		double number2 = input.nextDouble();
		System.out.println("Please add one of these opperators +,-,*,/");
		char opperators = input.next().charAt(0);
		switch (opperators) {

		case '+':
			System.out.println(number1 + "+" + number2 + " = " + (number1 + number2));
			break;
		case '-':
			System.out.println(number1 + "-" + number2 + " = " + (number1 - number2));
			break;
		case '*':
			System.out.println(number1 + "*" + number2 + " = " + (number1 * number2));
			break;
		case '/':
			System.out.println(number1 + "/" + number2 + " = " + (number1 / number2));
			break;
		default:
			System.out.println("Sorry! We don not accept this operator");

		}

		// We use this (==) for more numbers
		// Equal for string
		String a = "Hello";
		String b = "hello";
		if (a == b) {
			System.out.println("The variables are same ");
		} else {
			System.out.println("They are not same ");

		}

	}

}
