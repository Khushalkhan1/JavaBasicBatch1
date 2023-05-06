package reviewclass5;

public class BuiltInMethods {
	public static void main(String[] args) {

		String words = "Batch1 likes to have a long brake";
		// The way to count words
		String[] wordsCount = words.split(" ");

		System.out.println(wordsCount.length);

		String sentences = "This is batch1 . They are doing great . Deffinetly they will get the job ";
		String[] sentence = sentences.split(" . ");
		System.out.println(sentences.length());
		for (String n : sentence) {
			System.out.println(n);
		}
		String str = "words";
		str.length();
		String newStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			newStr += str.charAt(i);
		}
		System.out.println(newStr);

		char[] reverseStr = str.toCharArray();
		for (int i = reverseStr.length - 1; i >= 0; i--) {
			System.out.print(reverseStr[i]);
		}
		//organizing code in intelij ide
		//ctrl+alt+l
	}

}
