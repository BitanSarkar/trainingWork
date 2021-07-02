package com.sapient;

import java.util.HashMap;
import java.util.List;

public class FemaleCriteria implements ICriteria{


	@Override
	public List<Employee> meetCriteria(HashMap<String, Employee> employees) {
		return GenderPredicate.filterPersons(employees, GenderPredicate.onlyMale().negate());
	}
}
