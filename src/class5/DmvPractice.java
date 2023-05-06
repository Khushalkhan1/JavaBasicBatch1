package class5;

import java.util.Scanner;

public class DmvPractice {
	public static void main(String[] args) {
		/*
		 * You are DMV representative and you need to ask customer their age. If they
		 * are 18 and older you will issue a driver license to them, otherwise you will
		 * offer them to get a learners permit.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please tell us your age");
		int age = scan.nextInt();
		if(age >= 18) {
			System.out.println("Congratulation! You are eligible for the license");
		}else {
			System.out.println("Sorry! you can not apply for the license but you can have your permit");
		}
		
		
		
	}

}
