package edu.kis.vh.nursery;

public class FIFORhymer extends OutRhymer {

	public final OutRhymer T = new OutRhymer();

	@Override
	public int countOut() {
		while (!callCheck())
			
		T.countIn(super.countOut());
		
		int returned = T.countOut();
		
		while (!T.callCheck())
			
		countIn(T.countOut());
		
		return returned;
	}

}
