package class20;

public class ConDemo2 {

	double bonus;
	double salary;
	String name;

	ConDemo2(String name) {

		bonus = 5000;
		salary = 50000;
		this.name = name;
	}

	public static void main(String[] args) {
		ConDemo2 obj = new ConDemo2("Farhad");
		System.out.println("This is my bonus " + obj.bonus);
		System.out.println("This is my salary " + obj.salary);
		System.out.println(obj.name);

	}

}
