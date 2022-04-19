package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Counter {

	private List<Integer> numbers;
	
	public Counter() {
		numbers = new ArrayList<>();
	}

	public void addNumber(int aNumber) {
		numbers.add(aNumber);
	}

	public boolean isEven(int aNumber) {

		return aNumber % 2 == 0;
	}

	public int evenOccurrences() {
		return (int)numbers.stream().filter(this::isEven).count();
	}

	public int oddOccurrences() {
		return (int)numbers.stream().filter(aNumber -> !this.isEven(aNumber)).count();
	}

	public boolean isMultipleOf(int aNumber, int anotherNumber) {
		return aNumber % anotherNumber == 0;
	}

	public int multiplesOf(int aNumberToCompare) {
		return (int)numbers.stream().filter(aNumber -> this.isMultipleOf(aNumber, aNumberToCompare)).count();
	}

	public Integer evenDigitsIn(int aNumber) {
		int evenDigits = 0;
		while(aNumber > 0) {
			if(this.isEven(aNumber % 10)) evenDigits++;
			aNumber = (aNumber / 10);
		}
		return evenDigits;
	}

	public int maxEvenDigitsNumberIn(List<Integer> numbers) {
		return numbers.stream()
				.max((x,y) -> 
					(this.evenDigitsIn(x).compareTo
					(this.evenDigitsIn(y))))
				.get();
	}

	public void addNumbers(List<Integer> numbers) {
		numbers.stream().forEach(this::addNumber);
	}

	public Integer highestMultipleOf(int aNumber, int anotherNumber) {
		List<Integer> commonMultiples = this.commonMultiplesTo(aNumber, anotherNumber); 
		if (commonMultiples.isEmpty()) 
			return -1;
		else 
			return commonMultiples.stream().max((x,y) -> x.compareTo(y)).get(); 
	}

	public List<Integer> commonMultiplesTo(int aNumber, int anotherNumber){
		
		return this.multiplesOfANumberBelow(aNumber, 1000)
				.stream()
				.filter(x -> this.multiplesOfANumberBelow(anotherNumber, 1000).contains(x))
				.collect(Collectors.toList());
	}
	
	public List<Integer> multiplesOfANumberBelow(int aNumber, int aLimitNumber) {
		int iterator = 1;
		int result = 0;
		List<Integer> multiples = new ArrayList<>();
		while (result < aLimitNumber) {
			result = aNumber * iterator;
			multiples.add(result);
			iterator++;
		}
		return multiples;
	}

}
