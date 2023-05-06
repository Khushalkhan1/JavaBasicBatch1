package reveiwClass4;

public class Demo2 {
	public static void main(String[] args) {
		
		String num = "vduidhfbbnjshreg844t#$@$4";
		System.out.println(num.replaceAll("[^0-9]", ""));//only number will stay
		System.out.println(num.replaceAll("[^a-z]", ""));//only alphabet will stay
		
		String name = "Joincoretech";
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.length());
		
		
	}

}
