package com.nagarro.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Java8Demo {
	
	public static void main(String arg[]) {
		
		List<String> list = Arrays.asList("abc","def","ghi","jkl");
		
		String str = list.stream().filter(s->(!s.contains("e"))).collect(Collectors.joining(","));		
		System.out.println(str);
		
	}

}
