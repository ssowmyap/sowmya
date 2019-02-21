package basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Filereadex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   try {
	FileInputStream fileread=new FileInputStream("D:\\programs\\demo");
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
   
	}

}
