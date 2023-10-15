package com.javalang.boxed;

/**
 * không thể trực tiếp cast string thành char được mà phải dùng charAt
 * Character có các method thường dùng, được chia làm 3 nhóm chính:
 * 1. Kiểm tra tính chất của ký tự
 * 2. Chuyển đổi ký tự
 * 3. Khác
 * */
public class UtilityMethodsCharacter {
	static String text = "Character.MAX_VALUE1";
	
	public static void main(String[] args) {
		boolean checkLetters = checkLetters(text);
		System.out.println(checkLetters);
		boolean checkDigits = checkDigits(text);
		System.out.println(checkDigits);
		Condition result = isQualifiedCondition(text);
		System.out.println(result);
	}
	private static boolean checkLetters(String s) {
		boolean isAllLetters = true;
		for (int i = 0; i < s.length(); i++) {
			if(!Character.isLetter(s.charAt(i))) {
				isAllLetters = false;
			}
		}
		return isAllLetters;
	}
	private static boolean checkDigits(String s) {
		boolean containedDigit = false;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				containedDigit = true;
			}
		}
		return containedDigit;
	}
	/**
	 * ngoài ra còn các methods khác:
	 * 		isLetterOrDigit: Kiểm tra xem ký tự có phải là một chữ cái hoặc chữ số hay không.
	 * 		isLowerCase: Kiểm tra xem ký tự có phải là chữ thường hay không.
	 * 		isUpperCase: Kiểm tra xem ký tự có phải là chữ hoa hay không.
	 * 		isWhitespace: Kiểm tra xem ký tự có phải là khoảng trắng hay không.
	 * 		isSpaceChar: Kiểm tra xem ký tự có phải là một ký tự không in được hay không (như dấu cách, tab,...).
	 * 		compare(char x, char y): So sánh hai ký tự theo thứ tự từ điển.
	 * 		getNumericValue: Lấy giá trị số học của một ký tự, ví dụ: '4' trả về 4.
	 * 		getType(char ch): Lấy loại ký tự (như chữ cái, chữ số, dấu câu,...) theo phân loại Unicode.
	 * */
	private static Condition isQualifiedCondition(String s) {
		Condition condition = new Condition();
		for (int i = 0; i < s.length(); i++) {
			int type = Character.getType(s.charAt(i));
			switch (type) {
			case Character.UPPERCASE_LETTER:
				++condition.upperCase;
				break;
			case Character.LOWERCASE_LETTER:
				++condition.lowerCase;
				break;
			case Character.DECIMAL_DIGIT_NUMBER:
				++condition.digit;
				break;
			case Character.OTHER_PUNCTUATION,
				 Character.CONNECTOR_PUNCTUATION:
				++condition.punctuation;
				break;
			default:
				break;
			}
		}
		condition.total = s.length();
		return condition;
	}
}
