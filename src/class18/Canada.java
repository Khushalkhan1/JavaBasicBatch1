package class18;

public class Canada {
	public static void main(String[] args) {
		USA obj1 = new USA();
		System.out.println("Those values are from USA class to the Canada class in the same package");
		//System.out.println(capitalCity);This variable is not accessible because it is declare as a private in USA class
		
		System.out.println(obj1.mainState);
		System.out.println(obj1.school);
		System.out.println(obj1.name);
		
	}

}
