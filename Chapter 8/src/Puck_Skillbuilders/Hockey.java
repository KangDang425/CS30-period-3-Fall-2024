package Puck_Skillbuilders;

import java.util.Scanner;

public class Hockey {

	public static void main(String[] args) {
		
		double userweight;
		String blea;
		
		puck YPucks1 = new puck(4);
		puck YPucks2 = new puck(4.5);
		puck YPucks3 = new puck(4.3);
		
		puck SPucks1 = new puck(5);
		puck SPucks2 = new puck(4.6);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("what is the weight of your puck ;D");
		userweight = input.nextDouble();
		
		
		puck bob = new puck(userweight);
		
		
		System.out.println(bob + " " +  YPucks1 + " " +  YPucks2 + " " +  YPucks3 + " " +  SPucks1 + " " +  SPucks2);
		System.out.println("User input, edgecase Youth, edgecase youth, youth, edgecase standard, standard");
		
		
		
		blea = bob.toString();
		System.out.println(blea);
		
		
		


	}

	

}
