package exception;

public class Artimatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("start");
	try {
	System.out.println(12/0);
	}catch(Exception e) {
		System.out.println(e);
	}
	System.out.println("end");
	}

}
