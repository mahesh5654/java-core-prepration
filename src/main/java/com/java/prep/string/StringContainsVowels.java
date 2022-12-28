package com.java.prep.string;

public class StringContainsVowels {

	public static void main(String[] args) {
		System.out.println(stringContainsVowels("Mahesh")); // true
		System.out.println(stringContainsVowels("TVS")); // false

		stringContainsVowelsMannual("Mahesh");
		stringContainsVowelsMannual("TVS");
	}

	public static boolean stringContainsVowels(String input) {
		return input.toLowerCase().matches(".*[aeiou].*");
	}

	public static void stringContainsVowelsMannual(String input) {

		char vowel[] = { 'a', 'e', 'i', 'o', 'u' };
		char inputs[] = input.toLowerCase().toCharArray();
		int count = 0;

		for (int i = 0; i < input.length(); i++) {
			for (int j = 0; j < vowel.length; j++) {
				if (vowel[j] == inputs[i]) {

					count++;
				}

			}
		}

		System.out.println(count + "vowels found");

	}

}