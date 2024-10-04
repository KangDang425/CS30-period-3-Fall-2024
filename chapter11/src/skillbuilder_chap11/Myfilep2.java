package skillbuilder_chap11;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Myfilep2 {

	public static void main(String[] args) {

		File textFile;
		Scanner input = new Scanner(System.in);
		String responce;
		
		//create a file plz ;P
		textFile = new File("C:\\Users\\27355005\\git\\CS30-period-3-Fall-2024\\chapter11\\src\\skillbuilder_chap11\\zzz.txt");
		
		if(textFile.exists()) {
			System.out.println("xxx.txt exists");
		}
		else
		{
			try 
			{
				textFile.createNewFile();
				System.out.println("zzz.txt file created");
			}
			catch (IOException e) 
			{
				System.out.println("File could not be created.");
    			System.err.println("IOException: " + e.getMessage());
    		}
			System.out.println("File doesn't exist");
		}
		
		//delete or not ?
		System.out.println("Would you like to (K)eep or (D)elete the file?");
		responce = input.nextLine();
		
		if (responce.equalsIgnoreCase("D")) { 
			
			if(textFile.delete()) {
				System.out.println("File deleted");
			}
			
		}
		else
		{
			System.out.println("File kepted");
		}
		


	}

}
