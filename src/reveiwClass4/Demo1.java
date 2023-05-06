package reveiwClass4;

public class Demo1 {
	public static void main(String[] args) {
		/*
		 * Write a program that reads two people's first names and if they expecting boy
		 * or girl? Based on the input suggests a name for a baby:
		 */

		String mom = "Diana";
		String dad = "smith";
		String child = "girl";
		if (child.equalsIgnoreCase("child")) {
			int middle = dad.length() / 2;
			System.out.println(mom.substring(0,2) + dad.substring(0, middle));
		} else {
			int middle3 = mom.length() / 2;
			System.out.println(dad.substring(0,2) + mom.substring(middle3));

		}
	}
}