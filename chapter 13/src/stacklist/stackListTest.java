package stacklist;


public class stackListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String hi = "hi";
		
		stacklist s2 = new stacklist();
		
		
		s2.push("red");
		s2.push("yellow");
		s2.push("green");
		s2.push("bro");
		s2.push("ahhh");
		
		System.out.println("top of stack s2 is: " + s2.top());
		System.out.println("how many items r in stack 2:  " + s2.size());
		
		s2.pop(); //removes the top one 
		
		System.out.println("top of stack s2 is: " + s2.top());
		System.out.println("how many items r in stack 2:  " + s2.size());
		
		s2.make_empty();
		
		
		
		
	}

}
/*
screen dump1
top of stack s2 is: reb
how many items r in stack 2:  5
top of stack s2 is: red
how many items r in stack 2:  4

screen dump2
top of stack s2 is: ahhh
how many items r in stack 2:  5
top of stack s2 is: bro
how many items r in stack 2:  4

*/