package ar.edu.unq.po2.tp3;

import java.util.List;

public class Staff {

	
	@SuppressWarnings("unused")
	private String name;
	private List<Person> members;

	public Staff(String staffName, List<Person> members) {
		name = staffName;
		this.members = members;
	}

	public static Staff integratedBy(String staffName, List<Person> members) {
		return new Staff(staffName, members);
	}

	public Double ageAverage() {
		return (members.stream().mapToInt(Person::age).asDoubleStream().sum() / members.size());
	}

}
