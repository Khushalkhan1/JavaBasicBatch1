package class23;

public class BankTester {
	public static void main(String[] args) {
		BankOfAmerica bankOfAmerica = new BankOfAmerica();
		bankOfAmerica.transferFee(1000);
		
		WellsForgo wellsForgo = new WellsForgo();
		wellsForgo.tranferFee(1000);
		
		CapitalOneBank obj = new CapitalOneBank();
		obj.transferFee(1000);
	}
}

