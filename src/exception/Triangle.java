package exception;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        System.out.println("enter value of a");
        int a=s.nextInt();
        System.out.println("enter value of b");
        int b=s.nextInt();
        System.out.println("enter value of c");
        int c=s.nextInt();
        if((c*c)==(a*a)+(b*b)) {
        		System.out.println("yes");
      
	}else
		System.out.println("no");
	}
}
