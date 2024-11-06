package Vehicles;

public class minivan extends vehiclez{

	private boolean sunroof;
	private boolean backseatent;
	
	public minivan(double cs, double tn, double fec, double feh, double sc, boolean sr, boolean bse) {
		super(cs, tn, fec, feh, sc);
		sunroof = sr;
		backseatent = bse;
		
	}
	
	//obtainers

	public Boolean getsunroof() 
	{
	 	return(sunroof);
	}
	
	public Boolean getBSE() 
	{
	 	return(backseatent);
	}
	
	
	
	public Boolean setBSE(boolean bs) 
	{
	 	backseatent = bs;
		return(backseatent);
	}
	
	public Boolean setsunroof(boolean sfr) 
	{
	 	sunroof = sfr;
		return(sunroof);
	}
	
	
	public String toString()
	{
		String minivanns;
		
		minivanns = super.toString() 
				+ "\n if it has a sunroof " + sunroof
				+ "\n and if it has back seat entertainment " + backseatent;
		
		return minivanns;
	}
	
}
