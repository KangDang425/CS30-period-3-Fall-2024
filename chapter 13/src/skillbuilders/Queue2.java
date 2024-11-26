package skillbuilders;

public class Queue2 {

	private int[] data;
	private int front,rear,maxSize;
	
	public void Queue(int maxItems) {
		data = new int[maxItems];
		front = -1;
		rear = -1;
		maxSize = maxItems;
	}
	
	public int front() { 
		return(data[front]);
	}
	
	public int dequeue() {
		front = (front +1) % maxSize;
		return(data[front-1]);
	}
	
	public void enqueue(int num) {
		if (isEmptry()) {
			rear =0;
			front =0;
			data[rear] = num;
			} else {
				rear = (rear + 1) % maxSize;
				data[rear] = num;
			}
	}
	
	
	public boolean isEmptry() {
		if (front==-1 && rear==-1) {
			return true;
		} else {
			return false;
		}
			
	}
	
	
	public int size() 
	{
		if (isEmptry()) {
			return( 0 );
		} else {
			return(rear - front +1);
		}
	}
	
	public void makeEmpty() {
		front =-1;
		rear =-1;
	}
	
	
}
