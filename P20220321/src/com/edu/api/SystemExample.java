package com.edu.api;

public class SystemExample {

	public static void main(String[] args) {
		System.out.println("start");
//		System.exit(0); // 프로그램강제종료
		System.out.println("end");

		
		long currenttime = System.currentTimeMillis(); //현재시간을 1970.1.1
		System.out.println(currenttime);
		long days = currenttime/(24*60*60*1000);
		System.out.println(days);
		long years = days/365;
		System.out.println(years);
		
		
		currenttime = System.currentTimeMillis();
		long sum = 0;
		for(int i=0;i<100000000;i++) {
			sum += i;
		}
		System.out.println("summary:"+sum);
		long endTime = System.currentTimeMillis();
		System.out.println("연산에걸린시간:"+(endTime - currenttime));
		
		
	}

}
