package class23;

public class Practice {
	void area(double lenght, double wide) {

		if (lenght == wide) {
			System.out.println("The square area with lenght " + lenght + " wide " + wide + " is " + lenght * wide);
		} else {
			System.out.println("Rectangle area is " + lenght * wide);
		}

	}
	void area(double length, double wide, double height) {
		System.out.println("The box area is "+ length*wide*height);
	}
	public static void main(String[] args) {
		Practice practice= new Practice();
		practice.area(4, 4);
		practice.area(4, 3);
		practice.area(4, 2, 5);
		
	}
}