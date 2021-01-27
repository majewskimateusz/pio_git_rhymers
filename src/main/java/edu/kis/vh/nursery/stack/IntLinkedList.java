package edu.kis.vh.nursery.stack;

public class IntLinkedList implements IntStack{

	public static final int DEFAULT_VALUE = -1;

	//public static final Node TERMINATING_NODE = null;
	//int i;

	private Node last;
	private int total=0;

	private static class Node {

		private Node prev;
		private Node next;
		private final int value;

		public Node(int i) {
			value = i;
		}

		public int getValue() {
			return value;
		}

		public Node getPrev() {
			return prev;
		}

		public void setPrev(Node prev) {
			this.prev = prev;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {

			this.next = next;
		}
	}


	@Override
	public void push(int i) {
		if (last == null) {
			last = new Node(i);
		}
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
		total++;
	}


	@Override
	public boolean isEmpty(){
		return last == null;
	}

	@Override
	public boolean isFull(){
		return false;
	}

	@Override
	public int top()
	{
		if(isEmpty()){
			return DEFAULT_VALUE;
		}
		return last.getValue();
	}

	@Override
	public int pop() {
		if (isEmpty()) {
			return DEFAULT_VALUE;
		}

		int returned = last.getValue();
		last = last.getPrev();
		total--;
		return returned;
	}

	@Override
	public int getTotal()
	{
		return total;
	}

}
