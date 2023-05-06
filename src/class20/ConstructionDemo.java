package class20;

public class ConstructionDemo {

	String name = "Aziz";

    ConstructionDemo() {

		System.out.println("I am a constructor");

	}

	public static void main(String[] args) {
		ConstructionDemo con = new ConstructionDemo();
		System.out.println(con.name);
	}

}
