package com.oop.polymorphism;

public class TestOverriding {

	public static void main(String[] args) {
		User user = new User();
		Review postAReview = user.postAReview("Review from :" + user.className);
		System.out.println(postAReview);
		Staff staff = new Staff();
		Review postAReview2 = staff.postAReview("Review from :" + staff.className);
		System.out.println(postAReview2);
	}

}
