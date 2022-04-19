package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTests {
	
	Counter counter;

	@BeforeEach
	void setUp() throws Exception {
	counter = new Counter();
	counter.addNumbers(Arrays.asList(1,3,5,7,9,1,1,1,1,4));
	}

	@Test
	void testTwoIsAnEvenNumber() {
		assertTrue(counter.isEven(2));
	}
	
	@Test
	void testOneIsNotAnEvenNumber() {
		assertFalse(counter.isEven(1));
	}
	
	@Test
	void testThereIsOnlyOneEvenNumber() {
		assertEquals(1, counter.evenOccurrences());
	}
	
	@Test
	void testThereAreTwoEvenNumbersIfIAddOneMore() {
		counter.addNumber(2);
		assertEquals(2, counter.evenOccurrences());
	}
	
	@Test
	void testThereAreNineOddNumbers() {
		assertEquals(9, counter.oddOccurrences());
	}
	
	@Test
	void testThereAreTenOddNumbersIfIAddOneMore() {
		counter.addNumber(17);
		assertEquals(10, counter.oddOccurrences());
	}
	
	@Test
	void testTwoIsMultipleOfOne() {
		assertTrue(counter.isMultipleOf(2, 1));
	}

	@Test
	void testTwoIsMultipleOfYourself() {
		assertTrue(counter.isMultipleOf(2, 2));
	}
	
	@Test
	void testTwoIsNotMultipleOfThree() {
		assertFalse(counter.isMultipleOf(2, 3));
	}
	
	@Test
	void testThereAreTwoMultiplesOfThree() {
		assertEquals(2, counter.multiplesOf(3));
	}
	
	@Test
	void testThereAreThreeMultiplesOfThreeIfIAddOneMore() {
		counter.addNumber(12);
		assertEquals(3, counter.multiplesOf(3));
	}
	
	@Test
	void testTheNumber23HasOneEvenDigit() {
		assertEquals(1, counter.evenDigitsIn(23)); 
	}
	
	@Test
	void testTheNumber335HasNotEvenDigits() {
		assertEquals(0, counter.evenDigitsIn(335));
	}
	
	@Test
	void testNumberWithMaxEvenDigitsInAList() {
		List<Integer> numbers = Arrays.asList(234,222459,5797);
	
		assertEquals(222459, counter.maxEvenDigitsNumberIn(numbers));
	}
	
	@Test
	void testNumberWithMaxEvenDigitsIsNotTheIncorrect() {
		List<Integer> numbers = Arrays.asList(2,22,222,2222,22222,22222);
		
		assertNotEquals(22, counter.maxEvenDigitsNumberIn(numbers));
	}
	
	@Test
	void multiplesOf3Below15() {
		List<Integer> multiples = Arrays.asList(3,6,9,12,15);
		assertEquals(multiples, counter.multiplesOfANumberBelow(3, 15));
	}
	
	@Test
	void highestNumberBelowThousandThatIsMultipleOf3and9AtTheSameTime() {
		assertEquals(999, counter.highestMultipleOf(3, 9));
	}
	
	@Test 
	void aPairOfNumbersWithoutCommonMultiple(){
		assertEquals(-1, counter.highestMultipleOf(887, 899));
		
	}
	
}
