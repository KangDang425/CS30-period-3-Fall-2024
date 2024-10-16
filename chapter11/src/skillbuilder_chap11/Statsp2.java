package skillbuilder_chap11;

import java.io.*;
import java.text.NumberFormat;
import java.util.Scanner;


public class Statsp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		File datafile;
		FileReader in;
		BufferedReader readFile;
		FileWriter out;
		BufferedWriter writeFile;
		String StuName, Score, filename;
		
		int numstu;
		double scoreValue;
		double lowScore = 100;
		double HighScore = 0;
		double avgScore;
		double totalScore = 0;
		int numScores = 0;
		
		
		
		NumberFormat percent = NumberFormat.getPercentInstance();
		
		//write data 2 file
		
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter file name for storing names and grades");
		
		filename = input.next();
		
		System.out.println("How many students ? ");
		
		numstu = input.nextInt();
		
		
		try 
		{ 
			datafile = new File(filename);
			out = new FileWriter(datafile);
			writeFile = new BufferedWriter(out);
			
			
			for (int i = 0 ; i< numstu; i++)
			{
				System.out.println("Enter student name");
				
				StuName = input.next();
				
				System.out.println("Enter test score");
				
				Score = input.next();
				
				writeFile.write(StuName);
				writeFile.newLine();
				writeFile.write(Score);
				writeFile.newLine();
				
				
				
			}
			
			writeFile.close();
			out.close();
			System.out.println("Data writen to file. ");
			
		}
		
		catch (IOException e) 
		{
			System.out.println("File does not exist or could not be found.");
			System.err.println("FileNotFoundException: " + e.getMessage());
		}
		
		//read data from file + process
		
		try 
		{
			
			
			datafile = new File(filename);
			in = new FileReader(datafile);
			readFile = new BufferedReader(in);
			
			while((StuName = readFile.readLine()) != null)
			{
				Score = readFile.readLine();
				System.out.println(StuName+ " " + Score);
				numScores += 1;
				scoreValue = Double.parseDouble(Score);
				totalScore = totalScore + scoreValue;
				
				if (scoreValue < lowScore)
				{
					lowScore = scoreValue;
				}
				if (scoreValue > HighScore)
				{
					HighScore = scoreValue;
				}
			}
			
			
			avgScore = totalScore / numScores;
			System.out.println("low score = " + percent.format(lowScore/100));
			System.out.println("high score = " + percent.format(HighScore/100));
			System.out.println("average = " + percent.format(avgScore/100));
			
			in.close();
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

}
