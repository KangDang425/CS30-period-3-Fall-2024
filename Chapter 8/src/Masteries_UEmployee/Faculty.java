package Masteries_UEmployee;

public class Faculty extends UEmployee{

	private String dd;
	
	public Faculty(String fN, String lN, double sall, String d) {
		super(fN, lN, sall);
		dd=d;
	}
	
	public String getdep() 
	{
	 	return(dd);
	}
	
	public String toString()
	{
		return(super.toString() + "the department is " + dd); 
	}
	
	public void setdep(String ddd)
	{
		dd = ddd;
	}
	

}
