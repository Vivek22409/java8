package com.nagarro.demo;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {
	
	public static void main(String arg[]) {
		
		/*List<String> list = Arrays.asList("Sonu","Monu","Johnu","Tonu");
		
		Stream<String> stream = list.stream();
		
		stream.forEach(System.out::println);
		
		list.stream().forEach(str->System.out.println(str));*/
		//List<String> myList = Arrays.asList("a", "b");
		
		List<List<String>> list = Arrays.asList(
				  Arrays.asList("a"),
				  Arrays.asList("b"));
				System.out.println(list);
		
				  
				//assertEquals(asList("A", "B"), myList);
		System.out.println(list.stream().map(Collection::stream)
				  .collect(Collectors.toList()));
		
		
		
		System.out.println(list
				  .stream()
				  .flatMap(Collection::stream)
				  .collect(Collectors.toList()));
		
	}

}
