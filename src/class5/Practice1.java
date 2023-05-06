package class5;

import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		/*
		 * Write a program that will read three inputs of scores (quiz, mid term, and
		 * final scores) and determine the grade based on the following rules: ● if the
		 * average score >=90 → grade=A ● if the average score >= 70 and <90 → grade=B ●
		 * if the average score>=50 and <70 → grade=C ● if the average score<50 →
		 * grade=F
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Please add your quiz score");
		int quiz = input.nextInt();
		System.out.println("Please add your mid term score");
		int midterm = input.nextInt();
		System.out.println("Please add your final score");
		int finalScore = input.nextInt();

		int avg = (quiz + midterm + finalScore) / 3;
		if (avg >= 90) {
			System.out.println('A');
		} else if (avg >= 70 && avg < 90) {
			System.out.println('B');
		} else if (avg >= 50 && avg < 70) {
			System.out.println('C'); 
		} else {
			System.out.println("F");
		}

	}
}
