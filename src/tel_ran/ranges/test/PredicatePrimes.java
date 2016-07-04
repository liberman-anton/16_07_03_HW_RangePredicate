package tel_ran.ranges.test;

import tel_ran.ranges.PredicateRange;

public class PredicatePrimes implements PredicateRange {
	
	@Override
	public boolean matches(int number) {
		if(number < 2) return false;
		if(number < 4) return true;
		int del = 2;
		while( del < number){
			if(number % del == 0)return false;
			del++;
		}
		return true;
	}

}

