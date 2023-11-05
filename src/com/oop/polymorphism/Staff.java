package com.oop.polymorphism;

public class Staff extends User{
	protected String className = "Staff";
	public void printType() {
		System.out.println("Come from Staff class");
	}
	protected Review postAReview(String reviewText) {
		//System.out.println("Staff: postAReview");
		//Review review = new Review(reviewText);
		Review review = super.postAReview(reviewText);
		review.setApproved(true);
		return review;
	}
	
}
