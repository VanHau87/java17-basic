package com.oop.accessmodifier.p1;

public class A3 extends A1{
	String className;

	public A3() {
		//this.id;// không thể thừa kế
		this.defaultName = "From class cha";
		this.protectedSalary = 124;
	}
	public void accessFrom() {
		A1 a1 = new A1();
		//a1.id;//không thể access
		a1.defaultName = "default name from class cha";
		a1.protectedSalary = 1234;
	}
	@Override
	public String toString() {
		return "A3 [defaultName=" + defaultName + ", protectedSalary=" + protectedSalary + "]";
	}
	
	
}
