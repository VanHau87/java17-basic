package com.oop.accessmodifier.p2;

import com.oop.accessmodifier.p1.A1;

public class B1 extends A1{
	String className;
	
	
	public B1() {
		//this.id;//không thể thừa kế
		//this.defaultName = "from class cha";//không thể thừa kế
		this.protectedSalary = 1234;
	}
	public void accessFrom() {
		A1 a1 = new A1();
		//a1.id;//không thể access
		//a1.defaultName;//không thể access
		//a1.protectedSalary;//không thể access
	}
	@Override
	public String toString() {
		return "B1 [protectedSalary=" + protectedSalary + "]";
	}

}
