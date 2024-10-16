package masteries;


/*
Program: Wordcount.java          Last Date of this Revision: September 30, 2019

Purpose: An application that reads a file, and outputs how many words are within it 

Author: Kang Dang, 
School: CHHS
Course: Computer Programming 30-1

*/



import java.io.*;
import java.text.DecimalFormat;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File datafile;
		FileReader in;
		BufferedReader readFile;
		String filename;
		String let, avg;
		boolean iflet = false;
		int ehh = 0;
		
		int numW;
		
	
		
		int numL = 0;

		
		
		//limits outputs to 2 decimal places 
		DecimalFormat format =  new DecimalFormat("0.00");
		
		try 
		{
			
			
			datafile = new File("C:\\Users\\27355005\\git\\CS30-period-3-Fall-2024\\chapter11\\src\\masteries\\source.txt");
			in = new FileReader(datafile);
			readFile = new BufferedReader(in);
			
			while(readFile.ready())
			{
				
				
				
				numW = readFile.read();
				
				
				//check for letters + words
				if(numW >= 65 && numW<=90 || numW >= 97 && numW<= 132) 
				{
					iflet = true;
					numL++;
				}
				
				else 
				{
					if (iflet) 
					{
						ehh++;
					}
					iflet = false;
				}
				
			}
			
			readFile.close();
			in.close();
			
			
			if (iflet)
			{
				ehh++;
			}
			
			//output area
			
			avg= format.format((double)numL/ehh);
			System.out.println("Number of words " + ehh + ".");
			System.out.println("Average word length " + avg + ".");
				
			
		}
		
		
		
		
		
		catch (FileNotFoundException e) 
        {
			System.out.println("File does not exist or could not be found.");
			System.err.println("FileNotFoundException: " + e.getMessage());

        } 
		catch (IOException e) 
		{
			
		}
	}

	private static String file(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}

//Screen dumps 1
//Number of words 13.
//Average word length 3.38.


//Screen dumps 2

//Number of words 18.
//Average word length 4.39.















