package Masteries;

import java.util.Scanner;

import skillbuilders.Queue2;

public class queueListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		queueList q2 = new queueList();
		
		q2.enqueue(98);
		q2.enqueue("1000");
		q2.enqueue("why");
		q2.enqueue("sigh");
		
		
		System.out.println(q2.front());
		System.out.println(q2.dequeue());
		System.out.println(q2.front());
		System.out.println("This checks if it is empty at this moment == " + q2.isEmptry());
		System.out.println(q2.size());
		q2.makeEmpty();
		System.out.println("this checks if its empty at this moment " + q2.isEmptry());
		
		
		
		
		
	}

}

/*
screen dump1

7
8
8
This checks if it is empty at this moment == false
3
this checks if its empty at this moment true

screen dump2

98
1000
1000
This checks if it is empty at this moment == false
3
this checks if its empty at this moment true

*/