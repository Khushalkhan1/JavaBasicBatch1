package class12;

public class StartWithDEMO {
	public static void main(String[] args) {
		String s1 = "These methods are only for string objects ";

		System.out.println(s1.startsWith("These"));

		if (s1.startsWith("Those")|| s1.startsWith("These")){
			System.out.println("The subject is plural");
		} else {
			System.out.println("The subject is singular");

		}
		
		System.out.println(s1.endsWith("objects"));//true
		
		
	}
}
