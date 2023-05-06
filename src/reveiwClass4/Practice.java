package reveiwClass4;

public class Practice {
	public static void main(String[] args){
		/*
		 * Accept username, password and confirm password and check following
		 * requirements: 1. Username and Password cannot be empty, if so→
		 * message=”Username and Password cannot be empty”. 2. Password should be m i n
		 * i m u m 8 characters, if less → message=”Password is too short”. 3. Password
		 * cannot contain username if so, → message=”Password cannot contain username”.
		 * 4. Password should match confirmed password, if not → message=“Passwords do
		 * not match”. Only after all requirements met → message “Your username and
		 * password has been created”
		 */

		String username = "USER";
		String password = "Pass12345";
		String ConfirmPassword = "Pass12345";
		if (username.isEmpty() || password.isEmpty()) {
			System.out.println("Username and password can not be empty");
		}else if (password.length()<=8) {
			System.out.println("Password is too short");
		}else if(password.contains(username)){
			System.out.println("Password can not contain username");
		}else if(!password.equals(ConfirmPassword));
		System.out.println("Your userName and password has been created");
	}

}
