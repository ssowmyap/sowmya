package exception;

public class Invalidpin extends Exception {
	Invalidpin(String message){
		super (message);
	}

	
}
class Card{
	int pin;
}
class Atm{
	public static boolean isValid(Card card) throws Invalidpin{
		if (card.pin==1000)
		return true;
		else throw new Invalidpin("pin is invalid");
	}

public static void main(String[]args[]) throws Invalidpin {
System.out.println("pin is valid");
Card card = null;
isValid(card);
}
}