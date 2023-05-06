package class4;

public class Practice1 {
	public static void main(String[] args) {
		/*
		 * WRITE A PROGRAM TO STORE A BOOLEAN VALUE OF WHETHER USER HAS DIPLOMA OR NOT.
		 * IF USER HAS A DIPLOMA , YOU SHOULD SAY CONGRATULATIONS, OTHERWISE PROGRAM
		 * SHOULD SUGGEST TO GET A DEGREE. THEN IF USER HAS A DEGREE PROGRAM SHOULD
		 * CHECK A GPA SCORE. IF GPA SCORE IS HIGHER OR EQUALS TO 3.5 → OUTPUT SHOULDS
		 * AY “YOU ARE ELIGIBLE FOR SCHOLARSHIP”, OTHERWISE → “YOU SHOULD HAVE STUDIED
		 * HARDER”
		 */
		boolean diploma = false;
		double GPA = 3.0;
		if (diploma == true) {
			System.out.println("Congratulation, you have diploma");
			if (GPA >= 3.5) {
				System.out.println("You are eligible, you can apply");
			} else {
				System.out.println("You should have studied harder");
			}
		} else {
			System.out.println("You should have studied harder");

		}

	}

}
