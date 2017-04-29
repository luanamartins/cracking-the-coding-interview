package chapter3.data;

import java.util.Stack;

public class MyStack {

	class Node {
		Integer value;
		Integer min;

		public String toString() {
			return "value: " + value + " min: " + min;
		}
	}

	Stack<Node> stack = new Stack<>();

	public void push(Integer value) {
		Node node = new Node();
		
		if (!stack.isEmpty()) {
			Integer min = stack.peek().min;
			node.min = Math.min(value, min);
		} else {
			node.min = value;
		}
		
		node.value = value;
		stack.push(node);
	}

	public Node pop() {
		if (!stack.isEmpty())
			return stack.pop();
		else
			return null;
	}

	public Integer min() {
		if (!stack.isEmpty()) {
			return stack.peek().min;
		} else {
			return null;
		}
	}
}
