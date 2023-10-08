package com.javalang.staticbasic;

import com.javalang.utils.Student;

public class CountByInstanceInitializer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("St1");
		Student s2 = new Student();
		Student s3 = new Student("St1");
		Student s4 = new Student();
		Student s5 = new Student("St1");
		System.out.println("###############");
		System.out.println(s1.getId());
		System.out.println(s2.getId());
		System.out.println(s3.getId());
		System.out.println(s4.getId());
		System.out.println(s5.getId());
	}

}
