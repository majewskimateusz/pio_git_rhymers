package edu.kis.vh.nursery;

public class OutRhymer {


	public static final int EMPTY_FLAG = -1;
	public static final int NUMBERS_SIZE = 12;

	private int[] numbers = new int[NUMBERS_SIZE];

	public int total = EMPTY_FLAG;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == EMPTY_FLAG;
	}

	public boolean isFull() {
		return total == NUMBERS_SIZE-1;
	}

	protected int peekABoo() {
		if (callCheck())
			return EMPTY_FLAG;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return EMPTY_FLAG;
		return numbers[total--];
	}
}
