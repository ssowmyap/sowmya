package conditions;

import java.util.Iterator;
import java.util.Scanner;

public class Appleorange {
	static void appleAndOrange(int s,int t, int[]apple,int[]orange) {
	 int applecount=0;
	 int orangecount=0;
		for (int i = 0; i < apple.length; i++) {
			int a = 0;
			if(apple[i]+a<=s&&orange[i]<=t)
				applecount++;
			else
				orangecount++;
		}
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
 System.out.println("enter apple distance");
 int s=sc.nextInt();
 System.out.println("enter orange distance");
 int t=sc.nextInt();
 int a[]= {10,-5,15,7,18};
 int b[]= {10,-17,15,-7,-15};
 Appleorange ao=new Appleorange();
  ao.appleAndOrange(s, t,a, b);
	}

}
