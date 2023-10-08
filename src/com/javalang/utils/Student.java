package com.javalang.utils;

import java.util.UUID;

public class Student {
	private UUID id;
	private String name;
	private static int countStudent;
	/**
	 * khối code này được gọi là Instance Initializer
	 * nó sẽ chạy mỗi lần constructor được gọi, và chạy trước contructor
	 * bất kể contructor nào được gọi, nó điều chạy trước contructor
	 * */
	{
		++countStudent;
		if (countStudent <= 4)
			System.out.println("Welcome student number " + countStudent + " join our university");
		else 
			System.out.println("Sorry, the system cannot create new student");
		
	}
	{
		this.id = UUID.randomUUID();
	}

	public Student() {}
	
	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UUID getId() {
		return id;
	}

	public int getCountStudent() {
		return countStudent;
	}
	
}
