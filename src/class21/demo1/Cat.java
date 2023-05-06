package class21.demo1;

public class Cat extends Animal{
	
	Cat(String name){
		this.name=name;
	}
	
	void meow() {
		System.out.println(name + " is meowing");
	}
	void hunt() {
		System.out.println(name + " is mouse hunter");
	}
	void sleep() {
		System.out.println(name + " is sleepping");
		
	}

}
