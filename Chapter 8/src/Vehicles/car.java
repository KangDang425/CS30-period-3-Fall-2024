package Vehicles;

public class car extends vehiclez{

	private boolean trunksenser;
	
	public car(double cs, double tn, double fec, double feh, double sc, boolean ts) {
		super(cs, tn, fec, feh, sc);
		
		trunksenser = ts;
	}
	
	public Boolean gettrunksenser() 
	{
	 	return(trunksenser);
	}
	
	public Boolean settrunksenser(boolean ahhhhh) 
	{
	 	trunksenser = ahhhhh;
		return(trunksenser);
	}
	
	public String toString()
	{
		String minivanns;
		
		minivanns = super.toString() 
				+ "\n if it has a trunksenser " + trunksenser;
		
		return minivanns;
	}
	

}
