package class4;

public class Ifelsecondition2 {
	public static void main(String[] args) {

		double num1 = 14.56;
		double num2 = 100.0;
		if (num1 > num2) {
			System.out.println("double value " + num1 + " is bigger then " + num2);
		} else if (num1 < num2) {
			System.out.println("double value " + num1 + " is smaller then " + num2);
		} else {
			System.out.println(num1 + " is equal to " + num2);
		}
		System.out.println("===============================");
		// If we need more condition we add else if
		// write the week
		int day = 5;
		if (day == 1) {
			System.out.println("Today is Monday");
		} else if (day == 2) {
			System.out.println("Today is Tuesday");
		} else if (day == 3) {
			System.out.println("Today is Wedensday");
		} else if (day == 4) {
			System.out.println("Today is Thursday");
		} else if (day == 5) {
			System.out.println("Today is Friday");
		} else if (day == 6) {
			System.out.println("Today is Saturday");
		} else if (day == 7) {
			System.out.println("Today is Sunday");
		} else {
			System.out.println("The day is invalid");
		}
		System.out.println("=========================");
		int a = 2;
		System.out.println(a==2);//
		
		boolean isRain = false;
		if(isRain) {
			System.out.println("I will stay home, weather is not good");
		}else {
			System.out.println("I will go to park");
		}
		
		}

}
