package Vehicles;

public class truck extends vehiclez{

	private double backbed;
	
	public truck(double cs, double tn, double fec, double feh, double sc, double bb) {
		super(cs, tn, fec, feh, sc);
		backbed = bb;
		
	}
	
	public Double getBBS() 
	{
	 	return(backbed);
	}

	public Double setBBS(double bsb)
	{
		backbed=bsb;
		return(backbed);
		
	}
	
	
	public String toString()
	{
		return(super.toString() 
				+ "\n the size of the bed is " + backbed); 
	}
	
}
