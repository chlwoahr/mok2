package com.edu.api;

import java.lang.reflect.Method;

public class ClassExample {

	public static void main(String[] args) {
		// string, system, member > 관리하는 class(class);
		
		Class cls = String.class;
		try {
			cls = Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		System.out.println(cls.getName());
		System.out.println(cls.getSimpleName());
		System.out.println(cls.getMethods());
		Method[] methods = cls.getMethods();
//		for(Method met : methods) {
//			System.out.println(met.getName());
//		}
		
		
		cls = Member.class;
		
		String path = cls.getResource("ClassExample.class").getPath();
		System.out.println(path);
		
	}

}
