package class12;

public class IsEmptyDemo {
	public static void main(String[] args) {
		
		String userName = "";// Output boolean true/false
		System.out.println(userName.isEmpty());
		if(userName.isEmpty()) {
			System.out.println("Please add userName the box should not be empty");
		}else {
			System.out.println("Your user name is correct");
		}
		//coCat() +
		
		String hello = "Hello";
		String name = " My name is Arshad";
		System.out.println(hello+name);//This way is recommended
		System.out.println(hello.concat(name));
		
	}

}
