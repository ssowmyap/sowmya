package stringmodule;

import java.util.Scanner;

public class Basicarray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc =new Scanner (System.in);
		int accno[]=new int[4];
	   for (int i = 0; i < accno.length; i++) {
		   System.out.println("enter the numbers");
		   num=sc.nextInt();
		   accno[i]=num;
	   }
		   for (int i = 0; i < accno.length; i++) {
				System.out.println(accno[i]);
				
			
		}

	}

}
