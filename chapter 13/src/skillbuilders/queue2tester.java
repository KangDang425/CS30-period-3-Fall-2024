package skillbuilders;

public class queue2tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Queue2 q2 = new Queue2();
		
		q2.enqueue(4);
		q2.enqueue(2);
		q2.enqueue(3);
		q2.enqueue(6);
		
		
		System.out.println(q2.front());
		System.out.println(q2.dequeue());
		System.out.println(q2.front());
		System.out.println("This checks if it is empty at this moment == " + q2.isEmptry());
		System.out.println(q2.size());
		q2.makeEmpty();
		System.out.println("this checks if its empty at this moment " + q2.isEmptry());
		
		
		
	}

}
