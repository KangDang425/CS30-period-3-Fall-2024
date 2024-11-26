package skillbuilders;

import java.util.ArrayList;

public class queue3 {
	
	private ArrayList<Object> data;
	
	public queue3() {
		data = new ArrayList<Object>();
	}
	
	public Object front() { 
		return (data.getFirst());
	}
	
	public Object dequeue() {
		
		
		return(data.removeFirst());
	}
	
	public void enqueue(Object num) {
		data.add(num);
	}
	
	
	public boolean isEmptry() {
		return (data.isEmpty());
			
	}
	
	
	public int size() 
	{
		return(data.size());
	}
	
	public void makeEmpty() {
		data.clear();
	}
	
	
}
