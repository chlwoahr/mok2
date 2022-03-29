package com.test;

import java.util.function.IntBinaryOperator;

//문제4) 1 ~ 6까지 임의의 정수를 생성하는 Math.random()을 사용하여 작성하세요.
//생성된 값을 정수배열(크기 5)를 선언 후 값을 저장 후 가장 큰 값을 구하는 코드를 작성.
public class Exam04 {
	public static void main(String[] args) {
		 
//		 int[] ary = new int[5];
//	for(int i=0;i<ary.length;i++) {
//		int a = (int)(Math.random()*6)+1;
//		ary[i] = a;
//		System.out.println(ary[i]);
//		
//	}
//	if(ary[0]>=ary[1] && ary[0]>=ary[2] && ary[0]>=ary[3] && ary[0]>=ary[4]) {
//		System.out.println(ary[0]);
//	}
//	else if(ary[1]>=ary[0] && ary[1]>=ary[2] && ary[1]>=ary[3] && ary[1]>=ary[4]) {
//		System.out.println(ary[1]);
//		
//	}
//	else if(ary[2]>=ary[0] && ary[2]>=ary[1] && ary[2]>=ary[3] && ary[2]>=ary[4]) {
//		System.out.println(ary[2]);
//		
//	}
//	else if(ary[3]>=ary[0] && ary[3]>=ary[1] && ary[3]>=ary[2] && ary[3]>=ary[4]) {
//		System.out.println(ary[3]);
//		
//	}
//	else  {
//		System.out.println(ary[4]);
//		
//	}
	int[] intAry = new int[5];
	
	for(int i = 0; i<intAry.length;i++) {
		intAry[i] = (int)(Math.random()*6)+1;
	}
	int temp = intAry[0];
	for(int i =0;i<intAry.length;i++) {
		if(intAry[i]>temp) {
			temp = intAry[i];
		}
		
	}
	System.out.println(temp);
	}
}
