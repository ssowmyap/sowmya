package exception;

public class Exception1 {

	public static void main(String[] args) {
		int a = 0;
		int arr[] = null;
		try {
			
			System.out.println(a/0);
			
			System.out.println(arr[8]);
		} 
		catch(ArithmeticException e) {
			System.out.println(e);
		}
System.out.println("end");
	}

}
