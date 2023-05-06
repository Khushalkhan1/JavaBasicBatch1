package class19;

public class PublicModifiersDemo {

	// I access the var in the same class in the same package.

	public String name = "Aziz";
	public int age = 21;
	public static String grade = "A";
	// String, int ....or type of variable.
	// name and age are identifiers or name of variable.
	// = is assigning operators
	// aziz or 21 are value of variable

	public void info(int num) {
		System.out.println(name);
	    System.out.println(age);
		grade = "B";
		System.out.println(grade);
	}

	public static void staticInfo() {
		PublicModifiersDemo publicModifiersDemo = new PublicModifiersDemo();
		publicModifiersDemo.age = 23;
		System.out.println(grade);
	}
	public static void main(String[] args) {
		staticInfo();
		PublicModifiersDemo publicModifiersDemo = new PublicModifiersDemo(); 	 
		publicModifiersDemo.info(1);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
