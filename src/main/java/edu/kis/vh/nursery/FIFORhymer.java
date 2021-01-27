package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

	public final DefaultCountingOutRhymer t = new DefaultCountingOutRhymer();

	@Override
	public int countOut() {
		while (!callCheck()) {
			t.countIn(super.countOut());
		}
		
		int returned = t.countOut();
		
		while (!t.callCheck()) {
			countIn(t.countOut());
		}


		return returned;
	}

}

