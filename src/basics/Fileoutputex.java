package basics;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Fileoutputex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
   try {
	FileOutputStream fileoutputsteam=new FileOutputStream("D:\\programs\\demo");
	System.out.println("enter name");
	String n=sc.next();
  byte[] b= n.getBytes();
	fileoutputsteam.write(b);
	fileoutputsteam.close();
	System.out.println("completed");
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   
	}

}
