package Masteries;


public class node {
	private Object data;

	private node next;


	//constructor

	public node(Object str) 

	{

		data = str;

		next = null;

	}


	//The node pointed to by next is returned

	public node getNext() 

	{

		return(next);

	}


	//The node pointed to by next is changed to newNode

	public void setNext(node newNode) 

	{

		next = newNode;

	}


	//The node pointed to by next is returned

	public Object getData() 

	{

		return(data);

	}

}
