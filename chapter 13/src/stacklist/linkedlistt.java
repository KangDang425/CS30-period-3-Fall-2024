package stacklist;


public class linkedlistt 

{

	private Nodee head;



	//constructor

	public linkedlistt() 

	{

		head = null;

	}

	
	
	public void setempty()
	{
		head=null;
	}

	

	public Object gethead()
	{
		return(head.getData());
	}



	//Adds a node to the linked list.

	public void addAtFront(Object str) 

	{

		Nodee newNode = new Nodee(str);

		newNode.setNext(head);

		head = newNode;

	}

	

	

	//Adds a node to the end of the linked list.

	public void addAtEnd(Object str)

	{

		Nodee current = head;

		Nodee newNode = new Nodee(str);

		

		while (current.getNext() != null) 

		{

			current = current.getNext();

		}

		current.setNext(newNode);

	}

	

	



	//Deletes a node in the linked list.

	public Object remove() 

	{

		Nodee current = head;
		head =head.getNext();
		return(current.getData());
	}
	
	public int size()
	{
		Nodee current = head;
		int listnum = 0;
		
		if (current != null)
		{
			listnum +=1;
			
			while (current.getNext() != null )
			{
				listnum +=1;
				
				current = current.getNext();
			}
		}
		
		return (listnum);
		
	}
	
	
	
}
