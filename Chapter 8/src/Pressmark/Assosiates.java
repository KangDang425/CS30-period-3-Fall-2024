package Pressmark;

public class Assosiates extends Employee
{
	
	private double hourlyPay;
	
	public Assosiates(String fN, String lN, double r) {
		super(fN, lN);
		hourlyPay = r;  
	}

	

	
	public double pay(double hours)
	{
		double payEarned;
		
		if(hours>40 )
		{
			payEarned = ((hourlyPay*40) + (hourlyPay * 1.5)*hours-40 );
		}
		else
		{
			payEarned= hourlyPay * hours;
		}
		return payEarned;
	}

}
