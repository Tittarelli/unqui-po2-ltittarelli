package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTests {
	
	Counter counter;

	@BeforeEach
	void setUp() throws Exception {
	counter = new Counter();
	counter.addNumber(1);
	counter.addNumber(3);
	counter.addNumber(5);
	counter.addNumber(7);
	counter.addNumber(9);
	counter.addNumber(1);
	counter.addNumber(1);
	counter.addNumber(1);
	counter.addNumber(1);
	counter.addNumber(4);
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
}
