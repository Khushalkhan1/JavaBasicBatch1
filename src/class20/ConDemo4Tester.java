package class20;

public class ConDemo4Tester {
	public static void main(String[] args) {
		ConDemo4 emp = new ConDemo4("Mohib", 100000, 320, 10);
		
		emp.printBonus();
		System.out.println(emp.name);
		System.out.println(emp.salary);
		System.out.println(emp.bonus);
		System.out.println(emp.bonusPercentage);
		System.out.println(emp.numberofWorkDays);
		
	}

}
