package reviewClass7;

public class VariablesDemo {
	
	int num=10;
	String name="Noor";
	static String str="Everyone like to have today off";
	
	public void nonStaticMethod() {
		System.out.println(num);
		System.out.println(str);
		
	}
	
	public static void StaticMethod() {
		System.out.println(str);
		VariablesDemo variablesDemo = new VariablesDemo();
		System.out.println(variablesDemo.name);
	}
	
	void localMethod(String inf) {
		String name="This is your info";
		System.out.println(str +inf);
	}
	public static void main(String[] args) {
		StaticMethod();
		VariablesDemo obj = new VariablesDemo();
		obj.localMethod(" Arif");
		obj.nonStaticMethod();
	}

}
