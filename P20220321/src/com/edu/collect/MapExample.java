package com.edu.collect;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		// Map :{key:value}, {key1:value1} /

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("전민욱", 80);
		map.put("김형민", 82);
		map.put("김영민", 20);
		map.put("김영민", 100);// key값 중복될경우 마지막변경값 적용
		// 컬렉션: 여러값을 저장. => 여러요소 접근.
		Integer val = map.get("김영민");
		System.out.println(val);

		Set<String> keyset = map.keySet(); // map컬렉션에 저장된 요소들의 키에 해당 값을 set컬렉션에 담아줌
		// 1)
		Iterator<String> iter = keyset.iterator();

//		while (iter.hasNext()) {
//			String key = iter.next();
//			Integer value = map.get(key);
//			System.out.printf("key: %3s value:%3d\n", key, value);
//		}
		
		// 2) for(:) 확장for
		for(String key : keyset) {
			Integer value =  map.get(key);
			System.out.printf("key: %3s value:%3d\n", key, value);
		}
		
		System.out.println("end");

	}

}
