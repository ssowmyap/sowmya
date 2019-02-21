package conditions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserilizationex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileInputStream file=new FileInputStream("D:\\\\programs\\\\file.txt");

ObjectInputStream object=new ObjectInputStream(file);
Student1 s=(Student1)object.readObject();
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
