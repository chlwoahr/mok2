package com.edu.api;

public class StringEqualsExample {
	public static void main(String[] args) {
		String v = new String("신");
		String v1 = "신";
		
		
		if(v==v1) {
			System.out.println("같은 String객체를 참조");
		}else {
			System.out.println("다른 String객체를 참조");
		}
		
		
		
		if(v.equals(v1)) {
			System.out.println("같은 문자열을 가짐");
		}else {
			System.out.println("다른문자열을 가짐");
		}
		
	}
}
