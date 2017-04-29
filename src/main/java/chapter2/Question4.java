package chapter2;

import java.util.LinkedList;

/**
 * Partition: Write code to partition a linked list around a value x, such that all nodes less than x come
 * before all nodes greater than or equal to x. lf x is contained within the list, the values of x only need
 * to be after the elements less than x (see below). The partition element x can appear anywhere in the
 * "right partition"; it does not need to appear between the left and right partitions.
 * EXAMPLE
 * Input: 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 [partition = 5)
 * Output: 3 -> 1 -> 2 -> 10 -> 5 -> 5 -> 8
 * */

public class Question4 {

	public static LinkedList<Integer> partition(LinkedList<Integer> list, int partition) {
		LinkedList<Integer> smallOnes = new LinkedList<>();
		LinkedList<Integer> highOnes = new LinkedList<>();

		for (Integer item : list) {
			if (item < partition) {
				smallOnes.add(item);
			} else if (item > partition) {
				highOnes.add(item);
			} else {
				highOnes.add(0, item);
			}
		}

		smallOnes.addAll(highOnes);

		return smallOnes;
	}

	public static void main(String[] agrs) {

		LinkedList<Integer> list = new LinkedList<>();
		list.add(3);
		list.add(5);
		list.add(8);
		list.add(5);
		list.add(10);
		list.add(2);
		list.add(1);

		list = partition(list, 5);

		for (Integer item : list) {
			System.out.print(item + " ");
		}
	}
}
