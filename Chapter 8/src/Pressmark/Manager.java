package Pressmark;

public class Manager extends Employee 
{
	
	private double yearlySalary;
	
	
	
	//constructor
	public Manager(String fN, String lN, double s)
	{
		super (fN, lN);
		yearlySalary = s;
	}
	
	public double getYearlySalary()
	{
		return yearlySalary;
	}
	
	//return the manager pay for a specificed period
	
	public double pay(double weeks)
	{
		double payEarned;
		payEarned = yearlySalary/52 * weeks;
		
		return payEarned;
	}
	
	//return the employee name,title,and salary
	
	public String toString()
	{
		return(super.toString()
				+ ", Manager Salary" 
				+ yearlySalary); 
	}
	

}
