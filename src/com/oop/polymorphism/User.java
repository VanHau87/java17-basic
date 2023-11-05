package com.oop.polymorphism;

public class User {
	protected String className = "User";
	public void printType() {
		System.out.println("Come from User class");
	}
	public void saveWebLink() {
		System.out.println("User: saveWebLink");
		//postAReview();
	}

	protected Review postAReview(String reviewText) {
		//System.out.println("USer: postAReview");
		Review review = new Review(reviewText);
		return review;
	}
}
