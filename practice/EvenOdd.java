package practice;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0&&n>=2&&n<=5)
        {
        	System.out.println("not weird");
        }
	else if(n%2==0&&n>20) {
		System.out.println("not weird");
	}
	else
		System.out.println("weird");
}
	
}
