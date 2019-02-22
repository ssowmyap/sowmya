package com.bank.register;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.bank.model.User;

public class Userserilization {

	public static void main(String[] args) {
		User s= new User();
		s.setFirstname("abc");
		s.setLastname("qwerr");
		s.setAadharcardno(12);
   try {
	FileOutputStream file =new   FileOutputStream("D:\\programs\\.txt");
	ObjectOutputStream object=new ObjectOutputStream(file);
	object.writeObject(s);
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


	}

}
