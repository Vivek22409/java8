package com.nagarro.demo;

import java.util.UUID;

public class Human implements Comparable<Human> {

	private UUID id;
	private String name;
	private int age;
	private static int countNoOfObjects = 0;

	public Human(String name) {
		super();
		this.id = UUID.randomUUID();
		this.name = name;
		countNoOfObjects++;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int compareTo(Human h) {
		return this.getAge()-h.getAge();
	}
	
	@Override
	public String toString() {
		return "Human [id=" + id + ", name=" + name + ", age=" + age + "]";
	}	

}
