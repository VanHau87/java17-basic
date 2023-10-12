package com.javalang.finalvariables;

import com.javalang.utils.Employee;

public class TestFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee("Minh Ha");
		WorkingHours wh = new WorkingHours(3, emp);
		System.out.println(wh);
	}

}
