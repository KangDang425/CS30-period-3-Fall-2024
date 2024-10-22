package masteries;



import java.io.Serializable;

import java.text.DecimalFormat;









public class Piggybanks implements Serializable {

    private double tmon;



    //Constructor

    public Piggybanks()

    {

        tmon = 0;

    }







    DecimalFormat format = new DecimalFormat("0.00");





    //Adding methods

    public void Addpenny()

    {
    	
        tmon += 0.01;
        System.out.println("A penny was added.\n");
    }





    public void Addnickle()

    {
        tmon += 0.05;
        System.out.println("A nickle was added.\n");
    }





    public void Adddime()

    {
        tmon += 0.1;
        System.out.println("A dime was added.\n");
    }





    public void Addquarter()

    {
        tmon += 0.25;
        System.out.println("A quarter was added.\n");
    }












    //Taking out methods

    public void outpen()

    {

        if(tmon >= 0.01)

        {
            tmon -= 0.01;
            System.out.println("A penny was removed.");

        }

        else

        {
            System.out.println("There is not enough money to remove a penny.");
        }

    }





    public void outnic()

    {

        if(tmon >= 0.05)

        {
            tmon -= 0.05;
            System.out.println("A nickle was removed.\n");
        }

        else

        {
            System.out.println("There is not enough money to remove a nickle.\n");
        }

    }





    public void outdim()

    {
        if(tmon >= 0.1)
        {
            tmon -= 0.1;
            System.out.println("A dime was removed.\n");
        }

        else

        {
            System.out.println("There is not enough money to remove a dime.\n");
        }

    }





    public void outquart()

    {
        if(tmon >= 0.25)
        {
            tmon -= 0.25;
            System.out.println("A quarter was removed.\n");
        }

        else

        {
            System.out.println("There is not enough money to remove a quarter.\n");
        }

    }







    //get money

    public double chemon()

    {

        return tmon;

    }





    //Return as string

    public String toString()

    {

        String piggy = "The total balance of this piggy bank is: $" + format.format(tmon) ;


        return (piggy);

    }





	
		// TODO Auto-generated method stub
		
	

}

