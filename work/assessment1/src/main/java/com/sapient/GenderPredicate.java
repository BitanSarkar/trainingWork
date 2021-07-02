package com.sapient;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class GenderPredicate {
    public static Predicate<Employee> onlyMale() {
        return p -> p.getGender().equals("male");
    }
    public static List<Employee> filterPersons(HashMap<String, Employee> employees, Predicate<Employee> predicate) {
    	List<Employee> _employees = employees.values().stream().collect(Collectors.toCollection(ArrayList::new));
		return _employees.stream().filter(predicate).collect(Collectors.toList());
		
	}
}
