package Pressmark;

import java.text.NumberFormat;
import java.util.Scanner;

public class Store {
	
	public static void payEmployee(Employee emp, double payArg)
	{
		NumberFormat money = NumberFormat.getCurrencyInstance();
		double pay;
		
		System.out.println(emp);
		pay = emp.pay(payArg);
		
		System.out.println(money.format(pay));
		
	}
	
	

	public static void main(String[] args) {
		
		Manager emp1 = new Manager("Logan", "lahhhh", 10000);
		Assosiates emp2 = new Assosiates("grayyson", "nocluelast", 15000);
		
		
		Scanner input = new Scanner(System.in);
		
		
		String action;
		int empnum;
		double payArg;
		
		Employee emp=emp1;
		
		
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
				payEmployee(emp, payArg);
				
				
			}
			
			
		} while(action.equalsIgnoreCase("Q"));
		
		

	}

}
