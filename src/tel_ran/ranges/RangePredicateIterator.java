package tel_ran.ranges;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class RangePredicateIterator implements Iterator<Integer> {
	private RangePredicate range;
	private int current;
	
	public RangePredicateIterator(RangePredicate rangePredicate) {
		this.range = rangePredicate;
		current = rangePredicate.min;
		
	}

	@Override
	public boolean hasNext() {

		return current <= range.max;
	}

	@Override
	public Integer next() {
		while (true) {
			if (!hasNext()){
				throw new NoSuchElementException();
			}
			if(range.predicate.matches(current)){
				 return current++;		
			}
			current++;
		}
	}

}
