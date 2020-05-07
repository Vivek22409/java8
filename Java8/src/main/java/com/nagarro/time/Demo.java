package com.nagarro.time;

public class Demo {

	enum test {

		abc("hello","sa"), ghi("blue",""), jkl("green","");
		String s;
		String s1;

		test(String s,String s1) {
			this.s = s;
			this.s1 = s1;
		}

		public String getValue() {
			return s+s1;
		}

	}
	public static void main(String arg[]) {
		System.out.println(test.abc.getValue());
	}

}
