package edu.kis.vh.nursery.list;

public class IntLinkedList {

	public static final int DEFAULT_VALUE = -1;
	public static final NodeList TERMINATING_NODE = null;

	NodeList last;
	int i;

	public void push(int i) {
		if (last == TERMINATING_NODE)
			last = new NodeList(i);
		else {
			last.next = new NodeList(i);
			last.next.prev = last;
			last = last.next;
		}
	}

	public boolean isEmpty() {
		return last == TERMINATING_NODE;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return DEFAULT_VALUE;
		return last.value;
	}

	public int pop() {
		if (isEmpty())
			return DEFAULT_VALUE;
		int returned = last.value;
		last = last.prev;
		return returned;
	}

}
