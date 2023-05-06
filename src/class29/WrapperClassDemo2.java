package class29;

public class WrapperClassDemo2 {
	public static void main(String[] args) {
		int a =10;
		Integer aa =a; // auto boxing 
		int b =aa;//unboxing 
		Integer integer = new Integer(15);//This is the long way.
		System.out.println(integer);
		Integer integer1=45;//This is short way.
		int abc = integer1.intValue();
		abc = integer1;//short way of unboxing.
		
		
	
	}

}
