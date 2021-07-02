package com.sapient;

public class Employee {
    private String empName;
    private String email;
    private String location;
    private String gender;
    private int salary;

    Employee(String empName, int salary, String email, String location, String gender) {
        this.empName = empName;
        this.salary = salary;
        this.email = email;
        this.location = location;
        this.gender = gender;
    }

    public String getEmpName() {
        return this.empName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getLocation() {
        return this.location;
    }

    public int getSalary() {
        return this.salary;
    }

    public String getGender() {
        return this.gender;
    }

}
