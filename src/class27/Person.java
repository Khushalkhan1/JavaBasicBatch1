package class27;

public interface Person {
	void eat();

	void sleep();

	void study();

}

interface Employee {
	void work();

}

interface JoincoreEmployee extends Person, Employee {
	void tech();

}

class Emp implements JoincoreEmployee {
	public void sleep() {
		System.out.println("Joincor Employee also sleep");
	}

	public void eat() {
		System.out.println("Joincore Employee also eat");
	}

	public void study() {
		System.out.println("Joincore Employee study");
	}

	public void work() {
		System.out.println("Joincore Employee work");
	}

	public void tech() {
		System.out.println("Joincore Employee tech");

	}
}
