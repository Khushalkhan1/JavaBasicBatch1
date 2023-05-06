package class21.demo1;

public class AnimalTester {
	public static void main(String[] args) {
		
		Dog dog = new Dog("Max");
		dog.bark();
		dog.eat();
		dog.run();
		
		
		Cat cat = new Cat("Tom");
		cat.hunt();
		cat.meow();
		cat.sleep();
		
		Lion lion = new Lion("Sheer");
		lion.roar();
		lion.eat();
		lion.sleep();
	}
}
