package masteries;

import java.text.NumberFormat;

public class Account {
	private double balance;
	private Customer cust;
	private String acctID;
	
	
	public Account(double bal, String fname, String lname) {
		balance = bal;
		cust = new Customer(fname, lname);
		acctID = fname.substring(0,1) + lname;
		
		
	}
	
	public Account (String ID) {
		balance = 0;
		cust = new Customer("", "");
		acctID = ID;
		
	}
	
	public String getID() {
		return(acctID);
	}
	
	public double getBalance() { 
		return(balance);
	}
	
	public void deposit(double amt) { 
		balance += amt;
	}
	
	public String withdrawal(double amt) { 
		if (amt <= balance) {
			balance -= amt;
			return ("withdraw completed");
		} else {
			return ("Not enough money in account.");
		}
	}
	
	public boolean equals(Object acct) {
		Account testAcct = (Account)acct;
		if (acctID.equals(testAcct.acctID)) {
			return(true);
		} else {
			return(false);
		}
	}
	public String toString() {
		String accountString;
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		accountString = acctID + "\n";
		accountString += cust.toString();
		accountString += "Current balance is" + money.format(balance);
		return (accountString);
		
	}

}
