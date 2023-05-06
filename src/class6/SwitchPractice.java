package class6;

public class SwitchPractice {
	public static void main(String[] args) {
		int day = 7;
		String weekDays = "";
		
		switch (day) {
		case 1:
			weekDays = "Monday";
			break;
		case 2:
			weekDays = "Tuesday";
			break;
		case 3:
			weekDays = "wedensday";
			break;
		case 4:
			weekDays = "Thursday";
			break;
		case 5:
			weekDays = "Friday";
			break;
		case 6:
			weekDays = "Saturday";
			break;
		case 7:
			weekDays = "Sunday";
			break;
		default:
			weekDays = "Day invalid";

		}
		System.out.println(weekDays);
	}
}