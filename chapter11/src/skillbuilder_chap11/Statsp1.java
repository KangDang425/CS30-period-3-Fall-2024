package skillbuilder_chap11;

import java.io.*;
import java.text.NumberFormat;


public class Statsp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		File datafile = new File("C:\\Users\\27355005\\git\\CS30-period-3-Fall-2024\\chapter11\\src\\skillbuilder_chap11\\Text1.txt");
		
		FileReader in;
		BufferedReader readFile;
		String StuName, Score;
		double scoreValue;
		double lowScore = 100;
		double HighScore = 0;
		double avgScore;
		double totalScore = 0;
		int numScores = 0;
		
		
		NumberFormat percent = NumberFormat.getPercentInstance();
		
		try 
		{
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
