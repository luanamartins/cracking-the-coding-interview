package chapter3;

import chapter3.data.MyStack;

/**
 * 
 * Stack Min: How would you design a stack which, in addition to push and pop,
 * has a function min which returns the minimum element? Push, pop and min
 * should all operate in O(1) time.
 * 
 **/

public class Question2 {

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push(10);
		stack.push(12);
		stack.push(9);
		System.out.print(stack.min());
		stack.pop();
		System.out.println();
		System.out.print(stack.min());
		
	}

}
