package stacklist;



class Nodee {

	private Object data;

	private Nodee next;



	

	//constructor

	public Nodee(Object newData) 

	{

		data = newData;

		next = null;

	}

	

	

	//The node pointed to by next is returned

	public Nodee getNext() 

	{

		return(next);

	}

	

	

	//The node pointed to by next is changed to newNode

	public void setNext(Nodee newNode) 

	{

		next = newNode;

	}

	

	

	//The node pointed to by next is returned

	public Object getData() 

	{

		return(data);

	}

}
