package class10;

public class Arrays {
	public static void main(String[] args) {

		int num1 = -10;
		num1 = 20;
		System.out.println(num1);

		int[] numbers = new int[4];

		numbers[0] = 5;
		numbers[1] = 7;
		numbers[2] = 9;
		numbers[3] = 11;
		System.out.println(numbers[0]);
		double[] number = new double[3];
		number[0] = 3.7;
		number[1] = 6.89;
		number[2] = 9.12;
		System.out.println("num3 " + number[2] + " num1 " + number[0] + " num2 " + number[1]);

		String[] nameOfArray = new String[2];
		nameOfArray[0] = " Khushal";
		nameOfArray[1] = "Khan";
		System.out.println(nameOfArray[1] + nameOfArray[0]);

		boolean[] b = new boolean[3];
		b[0] = true;
		b[1] = false;
		b[2] = true;
		System.out.println(b[2]);

		int size = b.length;
		System.out.println("array size is " + size);

	}

}
