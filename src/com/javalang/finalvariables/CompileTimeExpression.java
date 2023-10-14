package com.javalang.finalvariables;

public class CompileTimeExpression {
	/**
	 * compile-time constant expression: là 1 biểu thức có giá trị được xác định tại thời điểm biên dịch, khg phải runtime
	 * nói cách khác: giá trị của nó được xác định trước khi chương trình chạy
	 * */
	int gap = 2;
	final int minAge = 18; //constant variable
	final int gapAge = 23 + gap;
	static final String month2;
	static {
		month2 = "Jan";
	}
	static final String firstMonth = "Jan";
	private static void switchExample() {
		/**
		 * in switch-case: case phải là 1 constant expression
		 * */
		
		switch (month2) {
		case firstMonth: //must be a constant expression
			System.out.println("Tháng 1");
			break;

		default:
			System.out.println("Các tháng còn lại");
			break;
		}
	}
	public static void main(String[] args) {
		switchExample();
	}
}
