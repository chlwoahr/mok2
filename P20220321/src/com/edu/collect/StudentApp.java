package com.edu.collect;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentApp {
	List<Student> list = new ArrayList<Student>();
	Scanner scn = new Scanner(System.in);

	// 맴버클래스.
	class StudentServiceImpl implements StudentService {

		@Override
		public void insertStudent(Student student) {
			list.add(student); // 추가
		}

		@Override
		public Student getStudent(int sno) { // 학생번호로 한건 조회.
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getNu() == sno) {
					return list.get(i);
				}
			}
			return null;
		}

		@Override
		public List<Student> studentList() { // 전체 학생정보
			return null;
		}

		@Override
		public void modifyStudent(Student student) {// 수정
			for(int i=0;i<list.size();i++) {
				if(list.get(i).getNu() == student.getNu()) {
					list.get(i).setE(student.getE()); //영어점수 변경
					list.get(i).setK(student.getK()); //국어점수 변경
				}
			}
		}

	} // end of studentserviceimpl

	public void execute() {

		// 메뉴: 1.추가 2.리스트 3.한건조회 4.수정 9.종료

		while (true) {

			System.out.println("1.추가 2.리스트 3.한건조회 4.수정 9.종료");
			System.out.print("선택>>");

			int menu = scn.nextInt();
			if (menu == 1) {

			} else if (menu == 2) {

			} else if (menu == 3) {

			} else if (menu == 4) {

			} else if (menu == 9) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
		} // while end
		System.out.println("end of prog");
	}

}
