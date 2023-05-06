package class21.demo1;

public class Dog extends Animal{
	
	Dog(String name){
		this.name=name;
	}
	void run() {
		System.out.println(name + " is runing");
	}
	void bark() {
		System.out.println(name + " is barking");
	}
	void eat() {
		System.out.println(name + " is eating");
	}

}
