package edu.kis.vh.nursery;

 public class DefaultCountingOutRhymer {


	public static final int DEFAULT_VALUE = -1;
	public static final int EMPTY_MARKER = -1;
	public static final int NUMBERS_SIZE = 12;

	private final int[] numbers = new int[NUMBERS_SIZE];

	public int total = EMPTY_MARKER;

	public void countIn(int in) {
		if (!isFull()) {
			numbers[++total] = in;
		}
	}

	public boolean callCheck() {
		return total == EMPTY_MARKER;
	}

	public boolean isFull() {
		return total == NUMBERS_SIZE-1;
	}

	protected int peekABoo() {
		if (callCheck()) {
			return DEFAULT_VALUE;
		}
		return numbers[total];
	}

	public int countOut() {
		if (callCheck()) {
			return DEFAULT_VALUE;
		}
		return numbers[total--];
	}
}
