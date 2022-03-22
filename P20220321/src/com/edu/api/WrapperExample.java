package com.edu.api;

import java.util.ArrayList;

public class WrapperExample {

	public static void main(String[] args) {
		// 기본타입(int, long, double, boolean)
		// 참조타입(Interger, Long, Double, Boolean)
		// int -> Interger (boxing), interger -> int (unboxing) 
		ArrayList<Integer> ary = new ArrayList<Integer>();
		ary.add(100);
		ary.add(new Integer(200));
		
		new Integer(100).doubleValue(); // 100.0

	}

}
