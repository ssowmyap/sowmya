package basic;

public class Book {
int id;
String title;
double price;

public void setDetails() {
	id=143243;
	title="sgdh";
	price=3654;
}
public void setDetails2() {
	id=24;
	title="dfg";
	price=2334;
}
public void print() {
	System.out.println("idno:" +id);
	System.out.println("name "+title); 
	System.out.println("cost" +price);
}
public static void main(String[]arg) {
	Book b1=new Book();
	Book b2=new Book();
    System.out.println("details");
	b1.setDetails();
    b1.print();
    System.out.println("details2");
    b2.setDetails2();
    b2.print();
    System.out.println(b2.title); 
   
	
}

}
