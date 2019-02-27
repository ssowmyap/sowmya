package practice;

import java.util.Scanner;

public class Endoffile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
       // String s1=s.nextLine();
        for(int i = 1;s.hasNext()==true;i++) {
        	System.out.println(i+""+s.nextLine());
        }
	}

}
