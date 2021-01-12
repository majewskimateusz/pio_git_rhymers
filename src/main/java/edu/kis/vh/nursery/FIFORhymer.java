package edu.kis.vh.nursery;

public class FIFORhymer extends defaultCountingOutRhymer {


	public defaultCountingOutRhymer t = new defaultCountingOutRhymer();
	
	@Override
	public int countOut() {
		while (!callCheck())
			
		t.countIn(super.countOut());
		
		int returned = t.countOut();
		
		while (!t.callCheck())
			
		countIn(t.countOut());
		
		return returned;
	}

}
