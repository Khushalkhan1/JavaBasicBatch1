package class10;

public class ArrayLenght {
	public static void main(String[] args) {

		String[][] countries = { { "Afghanistan", "Iraq", "Iran", "Japan" }, { "China", "Canada", "India" },
				{ "Usa", "Serbia", "Mexico" } };

		System.out.println("The row numbers " + countries.length);
		System.out.println("The first row element " + countries[0].length);//
		System.out.println(countries[1].length);// the second row element
		System.out.println(countries[2].length);// the third row element
		for (int r = 0; r < countries.length; r++) {

			for (int c = 0; c < countries.length; c++) {
				System.out.print(countries[r][c] + " , ");
			}
		}

		System.out.println();
		System.out.println("=================Use for each loop to get 2D array elements==========");

		for (String[] cot : countries) {
			for (String c : cot) {
				System.out.print(c + " ** ");
			}
		}
	}

}
