package com.test;

import java.util.Scanner;

public class MarsandEarth {
	
	 static  StringBuilder marsandEarth(String s) {
		char []sb=s.toCharArray();
		StringBuilder marsandEarth=new StringBuilder();
for (int i = 0; i < s.length(); i++) {
	marsandEarth.append(sb[i]+s);
			
		}
int i = 0;
if(sb[i]%3!=0) {
	 System.out.println(s);
	 
}
else
	 System.out.println("no falut");
	return marsandEarth;
	 }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String s=sc.next();
       
     
     MarsandEarth sb=new  MarsandEarth();
     sb.toString();
        
	}

}
