package com.javalang.finalvariables;

import com.javalang.utils.Employee;

public class WorkingHours {
	/**
	 * hằng số trong java: final + data-type + name_variable = value
	 * data type: primitive hay String
	 * */
	/*
	 * biến final phải gán giá trị rõ ràng vì nó không có giá trị mặc định
	 * một khi đã khởi tạo giá trị rùi thì không thể thay đổi
	 * biến final thuộc về instance,không thuộc về class
	 * */
	final int WORKING_HOURS = 8;//at the time of declaration
	final int HALF_DAY;
	final int OVER_TIME;
	Employee employee;
	{
		HALF_DAY = 4;//inside instance initializer
	}
	/**
	 * TRONG TRƯỜNG HỢP CLASS CÓ NHIỀU CONSTRUCTORS THÌ MỖI CONSTRUCTOR PHẢI ĐẢM BẢO BIẾN FINAL ĐƯỢC KHỞI TAO5GIA1 TRỊ
	 * */
	public WorkingHours(int overTime, Employee employee) {
		this.OVER_TIME = overTime;// inside constructor
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "[workingHours=" + WORKING_HOURS + ", halfDay=" + HALF_DAY + ", overTime=" + OVER_TIME
				+ ", employee=" + employee.getName() + "]";
	}
	
	
}
