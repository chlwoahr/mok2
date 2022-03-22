package com.edu.api;

public class StringTrimExample {

	public static void main(String[] args) {
		String s = "  02     ";
		String s1 = "123     ";
		String s2 = "       12";
//		String s3 = s.trim();
//		String s4 = s1.trim();
//		String s5 = s2.trim();
//		System.out.println(s3);
//		System.out.println(s4);
//		System.out.println(s5);
		System.out.println(s.trim()+s1.trim()+s2.trim());

	}

}
