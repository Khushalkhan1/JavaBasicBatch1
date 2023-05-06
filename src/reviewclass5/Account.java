package reviewclass5;

public class Account {

	String userName;
	String password;
	double balance;
	String accountNumber;
	boolean isLoggedIn;
	
	public void logIn(String userLoggedInUserName, String userLoggedInPassword) {
		if(userName.equals(userLoggedInUserName) && password.equals(userLoggedInPassword)) {
		System.out.println("Welcome to the of america");	
			isLoggedIn=true;
		}else {
			System.out.println("Your Passwod or user name is incorrect");
		}
	}
	public void userInfo() {
		if (isLoggedIn) {
			System.out.println("Your account number is " + accountNumber + "and your balance "+balance);
		}else {
			System.out.println("your credentials are incorrect try again");
		}
	}

}
