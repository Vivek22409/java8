package com.nagarro.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

interface Myinterface {
	default void showResult() {
		System.out.println("Result shown...Yes !");;
		
		
	}
}

public class CanWeDefaultMethodInLambda {

	public static void main(String[] arg) {
		String[] sArr = {"rihan","aman","vinod","vivek"};
		
		List<String> list = Arrays.asList(sArr);
		
		
		List<String> listModified = list.stream().filter(str-> str.equals("aman")).collect(Collectors.toList());
		
		System.out.println(listModified);
		
		Stream<String> stream = Stream.of("vivek","rohan","sohan");
		
		Stream anotherStream= stream.filter(string -> !string.equals("rohan"));
		
		anotherStream.forEach(s->System.out.println(s));
		
	}
}
