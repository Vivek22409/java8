package com.nagarro.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class FunctionalInterfacesDemo {
	
	public static void main(String arg[]) {
		
		
		List<String> l1 = Arrays.asList("one","two","three","four");		
		
		List<String> l2 = new ArrayList<>();
		
		Consumer<String> c1 = System.out::println;		
		Consumer<String> c2 = s-> l2.add(s);
		
		l1.forEach(c1);
		
		l1.forEach(c1.andThen(c2));
		
		System.out.println(l2.size());
	}

}
