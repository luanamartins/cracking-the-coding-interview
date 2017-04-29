package chapter2;

import java.util.LinkedList;

/**
 * Sum Lists: You have two numbers represented by a linked list, where each node
 * contains a single digit. The digits are stored in reverse order, such that
 * the 1's digit is at the head of the list. Write a function that adds the two
 * numbers and returns the sum as a linked list.
 * 
 * EXAMPLE Input: (7 -> 1 -> 6) + (5 -> 9 -> 2). That is, 617 + 295. Output: 2
 * -> 1 -> 9. That is, 912.
 * 
 * FOLLOW UP
 * 
 * Suppose the digits are stored in forward order. Repeat the above problem.
 * EXAMPLE Input: (6 -> 1 -> 7) + (2 -> 9 -> 5).That is, 617 + 295. Output: 9 ->
 * 1 -> 2. That is, 912.
 */

public class Question5 {

	public static LinkedList<Integer> sumLists(LinkedList<Integer> first, LinkedList<Integer> second) {
		LinkedList<Integer> result = new LinkedList<>();

		boolean isFirstBigger = first.size() > second.size();
		boolean isSameSize = first.size() < second.size();

		int smallSize = isFirstBigger ? second.size() : first.size();

		int sum, index, carry = 0;

		for (index = 0; index < smallSize; index++) {
			sum = first.get(index) + second.get(index) + carry;
			result.add(sum % 10);
			carry = sum / 10;
		}

		if (!isSameSize) {
			if (isFirstBigger) {
				result.addAll(first.subList(index, first.size()));
			} else {
				result.addAll(second.subList(index, second.size()));
			}
		}

		return result;
	}
	
	public static void main(String[] args) {
		LinkedList<Integer> first = new LinkedList<>();
		first.add(7);
		first.add(1);
		first.add(6);
		first.add(1);
		
		LinkedList<Integer> second = new LinkedList<>();
		second.add(5);
		second.add(9);
		second.add(2);
	
		LinkedList<Integer> result = sumLists(first, second);
		
		for(Integer item : result) {
			System.out.print(item + " ");
		}
	}

}
