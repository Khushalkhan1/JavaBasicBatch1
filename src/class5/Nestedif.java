package class5;

public class Nestedif {
	public static void main(String[] args) {
		/*
		 * Create a Java program and store values of mortgage rate and mortgage price.
		 * First, program should check if rate is higher than 4.5 user will not buy a
		 * house, other wise user will consider buying. Once user decides to buy a
		 * house, if price of the house is larger than 200000 than user will take a
		 * loan, otherwise user will pay cash.
		 */
		int mortgage = 200000; 
		double price = 200000;            
		double GPA = 4.0;
		if (GPA > 4.5) {
			System.out.println("You can not buy the house ");
		} else {
			System.out.println("you are eligibe for buying the house");
			if (price > 200000) {
				System.out.println("You need to take loan");
			} else {
				System.out.println("User have enough cash to pay");
			}
		}

	}
}
