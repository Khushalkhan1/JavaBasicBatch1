package reviewclass5;

public class AccountTester {
	public static void main(String[] args) {
		Account arshadAccount = new Account();
		arshadAccount.accountNumber = "A124";
		arshadAccount.userName = "Arshad";
		arshadAccount.password = "pass123";
		arshadAccount.balance = 100000.45;
		
		arshadAccount.logIn("Arshad", "pass123");
		arshadAccount.userInfo();
		
		
	}

}
