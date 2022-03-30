package com.edu.collect;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.edu.api.Members1;

public class StudentApp {
	List<Student> list = new ArrayList<Student>();
	Scanner scn = new Scanner(System.in);

	// 생성자
	public StudentApp() {
		list.add(new Student(101, "권가희", 50, 60));
		list.add(new Student(102, "유해정", 70, 80));
		list.add(new Student(103, "이유빈", 90, 70));
		list.add(new Student(104, "이유빈", 90, 100));
		list.add(new Student(105, "이유빈", 100, 70));

	}

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
			return list;
		}

		@Override
		public void modifyStudent(Student student) {// 수정
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getNu() == student.getNu()) {
					list.get(i).setE(student.getE()); // 영어점수 변경
					list.get(i).setK(student.getK()); // 국어점수 변경
				}
			}
		}

		@Override
		public void removest(int a) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getNu() == a) {
					list.remove(i);
				}

			}

		}

		@Override
		public List<Student> searchStudents(String name) {
			List<Student> searchList = new ArrayList<Student>();
			// 찾았다고 종료X
			for (int i = 0; i < list.size(); i++) {
				// 같은이름이 있는지 찾아보고 있으면 searchList.add()
				if (list.get(i).getNa().equals(name)) {
					searchList.add(list.get(i));

				}

			}
			return searchList;
		}

		@Override
		public void saveTofile() {
			System.exit(0);

		}

	} // end of studentserviceimpl
// 메인기능을 담당하는 excute();
	public void execute() {
		StudentService service = null;
				service = new StudentServiceOracle();
//				new StudentServiceFile();
					
		// 인터페이스를 변수로 선언하고 구현하는클래스 인스턴스 생성

		// 메뉴: 1.추가 2.리스트 3.한건조회 4.수정5.삭제6.이름으로 조회 9.종료

		while (true) {

			System.out.println("1.추가 2.리스트 3.한건조회 4.수정 5.삭제 6.이름조회 9.종료");
			System.out.print("선택>>");

			int menu = scn.nextInt();
			if (menu == 1) {
				// 학생정보 추가입력. : 학생번호, 이름, 영어, 국어 점수
				System.out.println("학생번호를 입력>>");
				int stuNo = scn.nextInt();
				System.out.println("학생이름 입력>>");
				String name = scn.next();
				System.out.println("영어점수입력>>");
				int engScore = scn.nextInt();
				System.out.println("국어점수입력>>");
				int korScore = scn.nextInt();
				Student s1 = new Student(stuNo, name, engScore, korScore);
				service.insertStudent(s1);
			} else if (menu == 2) {
				List<Student> list = service.studentList();
				for (Student s : list) {
					System.out.println(s.toString());
				}
			} else if (menu == 3) { // 한건조회
				System.out.println("조회할 학생번호 입력>>");
				int stuNo = scn.nextInt();
				Student student = service.getStudent(stuNo);
				if (student == null) {
					System.out.println("조회된 결과가없습니다.");
				} else {
					System.out.println(student.toString());
				}
			} else if (menu == 4) {
				System.out.println("수정할 학생번호를 입력>>");
				int stuNo = scn.nextInt();
				System.out.println("영어점수입력>>");
				int engScore = scn.nextInt();
				System.out.println("국어점수입력>>");
				int korScore = scn.nextInt();
				Student s1 = new Student(stuNo, null, engScore, korScore);
				service.modifyStudent(s1);
				System.out.println("처리가 완료되었습니다");
			} else if (menu == 5) {
				System.out.println("삭제할 학생번호 입력>>");
				int stuNo = scn.nextInt();

				if (service.getStudent(stuNo) == null) {
					System.out.println("삭제할 번호 없음");
				} else {
					service.removest(stuNo);
					System.out.println("삭제완료");
				}
			} else if (menu == 6) {
				System.out.println("검색할 이름 입력");
				String Stuna = scn.next();
				List<Student> list = service.searchStudents(Stuna);
				if (list.size() == 0) {
					System.out.println("조회된 결과가없습니다.");
				} else {
					for (Student s : list) {
						System.out.println(s.toString());
					}
				}

			}

			else if (menu == 9) {

				System.out.println("프로그램을 종료합니다");
				service.saveTofile();
				break;
			}
		} // while end
		System.out.println("end of prog");
	}

}
