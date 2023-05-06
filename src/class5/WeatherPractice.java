package class5;

import java.util.Scanner;

public class WeatherPractice {
	public static void main(String[] args) {
		
		/*
		 * Create a Java program that will ask user to input city and temperature. Your
		 * program should convert Fahrenheit into celsius and print “ The temperature is
		 * the city is ”
		 */
		Scanner weather = new Scanner(System.in);
		System.out.println("Please tell us the weather condition with true or false");
		boolean name = weather.nextBoolean();
		System.out.println("Please tell the city name first letter should be capital");
		String city = weather.next();
		System.out.println("Please tell the temperature in celcius degree");
		int num = 35;
		num = weather.nextInt();
		if(num>35) {
			System.out.println("I will go back home");
		}else {
			System.out.println("I am going back to work");;
			
		}
		
		}
	}


