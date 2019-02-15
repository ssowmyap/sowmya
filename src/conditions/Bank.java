package conditions;

public class Bank {
	int accno;
	int balance;

Bank(){
	System.out.println("called");
	new Bank(300,356);
}
public Bank(int accno,int balance) {
	this.accno=accno;
	this.balance=balance;
	System.out.println(accno+""+balance);
   
}
	public static void main(String[] args) {
 Bank b1=new Bank(25, 200);
 Bank b2=new Bank();
 Bank b3=new Bank(); 
	}

}

