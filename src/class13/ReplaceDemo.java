package class13;

public class ReplaceDemo {
	public static void main(String[] args) {
		
		String a = "Hello";
		a = a.replace('e' , 'a');
		System.out.println(a);
		
		String str1 = "joincoretech is tech school. batch 1 is the best";
		System.out.println(str1.replace("best" , "amazing"));
		System.out.println(str1.replaceAll(str1, "This is just replace11"));
		
		String b1 = "fdgrgfhthxhtr6566";
		System.out.println(b1.replace("[a-z]", ""));
		System.out.println(b1.replaceAll("[0-9]", ""));
		
		String c1 = "java is good language, most people like java, they say java is easy";
		System.out.println(c1.replace("java", "JAVA"));
		
	}

}
