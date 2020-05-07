package com.nagarro.time;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;


public class TimeDemo {
	
	public static void main(String arg[]) throws InterruptedException, ParseException {
		
		//Java7		
		/*DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		Date date1 = df.parse("18-08-2018");
		Date date2 = df.parse("19-08-2018");
		
		System.out.println(date1);
		
		String str = df.format(date1);
		
		System.out.println(str);
		
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		
		c1.setTime(date1);
		c2.setTime(date2);
		
		long millis = c2.getTimeInMillis() - c1.getTimeInMillis();
		
		System.out.println("*"+millis/(1000*60*60*24));
		
		System.out.println(c1.getTimeInMillis());*/
		
		//Java8
		Instant now = Instant.now();
		Thread.sleep(1000);
		Instant end = Instant.now();
		
		Duration timeElapse = Duration.between(now,end);
		
		System.out.println(now);
		
		System.out.println("Nanos "+timeElapse.toNanos());
		
		LocalDate startDate = LocalDate.of(2018,8,15);
		LocalDate endDate = LocalDate.now();
		
		System.out.println(endDate);
		
		Period period = startDate.until(endDate);
		
		System.out.println("Days "+period.getDays());
		
		LocalTime lt = LocalTime.now();
		
		System.out.println(lt);
		
		
		
		
		
	}

}
