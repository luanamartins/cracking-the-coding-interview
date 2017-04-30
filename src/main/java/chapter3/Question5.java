package chapter3;

import java.util.Stack;

/**
 * 
 * Sort Stack: Write a program to sort a stack such that the smallest items are
 * on the top. You can use an additional temporary stack, but you may not copy
 * the elements into any other data structure (such as an array). The stack
 * supports the following operations: push, pop, peek, and isEmpty.
 * 
 */

public class Question5 {

	public static void sortStack(Stack<Integer> stack) {
		Stack<Integer> aux = new Stack<>();
		int index = stack.size();

		while (index > 0) {
			Integer smallest = getSmallest(stack, aux, index);
			stack.push(smallest);

			while (!aux.isEmpty()) {
				stack.push(aux.pop());
			}
			index--;
		}
	}

	public static Integer getSmallest(Stack<Integer> stack, Stack<Integer> aux, int index) {
		int counter = 0;
		Integer element;
		Integer min = Integer.MAX_VALUE;
		while (counter < index) {
			element = stack.pop();
			if (element < min) {
				if(min != Integer.MAX_VALUE) aux.push(min);
				min = element;
			} else {
				aux.push(element);
			}
			counter++;
		}
		return min;
	}
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(4);
		stack.push(3);
		stack.push(1);
		sortStack(stack);
		System.out.println();
	}

}
