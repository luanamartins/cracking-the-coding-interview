package chapter2;

import java.util.LinkedList;

/**
 * Return Kth to Last: Implement an algorithm to find the kth to last element of
 * a singly linked list.
 */

public class Question2 {

	public static LinkedList<Integer> subList(LinkedList<Integer> list, int k) {
		int offset = list.size() - k;
		if (k > 0) {
			for (int i = 0; i < offset; i++) {
				list.removeFirst();
			}
		}else{
			list.clear();
		}
		return list;
	}

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);

		subList(list, 9);

		for (Integer i : list) {
			System.out.print(i + " ");
		}
	}

}
