package com.javalang.boxed;

import java.text.DecimalFormat;

public class MaxMinValue {
	/**
	 * Double.MIN_VALUE
	 * Float.MIN_VALUE
	 * 	cả 2 giá trị này điều gần như bằng không và chúng là giá trị dương, khg phải số âm
	 * ngoài ra thì:
	 * Byte, Short, Character điều có giá trị Max và Min với min là số âm nhỏ nhất mà nó có thể chứa
	 * */
	public static void main(String[] args) {
		formatNumber(Long.MAX_VALUE);
		formatNumber(Long.MIN_VALUE);
		formatNumber(-Double.MIN_VALUE);
	}
	public static void formatNumber(Number number) {
		DecimalFormat df = new DecimalFormat("#");
		df.setMaximumFractionDigits(850);
		String output = df.format(number);
		System.out.println(output);
	}
}
