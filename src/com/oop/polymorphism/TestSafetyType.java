package com.oop.polymorphism;

public class TestSafetyType {

	public static void main(String[] args) {
		/**
		 * static checking
		 * */
		//không thể assign 1 giá trị có type lớn hơn cho 1 biến có type nhỏ hơn
		//int f = 33.3;//compile-error
		Staff staff = new Editor();
		//reference type không chứa method approveReview()
		//staff.approveReview();//compile-error
	}

}
