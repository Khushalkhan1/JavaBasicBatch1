package class19;

public class StaticVariable {

	static String staticInfo = "This is static var information ";
	String name = "nonStatic";

	void info() {
		System.out.println(staticInfo);
	}

	public static void main(String[] args) {
		System.out.println(staticInfo);

	}

}
