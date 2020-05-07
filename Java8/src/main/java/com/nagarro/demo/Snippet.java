package com.nagarro.demo;

public class Snippet {
	public static int getNumber(String number) {
		return number.chars().reduce(0, (a, b) -> 10 * a + b - '0');
	}

	public static void main(String arg[]) {
		int i = getNumber("2345");
		System.out.println(i);

	}
}
