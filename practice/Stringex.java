package practice;

import java.util.Scanner;

public class Stringex {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int n1=A.length();
        int n2=B.length();
     System.out.println(n1+n2);
     if(A.equals(B))
    	
     System.out.println("Yes");
     else
    	 System.out.println("No");
     StringBuilder result =new StringBuilder(A.length());
     StringBuilder result1 =new StringBuilder(B.length());
	String word[]= A.split("\\ "); 
	String words[]= B.split("\\ "); 
	
     for (int i = 0; i < word.length; i++) {
		
    	 result.append(Character.toUpperCase(word[i].charAt(0))).append(word[i].substring(1)).append(" ");;
    	result1.append(Character.toUpperCase(words[i].charAt(0))).append(words[i].substring(1)).append(" ");;
	}
	System.out.println(result);
	System.out.println(result1);
	}
}
