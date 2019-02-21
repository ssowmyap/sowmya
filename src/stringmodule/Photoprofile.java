package stringmodule;

import java.util.Scanner;

public class Photoprofile {

	public static void main(String[] args) {
		int l=45;
		Scanner sc=new Scanner(System.in);
		int w=sc.nextInt();
		int h=sc.nextInt();
		if(w<=l&&h<=l)
		System.out.println("upload another");
		else if(w>=l&&h>=l)
			System.out.println("crop it");
		else
			System.out.println("accepted");

	}

}
