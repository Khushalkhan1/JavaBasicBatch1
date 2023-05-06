package reviewClass7;

public class OverLoadingDemo {
	
	OverLoadingDemo(){
		System.out.println("I am constructor with out paramter");
	}
	OverLoadingDemo(String name){
		System.out.println("Hello i am parameter constructor "+name);
	}
	void printInfo() {
		System.out.println("This is your info");
	}
	public void printInfo(String name) {
		System.out.println("Hello this is your info "+name);
	}
	static void staticMethod() {
		System.out.println("Hello i am the static method");
	}
	static void staticMethod(String name) {
		System.out.println("Hello i am the static with parameter "+name);
	}
	public static void main(String[] args) {
		OverLoadingDemo obj = new OverLoadingDemo();
		obj.printInfo();
		obj.printInfo("Noor");
		OverLoadingDemo obj1 = new OverLoadingDemo("Arif");
		
	}

}
