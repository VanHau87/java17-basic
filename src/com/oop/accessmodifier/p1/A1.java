package com.oop.accessmodifier.p1;

import java.util.UUID;

public class A1 {
	private UUID id;
	String defaultName;
	protected int protectedSalary;
	
	public A1() {
		this.id = UUID.randomUUID();
	}

	public A1(String name) {
		this.id = UUID.randomUUID();
		this.defaultName = name;
	}
	
	public A1(String name, int salary) {
		this.id = UUID.randomUUID();
		this.defaultName = name;
		this.protectedSalary = salary;
	}

	public UUID getId() {
		return id;
	}
	
}
