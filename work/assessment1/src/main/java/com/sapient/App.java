package com.sapient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class App {

  public static void main(String[] args) throws IOException {
    String srcDest = "resources\\emp.txt";
    HashMap<String, Employee> map = new Validator().getAndValidate(srcDest);
    ICriteria male = new MaleCriteria();
    ICriteria female = new FemaleCriteria();
    System.out.println("Press 1 for getting the list of males");
    System.out.println("Press 2 for getting the list of females");
    int choice = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
    if (choice == 1) {
      System.out.println("\n\n-------- male list ------------");
      male.meetCriteria(map).forEach((t) -> System.out.println(t.getEmpName() + " " + t.getSalary() + " | "
          + t.getEmail() + " | " + t.getLocation() + " | " + t.getGender()));
      System.out.println("-------- end of list ------------\n");

    }
    if (choice == 2) {
      System.out.println("\n\n-------- female list ------------");
      female.meetCriteria(map).forEach((t) -> System.out.println(t.getEmpName() + " | " + t.getSalary() + " | "
          + t.getEmail() + " | " + t.getLocation() + " | " + t.getGender()));
      System.out.println("-------- end of list ------------\n");

    }
  }
}
