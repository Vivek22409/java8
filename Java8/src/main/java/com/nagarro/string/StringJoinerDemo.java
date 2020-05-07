package com.nagarro.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringJoiner;
import java.util.stream.Collectors;

import com.nagarro.demo.Human;

public class StringJoinerDemo {
	
	public static void main(String arg[]) {
		
		//StringJoiner new class in java 8
		StringJoiner sj = new StringJoiner(",","[","]");
		
		sj.add("abc");
		sj.add("def");
		sj.add("ghi");
		sj.add("jkl");
		
		//will print whole string along with joined ones
		System.out.println(sj.add("mno"));
		System.out.println(sj);
		
		//String join method in Java 8
		String s = String.join("-","2018","08","01");		
		System.out.println(s);
		
		//u can modify this list by set(int,value) but not add or remove
		List<String> list = Arrays.asList("java","python","erlang","ruby","scala");
		
		String str = String.join(", ", list);		
		System.out.println(str);
		//Java lambda and Streams
		String result = list.stream().map(x->x).collect(Collectors.joining("|"));		
		System.out.println(result);
		
		Set<Human> set = new HashSet<Human>();
		set.add(new Human("vivek"));	
		set.add(new Human("rahul"));
		set.add(new Human("vinod"));
		set.add(new Human("monti"));
		
		//set can aslo take stream
		String rs = set.stream().map(h -> h.getName()).collect(Collectors.joining("-", "<", ">"));
		
		System.out.println(rs);
		
	}

}
