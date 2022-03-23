package com.edu.collect;

import java.util.ArrayList;

public class ListExample {

	public static void main(String[] args) {
		String[] strings = new String[10];
		ArrayList<String> strAry = new ArrayList<String>();
		strAry.add("Hello");
		strAry.add("world"); //추가
		strAry.set(1, "월드"); // 수정
		strAry.get(1); // 갖고옴
		strAry.clear(); // 한번에 다삭제
		System.out.println(strAry.size());
		for (int i =0;i<strAry.size();i++) {
		String result =strAry.get(i);
		
		System.out.println(result);
		}
		
//		ArrayList<Integer> numAry = new ArrayList<Integer>();
//		for(int i=0;i<numAry.size();i++) {
//			int result = numAry.get(i);
//		}
	}

}
