package stacklist;

public class stacklist {
	
	
	
	private linkedlistt data;
	private int top;
	
	public stacklist()
	{
		data = new linkedlistt();
	}
	
	public Object top()
	{
		return (data.gethead());
	}
	
	
	
	public Object pop()
	{
		
	data.remove();
	
	return data;
	}	
	
	public void push(Object item)
	{
		data.addAtFront(item);
	}
	
	public boolean is_empty()
	{
		if (data.size()==0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}
	
	public void make_empty()
	{
		data.setempty();
	}
	
	
	public int size()
	{
		int num;
		num = data.size();
		return (num);
	}
	
		
}


