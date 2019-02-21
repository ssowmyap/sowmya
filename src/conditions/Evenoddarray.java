package conditions;

import java.util.Arrays;
import java.util.Scanner;

public class Evenoddarray {
	
		public void arraysSort() {
			
			Scanner sc=new Scanner(System.in);
			
			int a[]=new int[5];
			
			int b[]=new int[5];
			for (int i = 0; i < a.length; i++) {			
				int j=sc.nextInt();
				
				a[i]=j;
				//System.out.println(a[i]);
			}
				for (int j1 = 0; j1 < b.length; j1++) {
					int j2=sc.nextInt();
					b[j1]=j2;
					//System.out.println(b[j1]);
				}
				
    for (int i = 0; i < b.length; i++) {
		
	
		if(a[i]%2==0) {
					System.out.println("even num are");
					
				}
				//System.out.println(Arrays.toString(a));
    }
		for (int j1 = 0; j1 < b.length; j1++) {
			

			if((b[j1]%2)!=0) {
				System.out.println("odd num are");
			
				   
				
		}
		//System.out.println(Arrays.toString(b));
		}
		int[]c = new int[a.length+b.length];
	    int count = 0;
	    
	    for(int i = 0; i < a.length; i++) { 
	       c[i] = a[i];
	       count++;
	    } 
	    for(int j = 0; j < b.length;j++) { 
	       c[count++] = b[j];
	    } 
	    for(int i1 = 0;i1 < c.length;i1++)
	    	System.out.print(c[i1]+" ");
	    Arrays.sort(a);
	    Arrays.sort(b);
		} 
		
		
	public static void main(String[] args) {
   Evenoddarray eo=new Evenoddarray();
eo.arraysSort();
	}
}