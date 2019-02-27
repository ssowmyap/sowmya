package practice;

import java.util.Scanner;

public class StringToken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        //if(s.contains(" ")||s.contains("!")||s.contains("?")||s.contains(".")||s.contains("_")||s.contains("'")||s.contains("@"));
	
       String s1= s.replaceAll("[ !,?._'@]","\n");
       int n=s1.length ();
       System.out.println(n);
        System.out.print(s1);
        scan.close();
	}

}
