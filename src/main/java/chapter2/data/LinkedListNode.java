package chapter2.data;

public class LinkedListNode<T> {

	public T value;
	public LinkedListNode<T> next;

	public LinkedListNode(T value) {
		this.value = value;
	}

	public void add(T value) {
		if (this.next == null) {
			this.next = new LinkedListNode<T>(value);
		} else {
			this.next.add(value);
		}
	}

	public void add(LinkedListNode<T> node) {
		if (this.next == null) {
			this.next = node;
		} else {
			this.next.add(node);
		}
	}

}
