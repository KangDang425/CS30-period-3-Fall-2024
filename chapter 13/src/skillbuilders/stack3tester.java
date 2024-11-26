package skillbuilders;

public class stack3tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		stack3 s3 = new stack3();
		
		s3.push(42);
		s3.push("logan");
		s3.push("sigh");
		s3.push(3.02);
		s3.push(true);
		
		
		System.out.println(s3.size());
		System.out.println(s3.top());
		s3.pop();
		System.out.println(s3.top());
		System.out.println("This checks if it is empty at this moment == " + s3.isEmpty());
		System.out.println(s3.size());
		s3.makeEmpty();
		System.out.println("this checks if its empty at this moment " + s3.isEmpty());
		
		
		
		
	}

}
