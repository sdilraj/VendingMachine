
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Pali {
	
	Stack<Character> stack = new Stack<Character> ();
	Queue<Character> queue = new LinkedList<> ();
	
	
	
	public void pushCharacter(char ch) {
		this.stack.push(ch);
	}
	
	
	public char popCharacter() {
		return this.stack.pop();
		
	}
	
	public void enqueneCharacter(char ch) {
		this.queue.add(ch);
		
	}
	
	
	public char dequeneCharacter() {
		return this.queue.poll();
		
	}
	
	public class palidrom {
		
	}

//	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	}
}

