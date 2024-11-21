package Masteries_UEmployee;



public class Staff extends UEmployee{

	private String Title;
	
	
	public Staff(String fN, String lN , double sall, String title) {
		super(fN, lN, sall);
		Title = title;
	}
	
	public String gettitlename() 
	{
	 	return(Title);
	}
	
	public String toString()
	{
		return(super.toString() + "the job title is " + Title); 
	}
	
	public void settitlename(String d)
	{
		Title = d;
	}
	
	
	
}
