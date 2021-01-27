package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntStack;

public class HanoiRhymer extends DefaultCountingOutRhymer {


	int rejected = 0;

	public int reportRejected() {
		return rejected;
	}

	public HanoiRhymer(IntStack sta) {
		super(sta);
	}


	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekABoo()) {
			rejected+=1;
		}
		else {
			super.countIn(in);
		}
	}


}
