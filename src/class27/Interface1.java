package class27;

public interface Interface1 {
	String name="Aziz";//java compiler will add public static final to the variable
	public void interfaceMethod();
	
}
interface Interface2{
	void interfaceMethod();
	
}
class Child implements Interface2 , Interface1{
	public void interfaceMethod() {
		System.out.println("This is same method for all interfaces");
		System.out.println(name);
		
	}
	
}
