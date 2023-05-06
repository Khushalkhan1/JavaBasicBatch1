package class10;

public class GetElementyAdvancedLoop {
	public static void main(String[] args) {

		int[] numbers = { 23, 24, 25, 26, 27 };
		// we want to print the Array all Elements use the advanced or enhanced loop

		for (int arraynumbers : numbers) {
			if (arraynumbers % 2 != 0) {

				System.out.print(arraynumbers + " ");
			}
		}
		System.out.println();
		String[] names = {"Aziz ","farhad ","Mohibullah ","Mohammad Arif " };
		for (int i = 0; i < names.length; i++) {

			System.out.print(names[i] + " ");

		}
		System.out.println();
		for (String a:names) {
			System.out.print(a+ " ");
		}

	}
}
