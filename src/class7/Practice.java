package class7;

public class Practice {
	public static void main(String[] args) {
		/*
		 * Create a boolean variable workDay and assign true create int variable day and
		 * assign it to 1 ● As long as it is workDay print “I need a day off” and
		 * increase day. ● Once day is 6 or 7 print “I do not need a day off any more”
		 */
		boolean WorkDay = true;
		int Day = 1;

		while (Day <= 7) {
			System.out.println("I need a day off");
			Day++;
		}
		System.out.println("I don't need a day off");
		System.out.println("=======================");

		int day = 7;
		boolean workDay = true;
		if (day >= 1 && day < 7) {
			System.out.println("I need a day off");
		} else {
			System.out.println("I don't need a day off");
		}

	}

}
