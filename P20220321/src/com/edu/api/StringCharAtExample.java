package com.edu.api;

public class StringCharAtExample {

	public static void main(String[] args) {
		String ssn = "010562-1648123";
		char sex = ssn.charAt(7);
		switch (sex) {
		case '1': System.out.println("남자");
		break;
		case '2':System.out.println("여자");
		break;
		}

	}

}
