package reviewclass3;

import java.util.Scanner;

public class ArrayPractice {

	public static void mian(String[] args) {

		// Create a program to ask the user to size the array and store their text.
		Scanner scanner = new Scanner(System.in);
		String[] Array;
		System.out.println("Please add the size of element that you want to store in array by number");
		int size = scanner.nextInt();
		Array = new String[size];
		for (int i = 0; i < size; i++) {
			int num1 = 1;
			System.out.println("Please enter your text " + num1);
			;
			Array[i] = scanner.next();

		}

		for (String str : Array) {
			System.out.print(str + " ** ");
		}
	}
}
