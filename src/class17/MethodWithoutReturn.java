package class17;

public class MethodWithoutReturn {
	public static void main(String[] args) {
		MethodWithoutReturn obj = new MethodWithoutReturn();

		System.out.println(obj.add(10, 15));
		System.out.println(obj.reverseString("good"));
		obj.isRaining(false);
	}

	int add(int a, int b) {
		int c;
		c = a + b;
		return c;

	}

	String reverseString(String str) {
		StringBuilder stringBuilder = new StringBuilder(str);
		stringBuilder.reverse();
		str = stringBuilder.toString();
		return str;

	}

	void isRaining(boolean rain) {
		if(rain) {
			System.out.println("Take your umbrella with you");
		}else {
			System.out.println("You do not need umbrella");
		}
		
		
	}

}
