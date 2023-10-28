package com.oop.accessmodifier.p1;

import java.util.UUID;
/**
 * A1 và A2 ở cùng package, ngoại trừ private ra, còn lại điều có thể access
 * */
public class A2 {
	String dept;
	
	UUID getId() {
		A1 a1 = new A1();
		return a1.getId();//id là private, khg thể access, phải thông qua public method
	}
	
	String getName() {
		A1 a1 = new A1("Kingdom");
		return a1.defaultName;//name là default, cùng package có thể access
	}
	
	int getSalary() {
		A1 a1 = new A1("Kingdom", 123000);
		return a1.protectedSalary;//salary là protected, cùng package cũng có thể access
	}
}
