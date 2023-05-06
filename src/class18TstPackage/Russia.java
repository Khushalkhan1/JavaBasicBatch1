package class18TstPackage;

import class18.USA;

public class Russia extends USA 		{
	public static void main(String[] args) {
		USA obj3 = new USA();
		System.out.println(obj3.school);
		System.out.println(obj3.mainState);       
		System.out.println(obj3.name);
		//System.out.println(obj3.capitalCity);//not accessible
	}
}
