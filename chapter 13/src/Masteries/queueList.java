package Masteries;
/*

Program: LinkedList.java          Date: November 25, 2024

Purpose: Modify the LinkedList class to include functions size(), addAtEnd() and makeEmpty().

Author: Kang Dang

School: CHHS

Course: Computer Science 30

*/



public class queueList {
	
	private linkedlist data;
	private int front,rear,maxSize;
	
	public queueList() {
		data = new linkedlist();
		
		
	}
	
	public Object front() { 
		return(data.front());
	}
	
	public Object dequeue() {
		data.remove(data.front());
		return(data.front());
	}
	
	public void enqueue(Object num) {
		data.addAtEnd(num);
	}
	
	
	public boolean isEmptry() {
		return(data.isempty());
			
	}
	
	
	public int size() 
	{
		return(data.size());
	}
	
	public void makeEmpty() {
		data.makeEmpty();
	}
	
	
	
}
