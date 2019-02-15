package conditions;

public class Batch {

	public static void main(String[] args) {
	Student1 s1=new Student1();
    s1.setName("ram");
    s1.setRoll(123);
    s1.setFees(2000);
    s1.setCollegename("vjit");
    
	Student1 s2=new Student1();
	s2.setName("r");
    s2.setRoll(13);
    s2.setFees(200);
    s2.setCollegename("vjit");
    System.out.println(s1.getName());
    System.out.println(s1.getRoll());
	System.out.println(s1.getFees());
	System.out.println(s1.getCollegename());
	System.out.println(s2.getCollegename());
	
	}

}
