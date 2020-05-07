package com.nagarro.streams;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Optional;

import com.nagarro.demo.Person;

public class OptionalDemo {
	public static void main(String arg[]) {
		Optional<Integer> optional1 = Optional.of(5);
		Optional<Integer> optional2 = Optional.empty();
		Optional<Integer> optional3 = Optional.ofNullable(null);
		
		if(optional3.isPresent())
			System.out.println(optional3.get());
		else
			System.out.println("value doesn't exist");
		
		//optional with class
		Optional<String> stringOptional = Optional.empty();
		
		String resultString1 = stringOptional.orElse(new String());
		
		System.out.println(resultString1);
		
		String resultString2 = stringOptional.orElseThrow(IllegalStateException::new);
		
		System.out.println(resultString2);
		
		//optional using filter
		Person p = new Person("vivek",LocalDate.of(1995, 6, 1));
		Optional<Person> strOptional = Optional.of(p);
		
		//strOptional.filter(p -> "java".equals(person.getName())).ifPresent(p::getName);
		
	}
}
