package class6;

public class MonthSwitch {
	public static void main(String[] args) {

		int month = 16;

		switch (month) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("Febuary");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
		default:
			System.out.println("The month is invalid");
		}

		System.out.println("==============================");
		// Create a program to explain grade A, B, C, in the number range.

		char grade = 'D';
		switch (grade) {
		case 'A':
			System.out.println(grade + " = 90-100");
			break;
		case 'B':
			System.out.println(grade + " = 80-89");
			break;
		case 'C':
			System.out.println(grade + " = 70-79");
			break;
		default:
			System.out.println("This grade is not in our system, We only accept grade A, B, C, ");
		}

	}

}
