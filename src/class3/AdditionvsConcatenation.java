package class3;

public class AdditionvsConcatenation {
public static void main(String[] args) {
		
		int number1 = 5;
		int number2 = 10;
		
		
		System.out.println(number1 + number2);// 15
		
		String str1 = "Hello";
		String str2 = "hi";
		String str3 = "5";
		
		System.out.println(number1+number2+str1+str2);// 15HelloHi
		System.out.println(number1+number2+str3+str1+str2); //155HelloHi
		
		System.out.println(number1+(str1)+number2);// 5Hello10
		
     }


}
