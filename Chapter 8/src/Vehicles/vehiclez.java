package Vehicles;

public class vehiclez {

	private double cargosize;
	private double tirenum;
	private double fueleconcity;
	private double fueleconhwy;
	private double seatingcapacity;
	
	
	public vehiclez (double cs, double tn, double fec, double feh, double sc)
	{
		
		cargosize = cs;
		tirenum = tn;
		fueleconcity = fec;
		fueleconhwy = feh;
		seatingcapacity = sc;
		
	}
	
	
	//obtainers
	public Double getcargosize() 
	{
	 	return(cargosize);
	}
	
	public Double gettirenum() 
	{
	 	return(tirenum);
	}
	
	public Double getfueleconC() 
	{
	 	return(fueleconcity);
	}
	
	public Double getfueleconH() 
	{
	 	return(fueleconhwy);
	}
	
	public Double getseatingcapa() 
	{
	 	return(seatingcapacity);
	}
	
	//set thingies 
	
	public Double setcargosize(Double E) 
	{
	 	cargosize = E;
		return(cargosize);
	}
	
	public Double settirenum(Double j) 
	{
	 	tirenum = j;
		return(tirenum);
	}
	
	public Double setfueleconC(Double k) 
	{
	 	fueleconcity = k;
		return(fueleconcity);
	}
	
	public Double setfueleconH(Double l) 
	{
		fueleconhwy = l;
		return(fueleconhwy);
	}
	
	public Double setseatingcapa(Double a) 
	{
		seatingcapacity = a;
		return(seatingcapacity);
	}
	
	public String toString()
	{
		String vehiclezzstuff;
		
		vehiclezzstuff = "Cargosize is" + cargosize 
				+ " \n and tire number is " + tirenum
				+ " \n and the fuel economy for city is " + fueleconcity
				+ " \n and fuel economy for highways is " + fueleconhwy 
				+ " \n and seating capacity is " + seatingcapacity;
				
		
		return vehiclezzstuff;
	}
}


