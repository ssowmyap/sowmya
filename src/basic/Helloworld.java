package basic;

import java.util.Scanner;

public class Helloworld {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the first number");
		short num1=sc.nextShort();
		System.out.println("enter the second number");
		short num2=sc.nextShort();
		System.out.println(num1+=num2);
   }

}
