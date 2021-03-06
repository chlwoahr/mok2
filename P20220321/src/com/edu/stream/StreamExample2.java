package com.edu.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample2 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("홍길동", "남자", 70,100));
		list.add(new Student("김순희", "여자", 80,120));
		list.add(new Student("김부식", "남자", 85,95));
		list.add(new Student("박한나", "여자", 88,99));
		
		
		//남자,여자 스코어+포인트 > 180점이상인 학생출력
		list.stream()
//		.filter(student -> student.score+student.point>=180)
		.sorted() // comparable구현하는 클래스.
		.forEach(student -> System.out.println(student));
		
		
//		list. // 컬렉션으로 부터
//		stream()// 스트림생성
//		.filter(student -> student.score >=80) //80점이상 필터
//		.filter(student -> student.gender.equals("여자"))
//		.forEach(student -> System.out.println(student));// 필터링된 대상을 출력
	}

}
