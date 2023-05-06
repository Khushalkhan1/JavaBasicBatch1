package class12;

public class TrimDemo {
	public static void main(String[] args) {
		
		String name1 = "                 Khushal";
		System.out.println(name1.trim());
		
		String demoTrimString = "This is trime demonstration            ";
		System.out.println(demoTrimString.trim());
		
		String password = "aziz327";
		if(password.length()<8) {
			System.out.println("Your password should be more then 8 characters");		
		}else {
			System.out.println("You are using the strong password");
			
		}
	}

}
