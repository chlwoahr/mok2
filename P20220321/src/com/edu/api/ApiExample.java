package com.edu.api;

public class ApiExample {

	public static void main(String[] args) {
		IDCheck idcheck = new IDCheck();
		String result = idcheck.getGender("9112232131223");
		System.out.println(result);
		result = idcheck.getGender("123123-2131231");
		System.out.println(result);
		

		
		
	}

}
