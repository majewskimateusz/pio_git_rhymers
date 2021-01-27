package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntArrayStack;
import edu.kis.vh.nursery.stack.IntStack;

public class FIFORhymer extends DefaultCountingOutRhymer {


	private final IntStack tempp = new IntArrayStack();

	public FIFORhymer(IntStack stc) {
		super(stc);
	}

	@Override
	public int countOut()
	{
		while (!callCheck()) {
			tempp.push(super.countOut());
		}

		int returned = tempp.pop();

		while (!tempp.isEmpty())
			countIn(tempp.pop());

		return returned;
	}


}

