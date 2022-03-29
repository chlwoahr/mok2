package com.test;

import java.util.Scanner;

//문제3) 정수형배열 선언하고 사용자로 세개의 정수값을 입력받아서 배열에 저장. 제일 큰값을 구하는 코드를 작성. 스캐너클래스
public class Exam03 {
	public static void main(String[] args) {
		int[] ary = new int[3];
		Scanner scn = new Scanner(System.in);
		System.out.println("첫번째 값 입력");
		ary[0] = scn.nextInt();
		System.out.println("두번째 값 입력");
		ary[1] = scn.nextInt();
		System.out.println("두번째 값 입력");
		ary[2] = scn.nextInt();
		if(ary[0]>=ary[1]&&ary[0]>=ary[2]) {
			System.out.println(ary[0]);
		}
		else if(ary[1]>=ary[0]&&ary[1]>=ary[2]) {
				System.out.println(ary[1]);
		}
		else if(ary[2]>=ary[0]&&ary[2]>=ary[1]) {
					System.out.println(ary[2]);
		}
		
		
	}
}
