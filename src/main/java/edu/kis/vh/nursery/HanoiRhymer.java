package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {

int rejected = 0;

	public int reportRejected() {
		return rejected;
	}

	public void countIn(int in) {
	if (!callCheck() && in > peekaboo())
			rejected++;
			else
				super.countIn(in);
	}
}
