package com.sapient;

import java.util.HashMap;
import java.util.List;

public interface ICriteria {
    public List<Employee> meetCriteria(HashMap<String, Employee> employees);
}