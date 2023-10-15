package com.javalang.boxed;

public class BoxedAndUnBoxed {
	/**
	 * kiểu primitive sẽ tốn ít bộ nhớ và hiệu suất cao hơn so với wrapper class
	 * so sánh == và != là so sánh giá trị với primitive, nhưng là so sánh tham chiếu với kiểu đối tượng
	 * so sánh <,>, <=, >= thì sẽ có hiện tượng auto unbox nếu dùng cho đối tượng của các lớp đóng gói
	 * lưu ý khi so sánh các đối tượng thì nên implement Comparable
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Long number = 0l;
		number += 1;
		/**
		 * dòng này, compiler sẽ thực hiện 3 thao tác
		 * 1. unbox -> lấy giá trị 5 ra
		 * 2. cộng 12
		 * 3. box -> tạo ra 1 instance mới của wrapper class Long
		 * */
		System.out.println(number);
		long n1 = wrapperClass();
		System.out.println(n1);
		long n2 = primitive();
		System.out.println(n2);
		System.out.println(n1/n2);
	}
	public static long wrapperClass() {
		long start = System.nanoTime();
		Long num = 0l;
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			num += i;
		}
		return System.nanoTime() - start;
	}
	public static long primitive() {
		long start = System.nanoTime();
		long num = 0l;
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			num += i;
		}
		return System.nanoTime() - start;
	}
}
