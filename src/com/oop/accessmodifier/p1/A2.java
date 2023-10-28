package com.oop.accessmodifier.p1;

public class A2 {
	String className;
	
	public void accessFrom() {
		A1 a1 = new A1();
		//a1.id;//không thể access
		a1.defaultName = "default name from class cha";
		a1.protectedSalary = 1234;
	}
}
