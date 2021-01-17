package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.OutRhymer;
import edu.kis.vh.nursery.FIFORhymer;


/**
 *
 * klasa implementuje interfejs RhymersFactoryInterface
 */
public class RhymersFactory implements RhymersFactoryInterface {

	/**
	 *metoda nadpisywana z interfejsu RhymersFactoryInterface
	 * zwraca OutRhymer
	 */
	@Override
	public OutRhymer GetStandardRhymer() {
		return new OutRhymer();
	}

	/**
	 *metoda nadpisywana z interfejsu RhymersFactoryInterface
	 * zwraca OutRhymer
	 */

	@Override
	public OutRhymer GetFalseRhymer() {
		return new OutRhymer();
	}

	/**
	 *metoda nadpisywana z interfejsu RhymersFactoryInterface
	 * zwraca FIFORhymer
	 */
	@Override
	public OutRhymer GetFIFORhymer() {
		return new FIFORhymer();
	}

	/**
	 *metoda nadpisywana z interfejsu RhymersFactoryInterface
	 * zwraca HanoiRhymer
	 */
	@Override
	public OutRhymer GetHanoiRhymer() {
		return new HanoiRhymer();
	}

}
