package com.oop.polymorphism;

public class User {
	public void printType() {
		System.out.println("Come from User class");
	}
	public void saveWebLink() {
		System.out.println("User: saveWebLink");
		postAReview();
	}

	private void postAReview() {
		System.out.println("USer: postAReview");
	}
}
