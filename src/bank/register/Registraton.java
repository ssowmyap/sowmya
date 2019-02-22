package com.bank.register;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import com.bank.model.User;

public class Registraton {
	static int count=1;
	 public static User setinfo() {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the user details"+count);
	 User s=new User();
	 s.setFirstname(sc.next());
	 s.setLastname(sc.next());
	 s.setAadharcardno(sc.nextLong());
	 s.setAccountno(sc.nextLong());
	 s.setPancardno(sc.next());
	 s.setPhoneno(sc.nextInt());
	 s.setAddress(sc.next());
	 count++;
		return s;
	 }
	public static void main(String[] args) {
		ArrayList<User> a1=new ArrayList();
		a1.add(setinfo());
		a1.add(setinfo());
		try {
		FileOutputStream file=new FileOutputStream("D:\\programs\\user.txt");
		ObjectOutputStream obj=new ObjectOutputStream(file);
		obj.writeObject(a1);

		} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		} 

	}

}
