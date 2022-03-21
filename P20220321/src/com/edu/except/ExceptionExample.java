package com.edu.except;

import java.util.InputMismatchException;
import java.util.Scanner;

// 예외처리
public class ExceptionExample {

	public static void main(String[] args) {
		// 오류 : Error, Exception = 예외처리
		// 컴파일 에러, runtime error;
		
		
		try {
		double result = 13/0; // runtime error;
		
		System.out.println(result);
		}catch(ArithmeticException e) {
//			e.printStackTrace();
			System.out.println("0으로나눌수없습니다.");
		}
		Scanner scn = new Scanner(System.in);
		System.out.println("숫자를입력하세요");
		try {
			int menu = scn.nextInt();	
		}
		catch(InputMismatchException e) {
			System.out.println("숫자를 입력안하셨네요...");
		}
		
		scn.close();
		System.out.println("end");

	}

}
