package com.edu.collect;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		
		Student s1 = new Student(101,"홍",20,30);
		Student s2 = new Student(101,"김",30,40);
		Student s3 = new Student(102,"이",40,50);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		Student result = list.get(0);
		System.out.println(result.toString());
		list.set(0, new Student(201,"스",100,80)); // 전체변경
		result = list.get(0);
		list.get(0).setE(100); //첫번째 있는인스턴스 값을 바꿈
		list.get(0).setK(100);
		list.remove(0);//비워지지않고 있는값들로 채워짐
		System.out.println(result.toString());
		
		
		
	}

}
