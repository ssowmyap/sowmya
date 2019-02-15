package inheritance1;
//variable
public class Child1 extends Multiple {
	String name="raju";
	//constructor
	public Child1() {
    System.out.println(name);
    //method
    System.out.println(super.name);
    super.f();
	}

	public static void main(String[] args) {
		Child1 c1=new Child1();
		System.out.println(c1.name);
	}

}
