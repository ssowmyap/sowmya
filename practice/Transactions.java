package practice;

import java.util.Scanner;

public class Transactions {
   int balance=0;
	public void transactions() {
		Scanner sc=new Scanner(System.in);
	
	   System.out.println("enter choice");
	   System.out.println("1.withdraw");
       System.out.println("2.deposite");
       System.out.println("3.exit");
       int amount=sc.nextInt();
       int choice = 0;
       while(choice>3)
	switch ( choice) {
	case 1:
	boolean withdraw = (balance>amount); 
		System.out.println("withdraw:");
		balance-=amount;
	
		break;
	case 2:
	boolean deposite=(balance<amount);
		System.out.println("deposite:");
		balance+=amount;
		break;
	case 3:
		System.out.println("exit");
		break;
	default:
		System.out.println("error");
		break;
	}
	}
	
	public static void main(String[] args) {
		Transactions t=new 	Transactions();
		t.transactions();

	}

}
