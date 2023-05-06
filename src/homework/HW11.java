package homework;

public class HW11 {
	public static void main(String[] args) {
		
		/*
		- Add the values of num1 and num2 and then subtract num3 from the result and store it in result1 variable
		- Multiply num4 and num5 together and then divide num6 from the result and store it in result2 variable
		- Print the following statement:
		**_______ Modded by _______ is ______**
		result2           result1    blank3
		where blank3 is the remainder of result1 into result2
		 */
		
		int num1 = 8;
		int num2 = 7;
		int add = num1+num2;//15;
		int num3 = 6;
		int sub = add-num3;//9;
		int result1 = add-num3;		
		int num4 = 5;
		int num5 = 4;
		int mul = num4*num5;//20;
		int num6 = 3;
		int div = mul/num6;//6;
		int result2 = mul/num6;
		double blank3;
		System.out.println(result2 + " modded by " + result1 + " is + double");
	}

}
