package reveiwClass1;

public class AtrithmethicOperators {
	public static void main(String[] args) {

		// create two variable 99 and 15 then divide that first variable on second and
		// print the remainder
		int num1 = 99;
		int num2 = 15;
		int remainder = num1 % num2;
		System.out.println("The remainder is " + remainder);// 9

		// create a program to let the user log in create one variable user and another
		// password
		String username = "Khushal khan";
		String password = "123asd.78";
		if (username == "Khushal khan") {
			System.out.println("Your user name is correct add the password");
			if (password == "123asd.78") {
				System.out.println("welcome to your account");
			} else {
				System.out.println("password invalid please try again");
			}
		} else {
			System.out.println("User invalid please try again");

		}
		int n1 = 25;
		int n2 = 5;
		int result = n1/n2;
		System.out.println(result);;;

	}
}