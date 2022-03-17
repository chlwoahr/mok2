package com.edu;

import java.util.Scanner;

import com.pud.Student;

public class StrudentEx {

	public static void main(String[] args) {
		// scanner, 배열선언5개, 입력, 리스트 화면출력,
		Scanner scn = new Scanner(System.in);
		Student[] students = new Student[3];

		while (true) {
			System.out.println("1.입력 2.리스트 3.종료");
			System.out.print("선택> ");
			int menu = scn.nextInt();
			if (menu == 1) {
//				System.out.println("입력기능구현");
				System.out.println("학번을입력하세요> ");
				int sno = scn.nextInt();
				System.out.print("이름을 입력하세요 > ");
				String sname = scn.next();
				System.out.print("영어점수 입력하세요 > ");
				int escore = scn.nextInt();
				System.out.print("국어점수 입력하세요 > ");
				int kscore = scn.nextInt();
				System.out.print("수학점수 입력하세요 > ");
				int mscore = scn.nextInt();
				
				Student s1 =new Student(sno, sname, kscore, mscore, escore );
				
				for(int i=0;i<students.length;i++) {
					if(students[i]==null) {
						students[i]= s1;
						break;
					}
				}
				System.out.println("저장완료.");
				
		// 입력기능구현.. 학번,이름,영어,수학,국어 = student 인스턴스 생성후 > 배열 담기

			} else if (menu == 2) {
//				System.out.println("리스트기능구현");
				// 입력된 리스트..
				for(int i=0; i<students.length;i++) {
					if(students[i] != null) {
					System.out.println(students[i].getStudInfo());
						
					}
				}
				System.out.println("조회완료.");
			} else if (menu == 3) {
				System.out.println("프로그램을 종료합니다");
				break;
			} else {
				System.out.println("메뉴를 잘못 선택했습니다.");
			}
		}
		System.out.println("end of program");

	}

}
