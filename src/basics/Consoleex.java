package basics;
import java.io.Console;
public class Consoleex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String s=System.console().readLine();
   System.out.println(s);
   char[] p=System.console().readPassword();
   System.out.println(p);
	}

}
