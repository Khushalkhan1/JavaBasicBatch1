package reviewclass3;

public class DemintsionalAraayPractice {
	public static void main(String[] args) {

		int[][] num1 = {

				{ 12, 34, 35, 60, 78 }, { 10, 23, 43, 25 }, { 23, 24 } };
		System.out.println("The row numbers " + num1.length);// This will print the row numbers

		System.out.println("Fırst row element " + num1[0].length);// This print,s the first row element
		System.out.println("second row element " + num1[1].length);

		// only print 78 and 48
		for (int[] num : num1) {
			for (int n : num) {
				if (n==43 || n==78) {
					System.out.println(n);
				}

			}
		}

	}

}
