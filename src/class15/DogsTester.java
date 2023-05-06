package class15;

public class DogsTester {
	public static void main(String[] args) {
		
		Dogs bullDog =new Dogs();
		bullDog.breed = "American BullDog";
		bullDog.color = "yellow";
		bullDog.size = "large";
		bullDog.age = "5";
		bullDog.eat();
		bullDog.bark();
		bullDog.sleep();
		
		Dogs grandHunt = new Dogs();
		grandHunt.breed = "Afghan grant hunt ";
		grandHunt.color = "green";
		grandHunt.size = "tall";
		grandHunt.age = "10";
		grandHunt.look();
		
		
	}

}
