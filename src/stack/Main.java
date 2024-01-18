package stack;

public class Main {

	public static void main(String[] args) {
		
		Stack<String> s = new Stack<String>();
		
		s.push("apple");
		s.push("apple");
		s.push("apple");
		s.push("apple");
		s.push("apple");
		
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.print();
	}

}
