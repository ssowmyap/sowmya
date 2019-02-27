package practice;

import java.util.Scanner;
class FirstArray {
	Scanner sc;
	int a[][];
    int b[][];
    int c[][];
	int m,n,i,j;
	public void first() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The rows and columns");
		 m=sc.nextInt();
		 n=sc.nextInt();
		System.out.println("Enter the array elements");
		 a=new int[m][n];
		 b=new int [m][n];
		 c=new int[m][n];
		  for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j]=sc.nextInt();
			}
		  }
	}
	void displaya() {
				System.out.println("The array1 is");
				for(int i=0;i<m;i++)
				{
				for(int j=0;j<n;j++)
				{
				System.out.print("\t" + a[i][j]);
				}
				System.out.println();
				}
				}

	public void second() {
		Scanner sc=new Scanner(System.in);
		 for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					b[i][j]=sc.nextInt();
				}
		 }
	}
	void displayb() {
					System.out.println("The array2 is");
					for(int i=0;i<m;i++)
					{
					for(int j=0;j<n;j++)
					{
					System.out.print("\t" + b[i][j]);
					}
					System.out.println();
					}	
	}
}
	class SecondArray extends FirstArray{
void add() {
	for (int i = 0; i < m; i++) {
		for (int j = 0; j <n; j++) {
			c[i][j]=a[i][j]+b[i][j];
		}
	}
}
	void displayc() {
			System.out.println("addition of aaray");
			for(int i1=0;i1<m;i1++)
			{
			for(int j1=0;j1<n;j1++)
			{
			System.out.print("\t" + c[i1][j1]);
			}
			System.out.println();
			}
			
		}
		
}
public class ArrayexInheritance {
	public static void main(String[] args) {
		SecondArray ai=new SecondArray();
		ai.first();
		ai.displaya();
		ai.second();
		ai.displayb();
		ai.add();
        ai.displayc();
	}

}
