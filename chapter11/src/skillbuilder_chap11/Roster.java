package skillbuilder_chap11;

import java.io.*;
import java.util.Scanner;

public class Roster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File datafile;;
		String StuNamel ,stunamef, filename;
		int numstu;
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("enter file name for storing names and grades");
		
		filename = input.next();
		
		System.out.println("How many students ? ");
		
		numstu = input.nextInt();
		
		File dataFile = new File(filename);
		
		try 
		{ 
		
			FileOutputStream out = new FileOutputStream(dataFile);
			ObjectOutputStream writeStu = new ObjectOutputStream(out);
			
			
			for (int i = 0 ; i< numstu; i++)
			{
				
				System.out.println("Enter the first name of the student");
				
				stunamef = input.next();
				
				System.out.println("Enter the last name of the student");
				
				StuNamel = input.next();
				
				
				/* write objects */
				writeStu.writeObject(new Student(stunamef, StuNamel));
				
				
				
				
			}
			
			writeStu.close();
			out.close();
			System.out.println("Data writen to file. ");
			System.out.println(" ");
			
			
			FileInputStream in2 = new FileInputStream(filename);
			ObjectInputStream readStu = new ObjectInputStream(in2);
			
			for (int i = 0 ; i< numstu; i++)
			{
				
				System.out.println((Student)readStu.readObject());
			
			}
			readStu.close();
			
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

}
