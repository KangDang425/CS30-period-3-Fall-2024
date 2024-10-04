package skillbuilder_chap11;

import java.io.File;
import java.util.Scanner;

public class MyFile {
	
	public static void main(String[] args ) { 
		
		File textFile;
		Scanner input = new Scanner(System.in);
		String filename;
		
		//obtain file name from the user
		System.out.println("Please input a file name");
		filename = input.nextLine();
		
		//determine if a file exists
		textFile = new File(filename);
		
		if(textFile.exists()) {
			System.out.println("File exists");
		}
		else
		{
			System.out.println("File doesn't exist");
		}

		
	}
	
	
	
}
