package masteries;

public class Customer {
	private String firstName, lastName;
	
	public Customer(String fname, String lname) { 
		firstName = fname;
		lastName = lname;
		
	}
	
	public String toString() {
		String cusString;
		
		cusString = " : " + firstName + " " + lastName + "'s ";
		return(cusString);
		
	}
	
	

}
