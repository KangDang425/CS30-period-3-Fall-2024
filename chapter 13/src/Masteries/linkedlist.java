package Masteries;


public class linkedlist 

{

	private node head;

	

	

	//constructor

	public linkedlist() 

	{

		head = null;

	}

	
	public Object front()
	{
		return (head.getData());
	}
	

	



	//Adds a node to the linked list.

	public void addAtFront(Object str) 

	{

		node newNode = new node(str);

		newNode.setNext(head);

		head = newNode;

	}

	

	

	//Adds a node to the end of the linked list.

	public void addAtEnd(Object str)

	{
		node newNode = new node(str);
		node current = head;

		

		if (current == null)
		{
			newNode.setNext(head);
			head = newNode;
		}
		
		else
		{
			while (current.getNext() != null) 

			{

				current = current.getNext();

			}

			current.setNext(newNode);
		}
		
	}


	//Deletes a node in the linked list.

	public void remove(Object object) 

	{

		node current = head;

		node previous = head;

		if (current.getData().equals(object)) 

		{

			head = current.getNext();

		} 

		else 

		{

			while (current.getNext() != null) 

			{

				previous = current;

				current = current.getNext();


				if (current.getData().equals(object)) 

				{

					previous.setNext(current.getNext());

				}

			}

		}

	}


	//Counts every item in the linked list

	public int size()

	{
		node current = head;

		int listItems = 0;

		

		if (current != null)

		{

			listItems += 1;

			while (current.getNext() != null) 

			{

				listItems += 1;

				current = current.getNext();

			}

		}
		
		return listItems;

	}

	//Creates a string that lists the nodes of the linked list.

	public String toString() 

	{

		node current = head;

		String listString;

	
		

		if (current != null) 

		{
			listString = current.getData() + "\n";

			

			while (current.getNext() != null) 

			{

				current = current.getNext();

				listString += current.getData() + "\n";

			}

			return(listString);

		} 


		else 

		{

			return("There are no items in list.");

		}

	}

	

	
	public boolean isempty()
	{
		if (head == null)
		{
			return (true);
		}
		else 
		{
			return (false);
		}
	}
	

	

	//Empty the linked list

	public void makeEmpty()

	{

		head = null;

	}
}