package com.array;

public class StringToChar {

	public static void main(String[] args) {

		String s = "zzzzxxxxxxx";

		char[] ch = new char[s.length()];

		for (int i = 0; i < s.length(); i++) {

			ch[i] = s.charAt(i);
		}

		for (char c : ch) {

			System.out.println(c);
		}
	}

}
