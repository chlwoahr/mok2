package com.edu.except;

import java.util.Calendar;
import java.util.Scanner;

//class String2 extends String{
//	public final String() 상속불가능한 클래스.
//}

public class ExcptionExample2 {

	public static void main(String[] args) {
		// Object
		Object obj = new String();
		obj = new Scanner(System.in);
		obj = Calendar.getInstance();
		obj = new Object();
		System.out.println("obj의 해시코드:"+obj.hashCode());
		
		try {
			Class.forName("java.lang.String");
		} catch (ClassNotFoundException e1) {
			System.out.println("해당클래스가 존재하지 않습니다.");
		}
		
		
		// RuntimeException
		String str = null;
		 // CharSequence interface의 추상메소드.
		try {
			str.charAt(0);
			System.out.println(str.toString());
		}
		catch(NullPointerException e) {
			System.out.println("널포인트 예외발생");
			e.printStackTrace(); // 실제 에러난위치 확인
		}
		String nums1 = "백"; //숫자 문자열
		String nums2 = "이백"; //숫자 문자열
		int num1 ,num2;
		
		try {
			 num1 = Integer.parseInt(nums1); // int타입으로 변환
			 num2 = Integer.parseInt(nums2); // int타입으로 변환
			 str.charAt(0);
		}catch (Exception e) {
			num1 = 0;
			num2 = 0;
		}
				System.out.println(num1+num2);
				
				
		try {
			showError();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		}
		System.out.println("end of prog");
		

	}//main
	public static void showError() throws ClassNotFoundException { //사용한곳에서 예외처리
//		try {
//			Class.forName("java.lang.String");
//		} catch (ClassNotFoundException e) {
////			e.printStackTrace();
//			System.out.println("예외발생");
//		}
		Class.forName("java.lang.String");
	}

}//class
