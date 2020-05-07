package com.nagarro.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReductionDemo {
	
	public static void main(String arg[]) {
		List<Integer> l = Arrays.asList(1,5,9);
		
		//int red = l.stream().reduce(0,Integer::max);
		Optional<Integer> red = l.stream().reduce(Integer::max);
		
		System.out.println(red);	
		
	}

}
