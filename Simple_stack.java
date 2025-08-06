
package college.srushti;

class SimpleStack {
	private int[] arr;
	private int top;
	// init()
	public SimpleStack(int size) {
		arr = new int[size];
		top = -1;
	}
	// push()
	public void push(int val) {
		top++;
		arr[top] = val;
	}
	// pop()
	public int pop() {
		int val = arr[top];
		top--;
		return val;
	}
	// peek()
	public int peek() {
		int val = arr[top];
		return val;		
	}
	// isEmpty()
	public boolean isEmpty() {
		return top == -1;
	}
	// isFull()
	public boolean isFull() {
		return top == arr.length-1;
	}
}

public class Simple_stack {
	public static void main(String[] args) {
		SimpleStack s = new SimpleStack(6);
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println("Topmost Elem: " + s.peek()); // 40
		while(! s.isEmpty()) {
			int val = s.pop();
			System.out.println("Popped Elem: " + val); // 40, 30, 20, 10	
		}
	}
}
