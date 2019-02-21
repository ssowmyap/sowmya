package stringmodule;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class EnandDe {
	private static StringBuilder encrypted(String message,int key) {
		byte[] letters=message.getBytes();
		StringBuilder encrypted=new StringBuilder();
		try {
			FileOutputStream fileoutputsteam=new FileOutputStream("D:\\programs\\message.exe");
			fileoutputsteam.write(letters);
			fileoutputsteam.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int i = 0; i < letters.length; i++) {
			encrypted.append((char)(byte)(letters[i]+key));
		}
		System.out.println(encrypted);
        return encrypted;
	}
	
	
	private static void decryption (StringBuilder encrypted ,int key) {
		
	String msg=encrypted.toString();
	byte[] letters=msg.getBytes();
	StringBuilder decryption=new StringBuilder();
	try {
		FileInputStream fileread=new FileInputStream("D:\\programs\\key.exe");
		int i;
		while((i=fileread.read())!=-1)
		{
		System.out.print((char)i);
		}
		fileread.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	for (int i = 0; i < letters.length; i++) {
		decryption.append((char)(byte)(letters[i]-key));
	}
	System.out.println(decryption);
	}

	public static void main(String[] args) {
		//decryption(encrypted("HELLO-WORLD",3),3);
       
	}

}
