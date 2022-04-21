package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTests {
	Person person;
	
	@BeforeEach
	void setUp() throws Exception {
		person = Person.namedAndBorn("Leandro", LocalDate.of(1997, Month.MARCH, 10));
	}


	@Test
	void testPersonAge() {
		assertEquals(25, person.age());
	}
	
	@Test
	void testOldestPerson() {
		Person anotherPerson = Person.namedAndBorn("Ayelén", LocalDate.of(1997, Month.JULY, 18));
		assertTrue(person.isOlderThan(anotherPerson));
	}

}
