package com.edu.api;

import java.util.ArrayList;
import java.util.HashSet;

public class MemberExample {
	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");

		if (obj1.equals(obj2)) {
			System.out.println("같습니다");
		} else {
			System.out.println("다릅니다.");
		}
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());

		// if(obj1.equals(obj2)) {
//		System.out.println("obj는 동등합니다.");
//	}else {
//		System.out.println("obj는 다릅니다");
//	}
		// 배열 > 컬렉션(ArrayList, HashSet, HashMap) : 여러개의 값저장

//		Member[] memberAry = new Member[5]; // 맴버의 최대인스턴스 최대 5개 저장
//											// 크기초과하면 새로운 배열 선언. 복사
//
//		ArrayList<Member> memList = new ArrayList<Member>();
//		memList.add(new Member("user1", "홍길동"));
//		memList.add(new Member("user1", "홍길동"));
//		for (int i = 0; i < memList.size(); i++) {
//			System.out.println(memList.get(i));
//		}
//		HashSet<Member> memSet = new HashSet<Member>();
//		memSet.add(new Member("user1", "홍길동")); // hashCode(), equals()
//		memSet.add(new Member("user1", "홍길동"));
//		System.out.println(memSet.size());
	}
}
