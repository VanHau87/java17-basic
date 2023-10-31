package com.oop.polymorphism;

public class TestPolymorphsm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User refUser = new Editor();
		//user.approveReview;//compile error
		((Editor) refUser).approveReview();
		
		//refUser.postAReview();
		Editor editor = new Editor();
		editor.approveReview();
		Staff staff = new Staff();
		User user = new User();
		print(refUser);
		print(staff);
		print(editor);
		print(user);
		editor.postAReview();
		refUser.saveWebLink();
		
	}
	public static void print(User user) {
		user.printType();
	}
}
