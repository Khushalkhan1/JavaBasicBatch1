package class34;

import java.util.Scanner;

public class ExceptionDemo2 {
    public static void main(String[] args) {

        System.out.println("Please enter your first number");
        Scanner scanner=new Scanner(System.in);
        int num1=scanner.nextInt();
        System.out.println("Please add your second number");
        int num2=scanner.nextInt();
        System.out.println(num1/num2);
        if (num2==0){
            System.out.println("Can not be divided by zero");
        }else {
            System.out.println(num1/num2);
        }

        System.out.println("Some important line of codes");
        System.out.println("Some important line of codes");
        System.out.println("Some important line of codes");
        System.out.println("Some important line of codes");
        System.out.println("Some important line of codes");


    }
}
