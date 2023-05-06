package class22;

public class ConstructorOverLoading {

	String name;
	int EmpId;
	double salary;
	String department;

	ConstructorOverLoading(String name) {
		this.name = name;
		System.out.println(name);
	}

	ConstructorOverLoading(String name, int EmpId) {
		this(name);
		this.EmpId = EmpId;
		System.out.println(EmpId);
	}

	ConstructorOverLoading(String name, int EmpId, double salary) {
		this(name, EmpId);
		this.salary = salary;
		System.out.println(salary);

	}
}
