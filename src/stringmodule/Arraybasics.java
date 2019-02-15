package stringmodule;

import java.util.Scanner;

public class Arraybasics {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		int accno[]=new int[4];
		accno[1]=342;
		accno[3]=34;
		for (int i = 0; i < accno.length; i++) {
			int j = accno[i];
			System.out.println(accno[i]);
			
		}

	}

}
