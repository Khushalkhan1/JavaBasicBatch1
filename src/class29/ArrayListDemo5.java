package class29;

import java.util.ArrayList;

public class ArrayListDemo5 {
	public static void main(String[] args) {
		ArrayList <String> subjects = new ArrayList<>();
		subjects.add("SDLC");
		subjects.add("STLC");
		subjects.add("Java");
		subjects.add("Git");
		subjects.add("Selenium");
		
		ArrayList <String> allsubjects = new ArrayList<>();
		allsubjects.add("SDLC");
		allsubjects.add("STLC");
		allsubjects.add("Java");
		allsubjects.add("Git");
		allsubjects.add("Selenium");
		System.out.println(subjects.containsAll(allsubjects));
		System.out.println(allsubjects.size());//This will give the Array list length or size.	
		for(String str:allsubjects) {
			System.out.println(str+" length is "+str.length());
			
			
		}
	}

}
