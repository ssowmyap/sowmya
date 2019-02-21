package conditions;

import java.util.Scanner;

public class Greatestnum {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num1=sc.nextInt();
		System.out.println("enter 2nd num");
		int num2=sc.nextInt();
		System.out.println("enter 3rd num");
		int num3=sc.nextInt();
		if(num1>num2&&num1>num3)
			System.out.println("num1 is greater" );
		else if(num2>num1&&num2>num3)
			System.out.println("num2 is greater");
		else
			System.out.println("num3 is greater");

	}

}
