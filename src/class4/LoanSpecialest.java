package class4;

public class LoanSpecialest {
	public static void main(String[] args) {

		/*
		 * YOU ARE A LOAN SPECIALIST AND YOU NEED TO ASK USER WHAT IS THE AMOUNT OF LOAN
		 * IS NEEDED. IF LOAN IS LESS THAN 200,000 THEN YOU WOULD LEND THE MONEY
		 * OTHERWISE YOU WOULD REJECT THE CLIENT.
		 */
		int loan = 1000000;
		if (loan < 200000) {
			System.out.println("You can have your money");
		} else {
			System.out.println("Sorry, you can not have the money more 200000");
		}
	}

}
