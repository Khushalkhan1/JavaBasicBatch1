package class19;

public class LocalVariable {

	public void addition(int num1, int num2) {
		System.out.println(num1 + num2);

	}

	public void sub() {
		// These are local variables
		int num1 = 12;
		int num2 = 10;
		System.out.println(num1 - num2);	
	}
	
	String returnString(int num) {
		return  "This is String ";
	}
	public static void main(String[] args) {
		LocalVariable  LocalVariable = new LocalVariable();
		LocalVariable.addition(10,15);
		LocalVariable.sub();
		System.out.println(LocalVariable.returnString(1));
		
	}

}
