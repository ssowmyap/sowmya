import java.util.Scanner;

public class Patlumotu {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
  int brickno=sc.nextInt();
   for (int i = 0; i <brickno; i++) {
	//for (int j = 0; j < args.length; j++) {
	   int n=0;
	   n=n+i+2*i;
		if (n>=brickno) {
   
	   if(n-i*2>=brickno) 
		   System.out.println("patlu");
		  
		}
   
	      else 
	     System.out.println("motu");
	   
   }
}
}
