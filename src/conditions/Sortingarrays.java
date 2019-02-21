package conditions;

import java.util.Arrays;
import java.util.Scanner;

public class Sortingarrays {
	public void arraysSort() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array of a");
		int a[]=new int[5];
		System.out.println("enter array of b");
		int b[]=new int[5];
		for (int i = 0; i < a.length; i++) {
			int j=sc.nextInt();
			a[i]=j;
			Arrays.sort(a);
			//System.out.println(Arrays.toString(a));
		}
	for (int j1 = 0; j1 < b.length; j1++) {
		int j2=sc.nextInt();
		b[j1]=j2;
	Arrays.sort(b);
	//System.out.println(Arrays.toString(b));
	}
	
	int[]c = new int[a.length+b.length];
    int count = 0;
    
    for(int i = 0; i < a.length; i++) { 
       c[i] = a[i];
       count++;
    } 
    for(int j1 = 0; j1 < b.length;j1++) { 
       c[count++] = b[j1];
    } 
    for(int i1 = 0;i1 < c.length;i1++)
    	System.out.print(c[i1]+" ");
 } 


	public static void main(String[] args) {
		Sortingarrays sa=new Sortingarrays();
		sa.arraysSort();

	}

}
