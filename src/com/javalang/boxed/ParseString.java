package com.javalang.boxed;

import java.util.Arrays;
import java.util.List;

public class ParseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Boxing là quá trình chuyển đổi 1234 một giá trị từ kiểu dữ liệu nguyên thủy thành một đối tượng của lớp đóng gói tương ứng";
		List<String> sList = Arrays.asList(text.split(" "));
		int result = getNumber(sList);
		System.out.println(result);
	}
	private static int getNumber(List<String> sList) {
		int unboxedInt = 0;
		for (String string : sList) {
			try {
				unboxedInt = Integer.parseInt(string);
				break;
			} catch (NumberFormatException e) {
				System.out.println(e.getMessage() + ". Đây không phải là 1 con số.");
				continue;
			}
		}
		return unboxedInt;
	}
}
