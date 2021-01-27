package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntArrayStack;
import edu.kis.vh.nursery.stack.IntStack;

public class DefaultCountingOutRhymer {

	private IntStack stos;

	public DefaultCountingOutRhymer(IntStack stack) {
		this.stos= stack;
	}

	/*
	public DefaultCountingOutRhymer() {

	}

	 */

	public void countIn(int in) {
		stos.push(in);
	}

	public boolean callCheck() {
		return stos.isEmpty();
	}

	public boolean isFull() {
		return false;
	}

	public int peekABoo() {
		if (callCheck()) {
			return IntArrayStack.DEFAULT_VALUE;
		}
		return stos.top();
	}

	public int countOut() {
		return stos.pop();
	}


}
