package class2;

public class VariablePractice {
	public static void main(String[] args) {

		// Declare a variable then assign 12.
		int n1;
		n1 = 12;

		// We can create couple variable in one time.
		int num1, num2, num3;
		num1 = 5;
		num2 = 10;
		num3 = num1;
		System.out.println(num3);
		// We can change the value of the variable
		boolean isTodayFriday;
		isTodayFriday = false;
		boolean isTodaySunday;
		isTodaySunday = isTodayFriday;
		boolean isTodayMonday;
		isTodayMonday = true;

		String name = "KHUSHAL KHAN";
		String greating = "Hello, my name is ";
		System.out.println(greating + name);
		System.out.println("is Today Friday: " + isTodayFriday);
		System.out.println(isTodayFriday);
		/*
		 * To attach any value ( int, String, char, boolean) to a String we (+)->
		 * 
		 * concatenation operator operators in java assignment operator : Arithmetic
		 * Operators +, -, *, /, %.
		 */
		// create a String variable shopping and assign the value of " I want to buy:"
		// declare int number and assign the value of 10.
		// Create variable String count assign the value of "apple"
		// Concatenate all three variable and make a correct sentence.
		String shopping = "I want to buy: ";
		int number = 10;
		String count = " apple";
		System.out.println(shopping + number + count);

	}
}