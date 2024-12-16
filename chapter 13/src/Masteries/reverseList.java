package Masteries;

public class reverseList {
	private int[] data;
	private int top;
	
	public reverseList(int maxItems)
	{
		data = new int[maxItems];
		top = -1;
	}
	
	public Object top()
	{
		return (data[top]);
	}
	
	
	
	public Object pop()
	{
		
	top -= 1;
	
	return data[top +1];
	}	
	
	public void push(int item)
	{
		if (top < data.length - 1)
		{
			top += 1;
			data[top] = item;
		}
	}
	
	public boolean is_empty()
	{
		if (top ==-1)
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
		top = -1;
	}
	
	public int size()
	{
		if (is_empty())
		{
			return 0;
		}
		else 
		{
			return top +1;
		}
		
	}
}
