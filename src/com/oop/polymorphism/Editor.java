package com.oop.polymorphism;

public class Editor extends Staff{
	public void printType() {
		System.out.println("Come from Editor class");
	}
	public void approveReview() {
		System.out.println("Editor: approveReview");
	}
}
