package com.java.prep.string;

public class RemoveSpaceFromString {

	public static void main(String[] args) {

		String input = "I am the best  .";
		System.out.println("Before: " + input);

		System.out.println("After: " + removeWhiteSpaces(input));
		System.out.println("Total spaces removed: " + countWhiteSpacesString(input));
	}

	public static String removeWhiteSpaces(String input) {
		StringBuilder output = new StringBuilder();

		char[] charArray = input.toCharArray();

		for (char c : charArray) {
			if (!Character.isWhitespace(c))
				output.append(c);
		}

		return output.toString();
	}

	public static int countWhiteSpacesString(String input) {

		char[] charArray = input.toCharArray();
		int count = 0;
		for (char c : charArray) {
			if (Character.isWhitespace(c)) {
				count++;
			}

		}
		return count;
	}

}
