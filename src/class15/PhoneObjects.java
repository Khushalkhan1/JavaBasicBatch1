package class15;

public class PhoneObjects {
	public static void main(String[] args) {
		
		MobilePhone iphone = new MobilePhone();
		
		iphone.module = "input 12";
		iphone.price = 999;
		iphone.size = 6.4;
		iphone.make = "Apple";
		iphone.color = "Blue";
		iphone.phoneDetails();
		
		MobilePhone samsung = new MobilePhone();
		
		samsung.module = "S21 ultra";
		samsung.price = 1000;
		samsung.make = "Samsung";
		samsung.color = "Black";
		samsung.size = 7.4;
		samsung.phoneDetails();
	}

}
