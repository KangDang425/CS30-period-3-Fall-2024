package Puck_Skillbuilders;

public class puck extends Disk implements Comparable
{
	public double min_weigth = 5;
	public double Max_weigth = 5.5;
	public double min_yweigth = 4;
	public double max_yweight = 4.5;
	
	private double weight;
	private boolean standard, youth;
	
	//constructors

	public puck(double w)
	{
		super(1.5, 1);
		weight = w;
		
		if(weight >= min_weigth && weight <= Max_weigth)
		{
			standard = true;
			youth = false;
		}
		else
		{
			standard = false;
			youth = true;
		}
	}
	
	
	//obtaining method 
	public double getWeight() 
	{
	 	return(weight);
	}
	
	public String getleague()
	{
		String league;
		
		if(standard)
		{
			league = "Puck is standard weight";
		}
		else
		{
			league = "Puck is youth weight";
		}
		return league;
	}
	
	public String toString()
	{
		String puckstuff;
		
		puckstuff = "The puck has a weight of " + getWeight() + "and the league is" + getleague();
		
		return puckstuff;
	}
	
	
	
	public void setweight(double wei)
	{
		weight = wei;
		
	}
	
	public  boolean equals(Object obj)
	{
		puck testObj = (puck)obj;
		
		if(testObj.getleague() == getleague())
		{
			return(true);
		}
		else
		{
			return(false);
		}
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

	
}