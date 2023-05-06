package class3;

public class ShortHandOperatorHW1 {
	public static void main(String[] args) {

		/*
		 * 4.Declare variable cakePiece=25 and divide cakePiece between 7 people . Using
		 * shorthand operator found out how many pieces of cake left after it was
		 * distributed equally among 7 people
		 */
		double cakepiece = 25;
		int people = 7;
		cakepiece %= 7;
		System.out.println(cakepiece);
		double pieces = cakepiece % 7;
		System.out.println(pieces);

	}

}
