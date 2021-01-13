package edu.kis.vh.nursery;

public class HanoiRhymer extends OutRhymer {


int rejected = 0;

	public int reportRejected() {
		return rejected;
	}

	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekABoo())
			rejected++;
		else
			super.countIn(in);
	}


}
