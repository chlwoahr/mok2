package com.edu;

import java.util.Iterator;

import com.pud.Student;

public class GugudanEx {
	public static void main(String[] args) {
		int result = sum(sum(10, 20), sum(5, 7));
		int[] newAry= {10,20,30};
		result = sum(newAry);
//		System.out.println(result);
//		System.out.println(devide(10, 4));
		printGugudan();
		
	} // end of main()
	public static int sum (int[] ary) {
		// 배열매게변수의 각 요소의 합을 구하는 메소드
		int sum = 0;
		for(int i=0;i<ary.length;i++) {
			sum +=ary[i];
		}
		return sum;
	}
	
	// 나누기 메소드( int, int) 리턴값은 double 나누는값이 0이들어오면 0을 리턴
	
	public static double devide(int a,int b) {
		if(b==0) {
			return 0;
		}		
		
		return a/(double)b;
	}
	
	
	
	public static int sum(int n1, int n2) {
		return n1 + n2;
	}

	public static void gugudan(int dan) {
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + "*" + i + "=" + dan * i);

		}
	}

	public static void printStar(int runCnt, String shape) {
		for (int i = 0; i < runCnt; i++) {
			System.out.print(shape);
		}

	}

	public static void printGugudan() {
		// 메소드 실행하려면 new 클래스이름(); ex: Student s1 =new Student();
		// static 가붙으면 인스턴스 생성시 초기화 필요없음
//		Student.callStatic();

		for (int j = 1; j <= 9; j++) {
//			System.out.println("["+j+"단]");
			
			for (int i = 2; i <= 9; i++) {

				System.out.print(i+"*"+j+"=" +(i * j)+"");
				System.out.print("");

			}

			System.out.println();

		}
	} // end of Gugudan()

}
