package class19;

public class InstanceVariable {
	String name = "Khushal";
	int age = 19;
	public void info() {
		InstanceVariable obj = new InstanceVariable();
		System.out.println(obj.age);
		System.out.println(obj.name);
		String cell = "200800";
		System.out.println(cell);
	}
	public static void main(String[] args) {
		InstanceVariable obj = new InstanceVariable();
		obj.info();
	}

}
