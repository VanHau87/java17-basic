package com.javalang.utils;

import java.util.UUID;

public class Employee {
	public static int count = 0;
	private UUID id;
	private String name;
	public Employee(String name) {
		this.id = UUID.randomUUID();
		this.name = name;
		count++;
	}
	
	public UUID getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
