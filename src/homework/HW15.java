package homework;

public class HW15 {
	public static void main(String[] args) {
		/*
		 * HW-17 Print result of -21 mod 4? Expected Output:** -1
		 */
		int result = -21 % 4;
		System.out.println(result);

		/*
		 * HW-18 Write a program to convert double 500.4444 into long. Expected Output:
		 * 500
		 */

		double num = 500.4444;
		long result1 = (long) num;
		System.out.println("Double value:" + num);
		System.out.println("Long value:" + result1);

		/*
		 * HW-19 Write a program to convert double 100.50 into int type Expected Output:
		 * 100
		 */

		double num1 = 100.50;
		int result2 = (int) num1;
		System.out.println("Double value:" + num1);
		System.out.println("int value:" + result2);
		
		

	}

}
