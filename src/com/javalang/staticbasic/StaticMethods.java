package com.javalang.staticbasic;

import com.javalang.utils.Employee;

public class StaticMethods {
	static Employee employee;//null
	static String employee2 = getEmployeeName();

	static {
		try {
			employee = new Employee("Bành Văn");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	private static String getEmployeeName() {
		try {
			employee = new Employee("Lý Hà");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
	
}
