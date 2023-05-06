package class22;

public class MethodOverLoadingDemo2 {

	void add(int a, int b) {
		System.out.println(a + b);
	}
	
	void add(int... arr) {
		int sum = 0;
		for (int num : arr) {
			sum += num;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		MethodOverLoadingDemo2 obj = new MethodOverLoadingDemo2();

		obj.add(10, 12, 5, 6);

	}

}
