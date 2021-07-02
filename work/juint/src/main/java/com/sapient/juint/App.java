package com.sapient.juint;

public class App {
	public String sayHi(String name) {
		if(name.length() < 4) return null;
		return "Hi " + name; 
	}
	public String storeEmployee(String name, int age) {
		if(name.equals("Bitan")){
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return "Stored " + name;
		}
		else {
			throw new RuntimeException("Invalid name");
		}
	}
	
}
