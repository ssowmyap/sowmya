package basics;

import java.util.Scanner;

public class Calculator implements Operations {
	public interface Operations {
		public void add();
		public void subtract();
		public void multiple();
	}
public static void main(String arg[]) {
	Scanner sc =new Scanner(System.in);
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	System.out.println("sum=");
}
}
