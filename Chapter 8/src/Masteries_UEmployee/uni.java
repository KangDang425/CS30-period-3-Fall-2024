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
			System.out.println("\n (E)mployee or (pay) or (Q)uit");
			System.out.println("Enter your choice plz");
			action = input.next();
			
			if (action.equalsIgnoreCase("Q"))
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
				System.out.println("Enter the hours for associate or pay for manager");
				payArg = input.nextDouble();
				
				
				
			}
			
			
		} while(action.equalsIgnoreCase("Q"));
		
		

	}

	}


