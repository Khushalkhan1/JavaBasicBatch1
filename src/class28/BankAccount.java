package class28;

public class BankAccount {
	private String name;
	private String userName;
	private String password;
	private double balance;

	public BankAccount(String name, String userName, String password, double balance) {
		this.name = name;
		this.userName = userName;
		this.password = password;
		this.balance = balance;
	}

	double getBalance(String userName, String password) {
		if (this.userName.equals(userName) && this.password.equals(password)) {
			return this.balance;
		} else {
			return -1;

		}

	}

	public void logIn(String userName, String password) {
		if (this.userName.equals(userName) && this.password.equals(password)) {
			System.out.println("Welcome to your account");
		} else {
			System.out.println("Your userName or password is incorect");
		}
	}

}
