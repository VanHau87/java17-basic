package com.oop.accessmodifier.p2;

public class TestAccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1 b1 = new B1(2);
		int b1Salary = b1.getSalary();
		B1 b2 = new B1(4);
		int b2Salary = b2.getSalary();
		System.out.println(b1Salary + ";" + b2Salary);
	}

}
