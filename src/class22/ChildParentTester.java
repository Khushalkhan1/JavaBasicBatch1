package class22;

public class ChildParentTester {
	public static void main(String[] args) {
		Child child = new Child();
		Parent parent = new Parent();
		parent.greeting="This is parent update value";
		parent.printGreeting();
		child.printGreeting();

	}
}
