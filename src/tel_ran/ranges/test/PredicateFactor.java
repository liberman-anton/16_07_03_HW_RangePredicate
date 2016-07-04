package tel_ran.ranges.test;

import tel_ran.ranges.PredicateRange;

public class PredicateFactor implements PredicateRange {
	private int factor;

	public PredicateFactor(int factor) {
		this.factor = factor;
	}
	@Override
	public boolean matches(int number) {
		return (number % factor == 0) ? true : false;
	}

}
