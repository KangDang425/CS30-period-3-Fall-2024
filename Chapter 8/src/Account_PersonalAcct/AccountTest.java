package Account_PersonalAcct;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		personalAcct pAct = new personalAcct(101, "logan", "sigh", "do", "moscow", "california", "43 ");
		BusinessAcct bAct = new BusinessAcct(700, "grayson", "why", "headers", " Bangkok" , "japan  ", "0.1134 ");
		Account act = new Account(75, "bob", "joe", "this", "bankon", "hell", "sighh");
		
		System.out.println(pAct);
		System.out.println(" ");
		System.out.println(bAct);
		
		System.out.println(act);
		
		System.out.println(act.getBalance());
		System.out.println(act.getID());
		act.deposit(5);
		System.out.println(act.getBalance());
		
		
		
		
		
	}

}

/*
Screen dump 1

The personal account ID is lsigh
logan sigh ,your street is do ,your city is moscow ,your province is california ,and your postal code is 43 Current balance is $101.00
 
The business account ID is gwhy
grayson why ,your street is headers ,your city is  Bangkok ,your province is japan   ,and your postal code is 0.1134 Current balance is $700.00


Screen dump 2

As you didn't have 100 dollars in your personal balance, 2 dollars has been withdrawn
As you didn't have 500 dollars in your Business balance, 10 dollars has been withdrawn
The personal account ID is lguess
logan guess ,your street is str3 ,your city is Edmonton ,your province is northwest provinces ,and your postal code is 43 Current balance is $97.00
 
The business account ID is gbob
grayson bob ,your street is str7 ,your city is  Bangkok ,your province is moscow   ,and your postal code is 0.1134 Current balance is $390.00


*/