package skillbuilders;

import java.util.ArrayList;

public class stack3 {

	
	private ArrayList<Object> data;
	private int top;
	
	
	public stack3()
	{
		data = new ArrayList<Object>();
		top=-1;
	}
	
	public Object top() 
	{
		return(data.get(top));
	}
	
	public Object pop()
	{
		Object topItem = data.get(top);
		data.remove(top);
		return(topItem);
	}
	
	public void push(Object item)
	{
		top += 1;
		data.add(top,item);
		
		
	}
	
	public boolean isEmpty()
	{
		if(top==1)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	
	public void makeEmpty()
	{
		top=-1;
		data.clear();
	}
	
	
	public int size()
	{
		return(data.size());
	}
	
	
	
}
