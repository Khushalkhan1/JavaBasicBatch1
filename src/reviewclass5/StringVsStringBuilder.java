package reviewclass5;

public class StringVsStringBuilder {
	public static void main(String[] args) {

		String var1 = "Khushal";
		String var2 = "Farhad";
		String var3 = "Aziz";
		String var4 = "Nobody";

		var4 = "Nobody";

		StringBuilder str = new StringBuilder("Khushal");
		str.append(" Khan");
		System.out.println(str);

		StringBuilder str2 = new StringBuilder(var4);
		str2.reverse();
		var4 = str2.toString();
		System.out.println(var4);
	}

}
