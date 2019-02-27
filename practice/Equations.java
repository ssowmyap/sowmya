package practice;

import java.util.Scanner;

public class Equations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int q=in.nextInt();
		for (int i = 0; i < q; i++) {

        int a=in.nextInt();
        int b=in.nextInt();
        int n=in.nextInt();
        int result=0;
        result = a+result;
        for (int j = 0 ;j<n;j++){
        result =result + (int)Math.pow(2, j)*b;
        System.out.print(result + " "); 
        }
       
    System.out.println();
    }
	}
}
