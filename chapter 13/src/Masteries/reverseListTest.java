package Masteries;

import java.util.Scanner;

public class reverseListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i;
		reverseList q1 = new reverseList(10);
		for (i = 0; i < 10; i++)
		{
			
			
			Scanner input = new Scanner(System.in);
			int intnum;
			System.out.println("Enter a number (999 to quit) : ");
			intnum = input.nextInt();
			
			
			if (intnum == 999)
			{
				break;
			}
			else 
			{
				q1.push(intnum);
				
			}
			
		}
		
		System.out.println("your numbers backwards are ");
		
		for (int b =0; b < i; b++)
		{
			System.out.print(q1.pop() + " ");
		}
		
	}

}
/*
screen dump1
Enter a number (999 to quit) : 
70
Enter a number (999 to quit) : 
60
Enter a number (999 to quit) : 
50
Enter a number (999 to quit) : 
56
Enter a number (999 to quit) : 
999
your numbers backwards are 
56 50 60 70 

screen dump2

Enter a number (999 to quit) : 
50
Enter a number (999 to quit) : 
777
Enter a number (999 to quit) : 
555
Enter a number (999 to quit) : 
989
Enter a number (999 to quit) : 
999
your numbers backwards are 
989 555 777 50 
*/