package com.bank.register;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.bank.model.User;

public class PrintUser2 {

	public static void main(String[] args) {
		try {
			FileInputStream file=new FileInputStream("D:\\programs\\user.txt");

		ObjectInputStream object=new ObjectInputStream(file);
		User s=(User)object.readObject();
		ArrayList<User> 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

			}

		
	}


