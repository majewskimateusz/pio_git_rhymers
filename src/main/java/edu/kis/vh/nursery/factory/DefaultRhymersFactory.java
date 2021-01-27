package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.stack.IntArrayStack;

/**
 *
 * klasa implementuje interfejs RhymersFactoryInterface
 */
public class DefaultRhymersFactory implements RhymersFactory {

	/**
	 *metoda nadpisywana z interfejsu RhymersFactoryInterface
	 * zwraca OutRhymer
	 */
	@Override
	public DefaultCountingOutRhymer getStandardRhymer() {
		return new DefaultCountingOutRhymer(new IntArrayStack());
	}

	/**
	 *metoda nadpisywana z interfejsu RhymersFactoryInterface
	 * zwraca OutRhymer
	 */

	@Override
	public DefaultCountingOutRhymer getFalseRhymer() {
		return new DefaultCountingOutRhymer(new IntArrayStack());
	}

	/**
	 *metoda nadpisywana z interfejsu RhymersFactoryInterface
	 * zwraca FIFORhymer
	 */
	@Override
	public DefaultCountingOutRhymer getFIFORhymer() {
		return new FIFORhymer(new IntArrayStack());
	}

	/**
	 *metoda nadpisywana z interfejsu RhymersFactoryInterface
	 * zwraca HanoiRhymer
	 */
	@Override
	public DefaultCountingOutRhymer getHanoiRhymer() {
		return new HanoiRhymer(new IntArrayStack());
	}

}
