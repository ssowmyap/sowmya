package conditions;

import java.util.Scanner;

public class Greatestarray {
	public double[] arraygreatest() {
		int sum=0;
	int a;
	for (int k = 0; k < a.length; k++) {
		int avg=sum/a.length;
	if(a[k]>avg) {
		System.out.println("greater");
	
	}
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		for (int i = 0; i < a.length; i++) {
			int j=sc.nextInt();
			a[i]=j;
			System.out.println(a[i]);
		Greatestarray ga=new Greatestarray();
				ga.arraygreatest(a, j);
		}

	}

}
