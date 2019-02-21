import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   String str=sc.next();
   if(str.contains("A")||str.contains("E")||str.contains("I")||str.contains("O")||str.contains("U")||str.contains("Y")) {
   System.out.println("invalid");
   }
   else {
	   int sum=Integer.valueOf(str.charAt(0))+Integer.valueOf(str.charAt(1));
	   if(sum%2==0)
	   {
		   sum=Integer.valueOf(str.charAt(4))+Integer.valueOf(str.charAt(5));
		 
	   }
   if(sum%2==0) {
	   sum=Integer.valueOf(str.charAt(5))+Integer.valueOf(str.charAt(6));
   }
	  if(sum%2==0) {
		   sum=Integer.valueOf(str.charAt(7))+Integer.valueOf(str.charAt(8));
	   
	System.out.println("valid");
	}

   else
	System.out.println("invalid");
}
}
}