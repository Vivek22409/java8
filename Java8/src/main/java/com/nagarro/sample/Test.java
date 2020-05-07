package com.nagarro.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String arg[]) {
		List<String> lis = new ArrayList<String>();
		lis.add("one");
		lis.add("two");
		lis.add("three");

		Collections.sort(lis, (r1, r2) -> r1.compareTo(r2));

		lis.forEach(e -> System.out.println(e));
	}

}
