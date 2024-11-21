package Account_PersonalAcct;

public class BusinessAcct extends Account{
	
	public BusinessAcct(double bal, String fName, String lName, String str, String cityy, String prov, String post) {
		super(bal, fName, lName, str, cityy, prov, post);
		
		if (bal >= 500)
		{
			
		}
		else if (500 >= bal)
		{
			withdrawal(10);
			System.out.println("As you didn't have 500 dollars in your Business balance, 10 dollars has been withdrawn");
		}
		
		
		// TODO Auto-generated constructor stub
	}
	
	
	public String toString() {
		
		return "The business account ID is " + super.toString();
}

	

}
