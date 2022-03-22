package com.edu.api;

public class StringReplaceExample {

	public static void main(String[] args) {
		String s = "자바는 객체 지향 언어입니다. 자바는 풍부한 API를 지원합니다";
		String s1 = s.replace("자바","java" );
		System.out.println(s);
		System.out.println(s1);

	}

}
