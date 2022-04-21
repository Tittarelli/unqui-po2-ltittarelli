package ar.edu.unq.po2.tp3;

import java.util.List;

public class MultiOperator {

	public Integer sum(List<Integer> numbersToSum) {
		return numbersToSum.stream().reduce(0, Integer::sum);
	}

	public Integer substract(List<Integer> numbersToSubstract) {
		return numbersToSubstract.stream().reduce(0, (x,y) -> x - y);
	}

	public Integer product(List<Integer> numbersToProduct) {
		return numbersToProduct.stream().reduce(1, (x,y) -> x * y);
	}

}
