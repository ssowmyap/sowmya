package conditions;

import java.util.Scanner;

public class Objectpassing {
Scanner sc=new Scanner(System.in);
Student1 s=new Student1();
	public static void main(String[] args) {
		Objectpassing ob=new Objectpassing();
		ob.accept();
		ob.display(ob.accept());
        
	}
	
	private void display() {
		System.out.println(s.getName());
		System.out.println(s.getRoll());
	}
	public Student1 accept() {
		System.out.println("enter name:");
		s.setName(sc.next());
		System.out.println("roll:");
		s.setRoll(sc.nextInt());
		return s;
		
	}
}
