package ar.edu.unq.po2.tp3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Person {
	
	private LocalDate birthDate;
	@SuppressWarnings("unused")
	private String name;

	private Person(String aName, LocalDate aBirthDate) {
		name = aName;
		birthDate = aBirthDate;
	}

	public static Person namedAndBorn(String aName, LocalDate aBirthDate) {
		return new Person(aName, aBirthDate);
	}

	public Integer age() {
		return (int) ChronoUnit.YEARS.between(birthDate, LocalDate.now());
	}

	public Boolean isOlderThan(Person anotherPerson) {
		return anotherPerson.wasBornAfter(birthDate);
	}

	private Boolean wasBornAfter(LocalDate aBirthDate) {
		return birthDate.isAfter(aBirthDate);
	}

}
