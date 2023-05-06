package class12;

public class EqualString {
	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "Do not worry you will get the job";
		String s3 = "hello";
		System.out.println(s1.equals(s3));// Out will be true or false
		System.out.println(s1.equalsIgnoreCase(s3));
		
		if (s1.equalsIgnoreCase(s3)) {
			System.out.println("The two String are same");
		}
		
	}

}
