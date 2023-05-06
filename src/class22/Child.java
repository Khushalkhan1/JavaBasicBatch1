package class22;

public class Child extends Parent {
	
	String greting = "Hello I am child class";
	
	public void printgreeting() {
		System.out.println(this.greeting);
		System.out.println(super.greeting);
		
	}

}
