package com.pud;
//Object(객체)>Class(도면)>인스턴스생성(초기화)
//학생(객체) > class student - 인스턴스생성(new student)
public class ObjectExample {

	public static void main(String[] args) {
		double num2 = 20; //자동형변환
		int num3 = (int)23.4; //강제형변환
		
		Car car = new Car(); //인스턴스생성(초기화)
		
		Student s1 = new Student(); // 초기화시점에 값을 지정. = 생성자
		s1.setStudNo(100);
		s1.setStudName("김형민");
		s1.setKorScore(90);
		s1.setEngScore(80);
		s1.setMathScore(85);
		
		System.out.println("영어점수"+s1.getEngScore());
		System.out.println("학생이름"+s1.getStudName());
		System.out.println("합계"+s1.getSumScore());
		System.out.println("평균"+s1.getAvgScore());
	}

}
