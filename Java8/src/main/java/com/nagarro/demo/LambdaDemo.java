package com.nagarro.demo;

@FunctionalInterface
interface A {
	public int display();

}

public class LambdaDemo {
	public static void main(String arg[]) {
		A a = () -> {
			System.out.println(1);
			return 1;
		};

	}
}
