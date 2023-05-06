package reviewClass7;

public class OverRidingMethod {
	String name;
	
	void printInfo(String name) {
		this.name=name;
		System.out.println("Hello this is your name "+name);
	}

}
class Child extends OverRidingMethod{
	void printInfo(String name) {
		this.name=name;
		System.out.println("Hello this is child class info "+name);
	}
}