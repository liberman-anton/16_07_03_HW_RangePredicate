package tel_ran.ranges.test;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.Before;
import org.junit.Test;

import tel_ran.ranges.RangePredicate;

public class RangePredicateTest {
RangePredicate rangeAll = new RangePredicate(1,6);
RangePredicate rangeFactor10 = new RangePredicate(1,50, new PredicateFactor(10));
RangePredicate rangePrimes = new RangePredicate(1,6, new PredicatePrimes());
int expectedAll[] = {1,2,3,4,5,6};
int expectedFactor10[] = {10,20,30,40,50};
int expectedPrimes[] = {2,3,5};
RangePredicate rangeEven = new RangePredicate(1,6, new PredicateFactor(2));
int expectedEven[] = {2,4,6};
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testRangeAll() {
		testIterator(rangeAll,expectedAll);
	}

	@Test
	public void testRangeFactor() {
		testIterator(rangeFactor10,expectedFactor10);
	}
	
	@Test
	public void testRangePrimes() {
		testIterator(rangePrimes,expectedPrimes);
	}
	
	@Test
	public void testRangeEven() {
		testIterator(rangeEven,expectedEven);
	}
	
	private void testIterator(RangePredicate range, int[] expected) {
		int actual[] = new int[expected.length];
		int ind = 0;
		
		try {
			for(int number: range)
				actual[ind++] = number;
		} catch (NoSuchElementException e) {
			
		}
		assertArrayEquals(expected, actual);
	}
}
