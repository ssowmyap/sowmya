package conditions;

import java.util.Scanner;

public class ArrayExample {
public void acceptElements() {
	Scanner sc=new Scanner(System.in);
	int a[]=new int[5];
	for (int i = 0; i < a.length; i++) {
		int j=sc.nextInt();
		a[i]=j;
if(a[i]==7) {
	for (int j2 = 0; j2 < a.length; j2++) {
		for (int k = j2+1; k > a.length; k++) {
			int temp=a[k];
			a[j2]=a[k];
			a[j2]++;
		}
	}
}
	
		
}
}
	public static void main(String[] args) {
	
           ArrayExample ae=new ArrayExample();
           ae.acceptElements();
	}

}
