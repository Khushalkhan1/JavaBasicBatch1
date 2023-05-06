package class23;

public class Car {

	void start() {
		System.out.println("The car is starting by key");
	}

	void stop() {
		System.out.println("You should use break to stop the car");
	}

}

class BMW extends Car {
	void start() {
		System.out.println("Use the botton to start the car");
	}

}

class Tesla {
	void start() {
		System.out.println("Start the car with finger print botton");
	}

	void stop() {
		System.out.println("Stop the car with sensor");
	}

}
