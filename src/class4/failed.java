package class4;

public class failed {
	public static void main(String[] args) {
		
		// Casting we add one type variable value to an other type.
		int num1 = 2;
		double num2 = num1;
		System.out.println(num1);
		System.out.println(num2);
		
		num2 = (int)num2;
		System.out.println(num1);
		
		//widening casting(Implicit/ Automatic) - converting lower data type into higher.
		
		int num3 = 10;
		
		float num4 = num1;
		System.out.println(num4);
		
		//Narrowing Casting(Explicit/ Manual) - converting higher data type in lower.
		
		num3 = 10;
		System.out.println(num3);
		
		
		
	}

}
