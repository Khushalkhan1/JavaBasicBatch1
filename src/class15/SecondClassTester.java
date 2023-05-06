package class15;

public class SecondClassTester {
	public static void main(String[] args) {
		
		SecondClass object = new SecondClass();
		object.var1 = "Farhad";
		object.var2 = "Aziz";
		
		object.method1();
		object.method2();
		
		SecondClass object2 = new SecondClass();
		object2.var1 = "Fahad";
		object2.method1();
		
	}

}
