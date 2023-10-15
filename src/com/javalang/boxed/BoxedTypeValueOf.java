package com.javalang.boxed;

/**
 * valueOf return 1 object, 1 instance của lớp đóng gói kiểu data primitive
 * Integer.valueOf(5) trả về 1 đối tượng kiểu Integer có giá trị là 5
 * parse<TypePrimitive>: trả về kiểu primitive
 * Integer.parseInt("123") trả về giá trị nguyên thủy là 123
 * */
public class BoxedTypeValueOf {
	/**
	 * int	- Integer
	 * long - Long
	 * double	- Double
	 * byte	- Byte
	 * short	- Short
	 * float	- Float
	 * boolean	- Boolean
	 * char	- Character
	 * */
	/**
	 * hiệu suất và hiệu quả: 
	 * Một số lớp đóng gói như Integer, Long sử dụng cache cho một phạm vi nhất định của giá trị (thường là -128 đến 127)
	 * khi sử dụng valueOf.
	 * Điều này có thể giúp giảm bớt việc tạo ra nhiều đối tượng không cần thiết khi chuyển đổi các giá trị trong phạm vi đó
	 * Do đó, nếu bạn biết rằng giá trị của bạn thường nằm trong phạm vi này và bạn cần một đối tượng, việc sử dụng valueOf 
	 * có thể là một lựa chọn hiệu quả hơn về bộ nhớ.
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer boxedInt = Integer.valueOf(135);
		Character boxedChar = Character.valueOf('v');
		Byte boxedByte = Byte.valueOf((byte)5);
		
		System.out.print(boxedInt);
		System.out.print(boxedChar);
		System.out.println(boxedByte);
		
		int convertedInt = convertInt("1234");
		long convertedLong = convertLong("123456789123456789");
		//unwrap
		System.out.println(convertedInt);
		System.out.println(convertedLong);
	}
	private static int convertInt(String s) {
		Integer boxedInt;
		try {
			boxedInt = Integer.valueOf(s);
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage() + ". We don't accept an invalid number.");
			boxedInt = Integer.valueOf(1);
		}
		return boxedInt.intValue();
	}
	private static long convertLong(String s) {
		Long boxedLong;
		try {
			boxedLong = Long.valueOf(s);
		} catch (Exception e) {
			System.out.println(e.getMessage() + ".We don't accept an invalid number.");
			boxedLong = Long.valueOf(1);
		}
		return boxedLong.longValue();
	}
}
