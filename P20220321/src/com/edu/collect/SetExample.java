package com.edu.collect;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>(); // 중복값 허용x, 순서없이 저장
		set.add("Hello");
		set.add("World");
		set.add("World");
		set.add("Good");
		set.add("World");

		set.remove("Good");

//		System.out.println(set.size());

		Iterator<String> iter = set.iterator(); // 반복
		while (iter.hasNext()) {
			String result = iter.next();
			System.out.println(result);
		}
//		System.out.println("end of prog");

	}

}
