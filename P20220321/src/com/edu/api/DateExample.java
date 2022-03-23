package com.edu.api;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;

public class DateExample {
	public static void main(String[] args) {
		Date today = new Date();
		today.setYear(120); // setyear 기준 1900년
		System.out.println(today);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년MM월dd일 hh시mm분ss초");
		System.out.println(sdf.format(today));
		
		LocalDateTime time = LocalDateTime.now();
		System.out.println(time.getYear());
		
	}
}
