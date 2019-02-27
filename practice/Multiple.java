package practice;

import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int i=1;
      
      while(i<=10) {
    	  System.out.println(num+" " + "x" + " " + " "+i+" "+ "="+" "+num*i);
	i++;
	}
	}
}
