package masteries;




/*

Program: My Savings.java          Last Date of this Revision: October, 21, 2024

Purpose: An application that uses nested for loops to output a table that diplays number in 
 multiples of ten.

Author: Kang Dang, 
School: CHHS
Course: Computer Programming 30
 

*/



import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class Mysavings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int choice, choice1;
		int test;
		String filez;
		File datafile = null; 
		Boolean quit = false;
		
		
		
		
		
		
		Piggybanks bank = new Piggybanks();
		
		Scanner input = new Scanner(System.in);
		
		
		
		//ask user 4 their input
		
		System.out.println("Do you want to load the next file, Y for yes N for no. ");
		filez = input.next();
		
		
		if(filez == "y")
		{
			
			try 
			{
				datafile = new File("C:\\Users\\27355005\\git\\CS30-period-3-Fall-2024\\chapter11\\src\\masteries\\mysaving");
				FileInputStream in2 = new FileInputStream(datafile);
				ObjectInputStream refil = new ObjectInputStream(in2);
				
				
				
				bank = (Piggybanks) refil.readObject();
				
				System.out.println(bank);
				System.out.println("Bank has been loaded ");
				
				
				
				
				refil.close();
				in2.close();
				
			}
			
			
			catch (FileNotFoundException e) 
			{
				System.out.println("File does not exist or could not be found.");
				System.err.println("FileNotFoundException: " + e.getMessage());
			}
			
			catch (IOException e) 
			{
				System.out.println("File does not exist or could not be found.");
				System.err.println("FileNotFoundException: " + e.getMessage());
			}
			
			catch (ClassNotFoundException e) 
			{
				System.out.println("File does not exist or could not be found.");
				System.err.println("FileNotFoundException: " + e.getMessage());
			}
			
			
			
			
			
		}
		
		//user input system
		while (quit == false) 
		{
			System.out.println("1. Show total in bank.");
			System.out.println("2. Add a penny.");
			System.out.println("3. Add a nickle.");
			System.out.println("4. Add a dime.");
			System.out.println("5. Add a quarter.");
			System.out.println("6. Take money out of bank.");
			System.out.println("Enter 0 to quit.");
			
			System.out.println("Enter your choice: ");
			choice = input.nextInt();
			
			
			
			if (choice ==1)
			{
				System.out.println(bank);
			}
			else if (choice ==2)
			{
				bank.Addpenny();
			}
			else if (choice ==3)
			{
				bank.Addnickle();
			}
			else if (choice ==4)
			{
				bank.Adddime();
			}
			else if (choice ==5)
			{
				bank.Addquarter();
			}
			else if (choice ==6)
			{
				System.out.println("1. remove a penny.");
				System.out.println("2. remove a nickle.");
				System.out.println("3. remove a dime.");
				System.out.println("4. remove a quarter.");
				
				System.out.println("Choose which one u want.");
				choice1 = input.nextInt();
				
				if (choice1 == 1)
				{
					bank.outpen();
				}
				else if (choice1 == 2)
				{
					bank.outnic();
				}
				else if (choice1 == 3)
				{
					bank.outdim();
				}
				else if (choice1 == 4)
				{
					bank.outquart();
				}
				
				
			}
			else if (choice ==0)
			{
				quit =true;
				System.out.println("Quit :D");
				
				try 
				{
					datafile = new File("C:\\Users\\27355005\\git\\CS30-period-3-Fall-2024\\chapter11\\src\\masteries\\mysaving");
					FileOutputStream out = new FileOutputStream(datafile);
					ObjectOutputStream outt = new ObjectOutputStream(out);
					
					outt.writeObject(bank);
					
					
					
					outt.close();
					out.close();
				}
				catch (FileNotFoundException e) 
				{
					System.out.println("File does not exist or could not be found.");
					System.err.println("FileNotFoundException: " + e.getMessage());
				}
				
				catch (IOException e) 
				{
					System.out.println("File does not exist or could not be found.");
					System.err.println("FileNotFoundException: " + e.getMessage());
				}
				
			}
		}
		
		
		
	}

}




/*
Do you want to load the next file, Y for yes N for no. 
n
1. Show total in bank.
2. Add a penny.
3. Add a nickle.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 
2
A penny was added.

1. Show total in bank.
2. Add a penny.
3. Add a nickle.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 
2
A penny was added.

1. Show total in bank.
2. Add a penny.
3. Add a nickle.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 
2
A penny was added.

1. Show total in bank.
2. Add a penny.
3. Add a nickle.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 
22
1. Show total in bank.
2. Add a penny.
3. Add a nickle.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 
2
A penny was added.

1. Show total in bank.
2. Add a penny.
3. Add a nickle.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 
1
The total balance of this piggy bank is: $0.04

1. Show total in bank.
2. Add a penny.
3. Add a nickle.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 
0
Quit :D


Screen dump2 
Do you want to load the next file, Y for yes N for no. 
n
1. Show total in bank.
2. Add a penny.
3. Add a nickle.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 
1
The total balance of this piggy bank is: $0.00

1. Show total in bank.
2. Add a penny.
3. Add a nickle.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 
5
A quarter was added.

1. Show total in bank.
2. Add a penny.
3. Add a nickle.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 
5
A quarter was added.

1. Show total in bank.
2. Add a penny.
3. Add a nickle.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 
5
A quarter was added.

1. Show total in bank.
2. Add a penny.
3. Add a nickle.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 
5
A quarter was added.

1. Show total in bank.
2. Add a penny.
3. Add a nickle.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 
51
1. Show total in bank.
2. Add a penny.
3. Add a nickle.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 
1
The total balance of this piggy bank is: $1.00

1. Show total in bank.
2. Add a penny.
3. Add a nickle.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 
0
Quit :D

*/
