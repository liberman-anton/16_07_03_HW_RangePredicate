package tel_ran.ranges;

import java.util.Iterator;

import tel_ran.ranges.test.PredicateFactor;

public class RangePredicate implements Iterable<Integer> {
	int min;
	int max;
	PredicateRange predicate;
	
	public RangePredicate(int min, int max) {
		this.min = min;
		this.max = max;
		this.predicate = new PredicateFactor(1);
	}
	
	public RangePredicate(int min, int max, PredicateRange predicate) {
		this.min = min;
		this.max = max;
		this.predicate = predicate;
	}

	@Override
	public Iterator<Integer> iterator() {
		return new RangePredicateIterator(this);
	}

}
