package chapter2;

/**
 * 
 * Delete Middle Node: Implement an algorithm to delete a node in the middle
 * (i.e., any node but the first and last node, not necessarily the exact
 * middle) of a singly linked list, given only access to that node. EXAMPLE
 * 
 * Input: the node c from the linked list a -> b -> c -> d -> e -> f
 * 
 * Result: nothing is returned, but the new linked list looks like a -> b -> d
 * -> e -> f
 * 
 */

public class Question3 {

	public static boolean deleteMiddleNode(LinkedListNode<Character> middle) {
		if (middle == null || middle.next == null)
			return false;
		middle.value = middle.next.value;
		middle.next = middle.next.next;
		return true;
	}

	public static void main(String[] args) {
		LinkedListNode<Character> list = new LinkedListNode<>('a');
		list.add('b');
		list.add('c');
		list.add('d');
		list.add('e');

		LinkedListNode<Character> pointer = list;
		boolean isMiddle = false;
		int counter = 1;

		while (!isMiddle && pointer != null) {
			pointer = pointer.next;
			if (counter == 2) {
				isMiddle = true;
			}
			counter++;
		}

		deleteMiddleNode(pointer);

		LinkedListNode<Character> current = list;
		while (current != null) {
			System.out.print(current.value + " ");
			current = current.next;
		}
	}
}
