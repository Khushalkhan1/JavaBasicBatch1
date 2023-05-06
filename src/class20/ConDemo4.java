package class20;

public class ConDemo4 {

	String name;
	double bonus;
	double salary;
	double bonusPercentage;
	int numberofWorkDays;

	ConDemo4(String name, double salary, int numberofWorkDays, double bonusPercentage) {

		this.name = name;
		this.bonus = 1000;
		this.salary = salary;
		this.bonusPercentage = bonusPercentage;
		this.numberofWorkDays = numberofWorkDays;

	}

	void printBonus() {
		if (numberofWorkDays > 300) {
			bonus = 1500;
		} else {
			bonus = 500;

		}
	}

}
