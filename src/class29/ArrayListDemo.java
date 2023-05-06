package class29;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> subjects = new ArrayList<String>();
		subjects.add("SDLC");
		subjects.add("STLC");
		subjects.add("Java");
		subjects.add("Git");
		subjects.add("Selenium");
		System.out.println(subjects.get(1));
		subjects.add("Testing");
		System.out.println(subjects.get(5));
		System.out.println(subjects.size());
		System.out.println(subjects.indexOf("Git"));
		subjects.remove("Git");
		System.out.println("This is the size after remove git " + subjects.size());
	}

}
