package class27;

public class StaticMethodDemo implements I1 ,I2 {
	public void method1() {
		I1.method1();
		I2.method2();
	}

}

interface I1{
	static void method1() {
		System.out.println("This is interface 1");
	}
}
interface I2{
	static void method2() {
		System.out.println("This is interface 2");
		
	}
}
