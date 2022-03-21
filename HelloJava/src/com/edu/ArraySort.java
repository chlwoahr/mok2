package com.edu;

import javax.xml.transform.Templates;

public class ArraySort {
	public static void sorting(int[] ary) {
		int loopCnt = ary.length - 1; // 마지막값이 제일 처음위치로 이동하려면 배열크기-1
		for (int cnt = 0; cnt < loopCnt; cnt++) {
			int temp = ary[0]; // 첫번째 값으로 temp값을 지정.

			for (int i = 0; i < loopCnt; i++) {
				if (ary[i] > ary[i + 1]) {
					// 34 25 > 25 34로 위치변경.

					temp = ary[i];
					ary[i] = ary[i + 1];
					ary[i + 1] = temp;
				}
			}

		}
	}

	public static void main(String[] args) {
		// 정수형 배열 선언 {30,25,48,12} 오름차순정렬
		int[] intAry = { 34, 25, 48, 12 };
		int[] intAry2 = {20 , 70, 50, 1};
		sorting(intAry);
		
		int loopCnt = intAry.length - 1; // 마지막값이 제일 처음위치로 이동하려면 배열크기-1
//		for (int cnt = 0; cnt < loopCnt; cnt++) {
//			int temp = intAry[0]; // 첫번째 값으로 temp값을 지정.
//
//			for (int i = 0; i < loopCnt; i++) {
//				if (intAry[i] > intAry[i + 1]) {
//					// 34 25 > 25 34로 위치변경.
//
//					temp = intAry[i];
//					intAry[i] = intAry[i + 1];
//					intAry[i + 1] = temp;
//				}
//			}
//
//		}
		for (int i = 0; i < intAry.length; i++) {
			System.out.print(intAry[i] + " ");
		} System.out.println();
		
		sorting(intAry2);
		for (int i = 0; i < intAry.length; i++) {
			System.out.print(intAry2[i] + " ");
		}

	}
}

//		int temp = 0;
//		int[] intAry2 = {};
//		for(int i=0 ; i<intAry.length;i++) {
//				temp = intAry[i];
//			for(int j=1 ; j<intAry.length;j++) {
//				if(temp<intAry[j]) {
//					intAry2[i] = temp;
//				}else {
//					intAry2[i]= intAry[j]; 
//				}
//			}
//			
//		}
//		System.out.println(intAry2);
