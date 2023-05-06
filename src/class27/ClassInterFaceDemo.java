package class27;

public class ClassInterFaceDemo implements I, II {
	public void interfaceMethod() {
		System.out.println("this is implementation for for class inheritance");
	}

	public static void main(String[] args) {
		ClassInterFaceDemo classInterFaceDemo = new ClassInterFaceDemo();
		classInterFaceDemo.interfaceMethod();
	}

}

interface I {

	void interfaceMethod();
}

interface II {
	void interfaceMethod();
}
