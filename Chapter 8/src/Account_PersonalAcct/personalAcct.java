package Account_PersonalAcct;

public class personalAcct extends Account{

	public personalAcct(double bal, String fName, String lName, String str, String cityy, String prov, String post) {
		super(bal, fName, lName, str, cityy, prov, post);
		
		if (100 > bal)
		{
			withdrawal(2);
			System.out.println("As you didn't have 100 dollars in your personal balance, 2 dollars has been withdrawn");
		}
		
		// TODO Auto-generated constructor stub
	}

	
	public String toString() {
		
			return "The personal account ID is " + super.toString();
	}
	
	
	
	
}
