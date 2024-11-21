package Masteries_UEmployee;

public class UEmployee {
	
	private String empname;
	private double sal;
	private String firstName,lastName;
	
	public UEmployee(String fN, String lN, double sall)
	{
		firstName = fN;
		lastName = lN;
		
		empname= fN +  " "+lN;
		
		sall = sal;
	}
	
	
	
	//obtainer
	
	public String getempname() 
	{
	 	return(empname);
	}
	
	public Double getsal() 
	{
	 	return(sal);
	}
	
	
	
	//modifiers
	public String setempname(String E) 
	{
	 	empname = E;
		return(empname);
	}
	
	public Double setsal(Double S) 
	{
	 	sal = S;
		return(sal);
	}
	
	public String toString()
	{
		String empstuff;
		
		empstuff = "The employee's name is " + empname + "and the salary is " + sal + " ";
		
		return empstuff;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
