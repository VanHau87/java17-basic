package com.oop.polymorphism;

public class Review {
	private String reviewText;
	private boolean approved;
	public Review(String reviewText) {
		this.reviewText = reviewText;
	}
	public boolean isApproved() {
		return approved;
	}
	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	@Override
	public String toString() {
		return "Review [reviewText=" + reviewText + ", approved=" + approved + "]";
	}
	
}
