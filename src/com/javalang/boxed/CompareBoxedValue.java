package com.javalang.boxed;

public class CompareBoxedValue {
	static Integer integer;
	static void unbelievable() {
		if (integer == 0) {
			//khi so sánh, compiler sẽ unbox integer trước rùi mới so sánh
			//do integer khg có khởi tạo giá trị, nghĩa là null, nên unbox sẽ bị lỗi
			System.out.println("true");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		unbelievable();
	}

}
