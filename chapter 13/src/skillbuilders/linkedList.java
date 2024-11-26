package skillbuilders;

public class linkedList {

	private Node head;
	
	
	
	public LinkedList() {
		head = null;
	} 
	
	public void addatfront(String str)
	{
		Node newNode = new Node(str);
		newNode.setNext(head);
		head = newNode;
	}
	
	
	
	
	
	
	
}
