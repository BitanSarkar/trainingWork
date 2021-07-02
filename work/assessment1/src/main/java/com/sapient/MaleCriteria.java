package com.sapient;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaleCriteria implements ICriteria{
	@Override
	public List<Employee> meetCriteria(HashMap<String, Employee> employees) {
		List<Employee> filteredPerson = new ArrayList<Employee>();
		for (Map.Entry employee : employees.entrySet()) {
            String key = (String)employee.getKey();
            if(employees.get(key).getGender().equals("male")) {
				filteredPerson.add(employees.get(key));
			} 
        }
		return filteredPerson; 
	}
}
