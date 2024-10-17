package masteries;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.*;
import java.util.Scanner;

public class FindandReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String filename, wordout, wordin, flist;
		String fulist = "";
		File datafile;
		FileWriter out;
		BufferedWriter writeFile;
		FileReader in;
		BufferedReader readFile;
		boolean fline = true;
		
		
		
		
		//ask user for all his stuff
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter file name that you want to modify");
		
		filename = input.next();
		
		System.out.println("Enter what word you wish to remove");
		
		wordout = input.next();
		
		System.out.println("Enter the replacement word");
		
		wordin = input.next();
		
		
		//read file and check for word
		try 
		{ 
			datafile = new File(filename);
			in = new FileReader(datafile);
			readFile = new BufferedReader(in);
			
			while((flist = readFile.readLine()) != null)
			{
				if (fline)
				{
					fulist += flist;
					fline = false;
				}
				else 
				{
					fulist += flist;
				}
				
				
				
			}
			in.close();
			readFile.close();
			
			
			fulist = fulist.replaceAll(wordout, wordin);
			
		}
		
		
		
		
		
		catch (FileNotFoundException e) 
        {
			System.out.println("File does not exist or could not be found.");
			System.err.println("FileNotFoundException: " + e.getMessage());

        } 
		catch (IOException e) 
		{
			
		}
		
		
		//show 2 user that its in
		System.out.println("data recorded to file");
		System.out.println(fulist);
		
		
		//print out the results to the text file
		try
		{
			datafile = new File(filename);
			out = new FileWriter(datafile);
			writeFile = new BufferedWriter(out);
			
			writeFile.write(fulist);
			
			writeFile.close();
			out.close();
		}
		
		catch (FileNotFoundException e) 
        {
			System.out.println("File does not exist or could not be found.");
			System.err.println("FileNotFoundException: " + e.getMessage());

        } 
		catch (IOException e) 
		{
			
		}
		
		
		
		
		//screen dumps 1
		
		
		//Enter file name that you want to modify
		//C:\Users\27355005\git\CS30-period-3-Fall-2024\chapter11\src\masteries\fineReplace
		//Enter what word you wish to remove
		//a
		//Enter the replacement word
		//b
		//data recorded to file
		//bbbbbbbbbbbbbbbbbbbbbbbbbbbbdljfkldbjlkfjblkdjbbbbbbbbbbbbbbb

		
		//screen dumps 2
		
		//Enter file name that you want to modify
		//C:\Users\27355005\git\CS30-period-3-Fall-2024\chapter11\src\masteries\fineReplace
		//Enter what word you wish to remove
		//b
		//Enter the replacement word
		//:D
		//data recorded to file
		//:D:D:D:D:D:D:D:D:D:D:D:D:D:D:D:D:D:D:D:D:D:D:D:D:D:D:D:Ddljfkld:Djlkfj:Dlkdj:D:D:D:D:D:D:D:D:D:D:D:D:D:D:D

		
		
		
		
		
		
		
		
	}

}
