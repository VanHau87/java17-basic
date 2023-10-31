package com.oop.polymorphism;

public class TestCasting {
	public static void main(String[] args) {
		approveReview(new Staff());
		approveReview(new Editor());
	}
	public static void approveReview(Staff staff) {
		//staff.approveReview();compile error
		if (staff instanceof Editor) {
			((Editor) staff).approveReview();
		} else {
			System.out.println("invalid object passed");
		}
	}
}
