package com.nagarro.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.nagarro.demo.Human;

public class ColectorsDemo {
	
	public static void main(String arg[]) {
		
		Human h1 = new Human("vivek");
		Human h2 = new Human("rahul");
		Human h3 = new Human("mannat");
		Human h4 = new Human("rahil");
		h1.setAge(10);
		h2.setAge(15);
		h3.setAge(20);
		h4.setAge(20);
		
		List<Human> l = Arrays.asList(h1,h2,h3,h4);
		
		Optional<Human> opt1 = l.stream().filter(h -> h.getAge()>10).min(Comparator.naturalOrder());
		
		System.out.println(opt1);
		
		Optional<Human> opt2 = l.stream().filter(h -> h.getAge()>10).max(Comparator.naturalOrder());
		
		System.out.println(opt2);
		
		
		Map<Integer,List<Human>> map1 = l.stream().collect(Collectors.groupingBy(Human::getAge));
		System.out.println("map1"+map1);
		//downstreamcollectors
		Map<Integer,Long> map2 = l.stream().collect(Collectors.groupingBy(Human::getAge,Collectors.counting()));
		System.out.println("map2"+map2);
		
		Map<Integer,List<String>> map3 = l.stream().collect(Collectors.groupingBy(Human::getAge,Collectors.mapping(Human::getName,Collectors.toList())));
		System.out.println("map3"+map3);
		
		Map<Integer,Set<String>> map4 = l.stream().collect(Collectors.groupingBy(Human::getAge,Collectors.mapping(Human::getName,Collectors.toCollection(TreeSet::new))));
		System.out.println("map4"+map4);
		
		
		Map<Integer,String> map5= l.stream().collect(Collectors.groupingBy(Human::getAge,Collectors.mapping(Human::getName,Collectors.joining(", "))));
		System.out.println("map5"+map5);
	}

}
