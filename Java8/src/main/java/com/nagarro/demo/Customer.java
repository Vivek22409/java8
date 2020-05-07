package com.nagarro.demo;

public class Customer {

	private int id;
	private String name;
	private int age;
	private static int idInitializer = 0;

	public Customer(String name,int age) {
		this.id = idInitializer++;
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
