package com.sapient;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Validator {
    public HashMap<String, Employee> getAndValidate(String srcDest) throws IOException {
        File empFile = new File(srcDest);
        BufferedReader br = new BufferedReader(new FileReader(empFile));
        String line = "";
        HashMap<String, Employee> data = new HashMap<String, Employee>();
        while ((line = br.readLine()) != null) {
            String[] empData = line.split("\\|");
            if (!empData[1].equals("empname")) {
                String empName = empData[1].trim();
                if (empName.equals("")) {
                    System.out.println("Invalid name, row ignored");
                    continue;
                }
                int salary;
                try {
                    salary = Integer.parseInt(empData[2].trim());
                } catch (NumberFormatException e) {
                    System.out.println("No salary given, 1000 is set as default");
                    salary = 1000;
                }
                String email = empData[3].trim();
                if (email.equals("")) {
                    System.out.println("Invalid email, row ignored");
                    continue;
                }
                String location = empData[4].trim();
                if (location.equals("")) {
                    System.out.println("Invalid location, row ignored");
                    continue;
                }
                String gender = empData[5].trim();
                if (gender.equals("")) {
                    System.out.println("Invalid location, row ignored");
                    continue;
                }
                data.put(empName, new Employee(empName, salary, email, location, gender));
            }
        }
        br.close();
        return data;
    }
}