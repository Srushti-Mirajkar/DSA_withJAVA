
package college.srushti;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Stack_using_1queue {
	public static void main(String[] args) {
		Stack<String> s = new Stack<>();
		s.push("A");
		s.push("B");
		s.push("C");
		s.push("D");
		System.out.println("Stack Topmost Elem: " + s.peek()); // D
		while(!s.isEmpty()) {
			String ele = s.pop();
			System.out.println("Stack Popped Elem: " + ele); // D, C, B, A
		}
		System.out.println();
		
		//Queue<String> q = new Queue<>(); // ERROR: cannot create object of interface
		Queue<String> q = new LinkedList<>();
		q.offer("A");
		q.offer("B");
		q.offer("C");
		q.offer("D");
		System.out.println("Queue Topmost Elem: " + q.peek()); // A
		while(!q.isEmpty()) {
			String ele = q.poll();
			System.out.println("Queue Popped Elem: " + ele); // A, B, C, D
		}
	}
}
