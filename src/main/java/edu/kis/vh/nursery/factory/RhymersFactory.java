package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.OutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;

public class RhymersFactory implements RhymersFactoryInterface {

	@Override
	public OutRhymer GetStandardRhymer() {
		return new OutRhymer();
	}

	@Override
	public OutRhymer GetFalseRhymer() {
		return new OutRhymer();
	}

	@Override
	public OutRhymer GetFIFORhymer() {
		return new FIFORhymer();
	}

	@Override
	public OutRhymer GetHanoiRhymer() {
		return new HanoiRhymer();
	}

}
