package com.java.prep.string;

public class PalindromeCheck {

	public static void main(String[] args) {

		String input = "MAHESHSEHAM";

		System.out.println("isPalindrome = " + isPalindrome(input));

	}

	public static boolean isPalindrome(String input) {
		boolean result = true;
		int length = input.length();

		for (int i = 0; i < length / 2; i++) {
			
			System.out.println(input.charAt(i) + " != " + input.charAt(length-i-1));
			if (input.charAt(i) != input.charAt(length - i - 1)) {
				result = false;
				break;
			}
		}

		return result;  
	}

}
