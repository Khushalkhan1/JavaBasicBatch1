package class23;

public class Bank {
	
	void transferFee(double amount) {
		System.out.println("Your charge fee "+amount*0.02);
	}

}

class BankOfAmerica extends Bank{

	void transferFee(double amount) {
		System.out.println("Bank of America charge is "+amount*0.05);
		
	}
}
class WellsForgo extends Bank{
	void tranferFee(double amount) {
		System.out.println("WellsForgo charge fee "+amount*0.03);
		
	}
}

class CapitalOneBank extends Bank{
	

}