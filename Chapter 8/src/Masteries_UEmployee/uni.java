package Masteries_UEmployee;

import java.util.Scanner;

public class uni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Faculty emp1 = new Faculty("Logan", "lahhhh", 10000, "teachman");
		Staff emp2 = new Staff("grayyson", "nocluelast", 15000, "hihihih");
		
		
		Scanner input = new Scanner(System.in);
		
		
		String action;
		int empnum;
		double payArg;
		
		UEmployee emp=emp1;
		
		
		do
		{
			System.out.println("\n (E)mployee or (C)hoose or (Q)uit");
			System.out.println("Enter your choice plz");
			action = input.next();
			
			if (action.equalsIgnoreCase("C"))
			{
				System.out.println("enter Employee num, 1 or 2");
				empnum = input.nextInt();
				
				switch(empnum)
				{
				case 1: emp = emp1; break;
				case 2: emp = emp2; break;
				
				
				}
				
				
				
			}
			
			if (action.equalsIgnoreCase("E"))
			{
				System.out.println(emp);
				
				
				
			}
			
			if (action.equalsIgnoreCase("E"))
			{
				
				
				
				
				
			}
			
			
		} while(action.equalsIgnoreCase("Q"));
		
		

	}

	}

/*
 * Screen dump 1 
 * 
(E)mployee or (what is their pay) or (Q)uit
Enter your choice plz

e
The employee's name is Logan lahhhh and the salary is 0.0 the department is teachman

 * 
 * 
 * 
 * Screen dump2 
 * 
 *  (E)mployee or (C)hoose or (Q)uit
Enter your choice plz
e
The employee's name is grayyson nocluelast and the salary is 0.0 the job title is hihihih
 * 
 * 
 */








