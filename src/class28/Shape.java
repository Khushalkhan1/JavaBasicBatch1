package class28;

public interface Shape {
	/*
	 * Create an Interface methods as 'Shape' with undeﬁned calculateArea and
	 * calculatePerimiter. Create 2 classes Circle & Square that implements
	 * functionality deﬁned in the Shape Interface. Test your code.
	 */
	
	void calculateArea();
	void calculateParameter();
	
}
class Circle implements Shape{
	public void calculateArea() {
		int radius=2;
		int rSquar=radius*radius;
		
		System.out.println(rSquar*Math.PI);
	}
	public void calculateParameter() {
		int radius=3;
		System.out.println(2*radius*Math.PI);
		System.out.println(2*radius*Math.PI);
		
	}
}
class Square implements Shape{
	int side = 5;
	public void calculateParameter() {
		System.out.println(4*side);
	}
	@Override
	public void calculateArea() {
		System.out.println(side*side);
	}
}