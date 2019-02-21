package conditions;

import java.util.Scanner;

public class BirthdayCandle {
	static int birthdayCakeCandle (int[] arr) {
		int max=0, count=0;
		
		for (int i = 0; i < arr.length; i++) {
			if(max>arr[i])
				max=arr[i];
				
		}
		for (int i = 0; i < arr.length; i++) {
			if(max==arr[i])
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    Scanner sc=new Scanner(System.in);
   
	System.out.println("enter the age");
	int a=sc.nextInt();
	int ar[]= new int[a];
	for (int i = 0; i < ar.length; i++) {
		a=sc.nextInt();
		ar[i]= a;
		
	}
	
	BirthdayCandle bc=new BirthdayCandle();
    birthdayCakeCandle(ar);
	}
}
