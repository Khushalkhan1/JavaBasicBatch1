package class15;

public class Dogs {

	String breed;
	String size;
	String color;
	String age;

	public void bark() {
		System.out.println("buf buf buf buf");
	}

	public void sleep() {
		System.out.println("ZZZZzzzzz.....");
	}

	public void eat() {
		for (int i = 0; i < 5; i++) {
			System.out.println("ach ach ach crap omomo");
		}

	}

	public void look() {
		System.out.println("Hi i am " +breed+ "my color is " +color);
	}

}