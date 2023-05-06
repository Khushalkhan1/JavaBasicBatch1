package class23;

public class ThisAndSuper {
	int num;
	void ThisAndSuper(int num) {
		this.num=num;
		System.out.println("I am the first constructor");
		
	}
	void ThisAndSuper(String str) {
		System.out.println("I am the second constructor");
	
	}
	public static void main(String[] args) {
		System.out.println();
		ThisAndSuper obj = new ThisAndSuper();
		
	}

}
