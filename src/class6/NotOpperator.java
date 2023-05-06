package class6;

public class NotOpperator {
	public static void main(String[] args) {
		// not (!) will change the true value to the false.
		
		boolean isRain = !true;
		System.out.println(isRain);
		
		boolean good = true;
		if(!good) {
			System.out.println("it is not good");// when good is not true
		}else {
			System.out.println("it is good");// true
		}
	}

}
