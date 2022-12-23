package com.java.prep.string;

public class StringContainsVowels {

	public static void main(String[] args) {
		System.out.println(stringContainsVowels("Mahesh")); // true
		System.out.println(stringContainsVowels("TVS")); // false
	}

	public static boolean stringContainsVowels(String input) {
		return input.toLowerCase().matches(".*[aeiou].*");
	}

}