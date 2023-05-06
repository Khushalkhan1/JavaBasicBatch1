package class12;

public class ContianDEMO {
	public static void main(String[] args) {
		String password = "123abc&*%";
		System.out.println(password.contains("%"));//Output true or false
		
		if(password.contains("%")) {
			System.out.println("Please remove % character is not allowed");
		}else {
			System.out.println("You have a strong password");
		}
	}

}
