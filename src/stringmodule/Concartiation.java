package stringmodule;

import java.io.PrintStream;
import java.util.Scanner;

public class Concartiation {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    String str1=sc.next();
    String str2=sc.next();
    lenght(str1,str2);
	}

	private static void lenght(String str1, String str2) {
	     StringBuilder sb = new  StringBuilder();
		for (int i = 0; i < str1.length(); i++) {
	    	
			sb.append(str1.charAt(i));
			sb.append(str2.charAt(i));
			
	     
			}
	     
	      System.out.println(sb);
		
	}
}



