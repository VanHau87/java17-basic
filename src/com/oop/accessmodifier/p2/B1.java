package com.oop.accessmodifier.p2;

import java.util.UUID;

import com.oop.accessmodifier.p1.A1;

/**
 * B1 thừa kế A1, nên B1 cũng sẽ thừa kế các thuộc tính của A1 ngoại trừ private, default
 * B1 và A1 khác package nên chỉ có thể truy cập được public 
 */
public class B1 extends A1{
	String address;
	int basic;
	
	
	public B1(int basic) {
		this.basic = basic;
	}

	/**
	 * method này có cả ở superclass, cùng tên và kiểu trả về, đây là override
	 * không cần thiết phải có annotation @Override
	 * access modifier phải luôn lớn hơn hoặc bằng lớp cha
	 * */
	public UUID getId() {
		//this.id; //không thể kế thừa vì id là private
		//this.defaultName; //không thể kế thừa vì defaultName là default
		this.getId();//có thể kế thừa
		A1 a1 = new A1();
		//a1.id; //không thể truy cập vì id là private
		//a1.defaultName;//không thể truy cập vì là default
		return a1.getId();//có thể truy cập
	}
	
	/**
	 * khác package nên không thể lấy được defaultName
	 * */
	String getName() {
		A1 a1 = new A1("AB");
		return String.valueOf(a1.getId());
	}
	
	int getSalary() {
		A1 a1 = new A1();
		//a1.protectedSalary;//không thể truy cập
		if (this.basic <= 3) {
			this.protectedSalary = basic * 3;//có thể kế thừa
		} else {
			this.protectedSalary = basic * 2;
		}
		return this.protectedSalary;
	}
}
