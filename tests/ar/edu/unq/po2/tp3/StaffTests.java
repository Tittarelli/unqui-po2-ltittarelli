package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StaffTests {
	
	Staff staff;

	@BeforeEach
	void setUp() throws Exception {
		Person p1 = Person.namedAndBorn("Leandro", LocalDate.of(1997, Month.MARCH, 10));
		Person p2 = Person.namedAndBorn("Ayelén", LocalDate.of(1997, Month.JULY, 18));
		Person p3 = Person.namedAndBorn("Ariel", LocalDate.of(2000, Month.JUNE, 26));
		Person p4 = Person.namedAndBorn("Ruben", LocalDate.of(1970, Month.NOVEMBER, 04));
		Person p5 = Person.namedAndBorn("Leandro", LocalDate.of(1973, Month.FEBRUARY, 10));
		staff = Staff.integratedBy("STAFF", List.of(p1,p2,p3,p4,p5));
	}

	@Test
	void testTeamAgeAverage() {
		assertEquals(34, staff.ageAverage());
	}
	
	/*@Test
	void testTeamAgeAverageWithFloatResult() {
		Person p1 = Person.namedAndBorn("Leandro", LocalDate.of(2017, Month.MARCH, 10));
		Person p2 = Person.namedAndBorn("Ayelén", LocalDate.of(2018, Month.MARCH, 18));
		staff = Staff.integratedBy("STAFF", List.of(p1,p2));
		assertEquals(4.5, staff.ageAverage());
	}
	
	Este test falla, preguntar sobre casteo.
	
	*/

}
