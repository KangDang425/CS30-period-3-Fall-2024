package Puck_Skillbuilders;

public class circle 
{
	private double radius;
	private static double PI= 3.14;
	
	public circle() 
	{
		radius = 1;			//default radius
	}
	
	public circle(double r) 
	{
		radius = r;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public void setRadius(double newRadius) 
	{
	 	radius = newRadius;
	}
	
	
	public static void displayAreaFormula() 
	{
	 	System.out.println("The formula for the area of a circle is A=Pi*r^2");
	}
	
	
	public double area() 
	{
	 	double circleArea;
	 	
	 	circleArea = PI * radius * radius;
	 	return(circleArea);
	}
	
	public boolean equals(Object obj) 
	{
		circle testObj = (circle)obj;
		
	 	if (testObj.getRadius() == radius) {
			return(true);
		} else {
			return(false);
		}
	}
	
	public String toString() 
	{
		String circleString;

		circleString = "Circle has radius " + radius;
	 	return(circleString);
	}
	
}
