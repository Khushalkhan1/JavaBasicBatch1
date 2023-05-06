package class4;

public class PracticeDoubleCompariso {
	public static void main(String[] args) {
		/*
		 * CREATE A JAVA PROGRAM AND NAME IT DOUBLE COMPARISON. DECLARE 2 DOUBLE
		 * VALUES AND IF VALUE OF fiRST VARIABLE IS HIGHER THEN PRINT “DOUBLE VALUE IS
		 * LARGER THAN .” OTHERWISE
		 * 
		 * PRINT...
		 */
		double n1 = 19;
		double n2 = 16;
		if (n1 > n2) {
			System.out.println("Double value is larger then n2");
		} else {
			System.out.println("Otherwise n2 is bigger");
		}
		System.out.println("=====================================");

		/*
		 * Create a Java program and name it Temperature Check. Create variable to store
		 * temperature. Your program should check if temperature is below 32 then it
		 * should print “Water will freeze with temperature ”, otherwise “Water will NOT
		 * freeze with temperature ”.
		 */
		int temperature = 32;
		if (temperature >= 46) {
			System.out.println("Water, will freeze with temperature");
		} else {
			System.out.println("Water, will not freeze with temperature");
		}
		String study = "study hard";
		if (study == "study hard") {
			System.out.println("I got the job");
		} else
			System.out.println("I will lost the job");
	}

}
