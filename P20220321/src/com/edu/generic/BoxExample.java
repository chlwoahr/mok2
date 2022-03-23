package com.edu.generic;

import java.util.ArrayList;
import java.util.List;

public class BoxExample {

	public static void main(String[] args) {
//		Box box = new Box();
//		box.setObj("Hello");
//		String result = (String) box.getObj();//string>string
//		System.out.println(result);
//		Integer result1 = (Integer) box.getObj();//string>integer
//		System.out.println(result1);//
		Box<String> stringBox = new Box<String>();
		stringBox.setObj("hello");
		String result = stringBox.getObj();
		
		Box<Integer> intBox = new Box<Integer>();
		intBox.setObj(100);
		System.out.println(result);
		Integer result1 = intBox.getObj();
		
		ArrayList<Integer> inAry = new ArrayList<Integer>();
		
	}

}
