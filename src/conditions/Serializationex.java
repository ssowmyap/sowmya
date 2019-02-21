package conditions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializationex {

	public static void main(String[] args) {
		Student1 student= new Student1();
		student.setName("abc");
		student.setFees(123);
		student.setRoll(12);
   try {
	FileOutputStream file =new   FileOutputStream("D:\\programs\\file.txt");
	ObjectOutputStream object=new ObjectOutputStream(file);
	object.writeObject(student);
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}
