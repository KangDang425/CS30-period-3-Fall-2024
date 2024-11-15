package Account_PersonalAcct;

import java.util.Scanner;

/**
 * Customer class.
 */

public class Customer {
	private String firstName, lastName, street, city, province, postal_code;

	//create String variables street, city, province, postal code	

	
	/**
	 * constructor
	 * pre: none
	 * post: A Customer object has been created. 
	 * Customer data has been initialized with parameters.
	 */
	public Customer(String fName, String lName, String str, String cityy, String prov, String post) //modify constructor to include street, city, province, postal code
	{
		firstName = fName;
		lastName = lName;
		street = str;
		city = cityy;
		province = prov;
		postal_code = post;

		//reflect the changes in the parameter
	}
	

	//create changeCity method that asks the user their city and records city in a variable above

	public void changecity() 
	{
		 Scanner input = new Scanner(System.in);
		 System.out.println(" what is your city?");
		 city =input.nextLine();
	}
	
	
	//create changeStreet method that asks the user their street and records street in a variable above
	public void changestreet() 
	{
		 Scanner input = new Scanner(System.in);
		 System.out.println(" what is your street?");
		 street =input.nextLine();
	}
	//create changeProvince method that asks the user their province and records province in a variable above
	public void changeprov() 
	{
		 Scanner input = new Scanner(System.in);
		 System.out.println(" what is your province?");
		 province =input.nextLine();
	}
	//create changePostalCode method that asks the user their postal code and records postal code in a variable above
	public void changepost() 
	{
		 Scanner input = new Scanner(System.in);
		 System.out.println(" what is your postal code ?");
		 postal_code =input.nextLine();
	}


	/** 
	 * Returns a String that represents the Customer object.
	 * pre: none
	 * post: A string representing the Customer object has 
	 * been returned.
	 */
	public String toString() {
		String custString;

		//update this string so that it contains the street, city, province, and postal code
		custString = firstName + " " + lastName + "\n";
	 	return(custString);
	}

}

