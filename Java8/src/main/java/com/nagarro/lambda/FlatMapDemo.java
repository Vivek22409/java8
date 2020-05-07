package com.nagarro.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class FlatMapDemo {
	
	public static void main(String arg[]) {
		
		List<Integer> l1 = Arrays.asList(1,2,3,4,5,6,7);
		List<Integer> l2 = Arrays.asList(2,4,6);
		List<Integer> l3 = Arrays.asList(1,3,5);
		
		
		List<List<Integer>> l = Arrays.asList(l1,l2,l3);
		
		System.out.println(l);
		
		Function<List<?>,Integer> size = List::size;
		
		Function<List<Integer>,Stream<Integer>> flatMapper = li->li.stream();
		
		
		//l.stream().map(list->list.size()).forEach(System.out::println);
		l.stream().flatMap(flatMapper).forEach(System.out::print);
	}

}
