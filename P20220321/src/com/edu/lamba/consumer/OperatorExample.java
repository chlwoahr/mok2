package com.edu.lamba.consumer;

import java.util.function.*;

// Operator : 연산처리 결과
public class OperatorExample {
	public static void main(String[] args) {
		IntBinaryOperator intBin = (left, right) -> left + right;
		intBin.applyAsInt(10, 20);

		intBin = (num1, num2) -> num1 < num2 ? num1 : num2;
		int result = maxOrmin(intBin);
		System.out.println(result);

	}
                               //어떤기능이들어온다는 의미
	public static int maxOrmin(IntBinaryOperator intBin) {
		int[] intAry = { 85, 47, 92 };
		int result = intAry[0];
		for (int num : intAry) {
			result = intBin.applyAsInt(result, num);
		}
		return result;
	}
}
