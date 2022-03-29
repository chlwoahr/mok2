package com.test;

import java.util.Scanner;

// 문제5) Book클래스를 선언(필드:책제목, 저자, 출판사, 금액) private
//      생성자(책제목, 저자, 출판사, 금액)를 선언 후 Scanner클래스를 사용하여 사용자의 입력을 통하여 인스턴스를 생성하고 
//      입력한 내용을 책제목, 저자, 출판사, 금액 정보를 화면에 출력하는 기능 구현.
public class Exam05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Book a1 = new Book();
		System.out.println("책제목 입력");
		String aa = scn.next();
		a1.setModel(aa);
		System.out.println("저자 입력");
		String bb = scn.next();
		a1.setBookJj(bb);
		System.out.println("출판사 입력");
		String cc = scn.next();
		a1.setBookCc(cc);
		System.out.println("금액 입력");
		int dd = scn.nextInt();
		a1.setBookMm(dd);
		
		System.out.println(a1.bookInFo());
		
		
		
	}
}
