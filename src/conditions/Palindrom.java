package conditions;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc= new Scanner(System.in);
         System.out.println("enter the numbers");
         int num =sc.nextInt();
         int num1,num2,num3;
         num1=num%10;
         num2=num/10;
         num3=num/100;
         if(num==num1+num2+num3);
         {
        	 System.out.println("the number is palindrom");
	}
         }

}
