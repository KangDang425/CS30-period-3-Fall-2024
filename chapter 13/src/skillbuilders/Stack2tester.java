package skillbuilders;

public class Stack2tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String hi = "hi";
		
		stack2 s2 = new stack2(5);
		
		
		s2.push("red");
		s2.push("yellow");
		s2.push("green");
		s2.push("red");
		s2.push("reb");
		
		System.out.println("top of stack s2 is: " + s2.top());
		System.out.println("how many items r in stack 2:  " + s2.size());
		
		s2.pop(); //removes the top one 
		
		System.out.println("top of stack s2 is: " + s2.top());
		System.out.println("how many items r in stack 2:  " + s2.size());
		
		
		
		
	}
	
	
	

}
