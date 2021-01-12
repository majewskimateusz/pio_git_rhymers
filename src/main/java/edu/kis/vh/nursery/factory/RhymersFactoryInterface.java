package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.OutRhymer;

	public interface RhymersFactoryInterface {
	
		public OutRhymer GetStandardRhymer();
		
		public OutRhymer GetFalseRhymer();
		
		public OutRhymer GetFIFORhymer();
		
		public OutRhymer GetHanoiRhymer();
		
	}
