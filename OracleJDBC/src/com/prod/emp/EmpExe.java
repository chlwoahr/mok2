package com.prod.emp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpExe {

	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
		Scanner scn = new Scanner(System.in);
		// 메뉴 : 1.사원리스트 2.입력 3.수정 4.삭제 5.한건조회 9.종료
		while (true) {
			System.out.println("1.사원리스트 2.입력 3.수정 4.삭제 5.한건조회 6.이름조회 9.종료");
			System.out.println("메뉴를 선택하세요");
			int menu = scn.nextInt();
			if (menu == 1) { // 리스트
				List<Employee> list = dao.empList();

				System.out.println("사원리스트.");
				for (Employee emp : list) {
					System.out.println(emp.toString());
				}
			} else if (menu == 2) { // 입력
				// 사원번호, lastName, email, hireDate, jobId
				System.out.println("사원번호 입력>");
				int m = scn.nextInt();
				System.out.println("lastName 입력>");
				String m1 = scn.next();
				System.out.println("email 입력>");
				String m2 = scn.next();
				System.out.println("hireDate 입력>");
				String m3 = scn.next();
				System.out.println("jobId 입력>");
				String m4 = scn.next();

				Employee emp = new Employee(m,m1,m2,m3,m4);
				
				
				boolean tOrF = dao.insertEmp(emp);
				if(tOrF) {
					System.out.println("정상");
				}else System.out.println("오류");

			} else if (menu == 3) { // 수정
				
				System.out.println("first_name");
				String m1 = scn.next();
				System.out.println("phone_number");
				String m2 = scn.next();
				System.out.println("salary");
				int m3 = scn.nextInt();
				System.out.println("수정할 employee_id 입력");
				int m = scn.nextInt();

				

				Employee emp = new Employee(m1,m2,m3,m);
				
				
				boolean a = dao.updateEmp(emp);
				if(a) {
					System.out.println("정상처리");
				}else System.out.println("비정상처리");

				

				
			} else if (menu == 4) { // 삭제
				System.out.println("삭제할 employeeId 입력");
				int m = scn.nextInt();
				
				 Employee emp = new Employee(m);
				 boolean a = dao.deleteEmp(m);
				 if(a) {
					 System.out.println("처리");
				 }else System.out.println("미처리");
				

			} else if (menu == 5) { // 한건조회
				System.out.println("조회할 employeeId 입력");
				int m = scn.nextInt();

				
				
				
				Employee emp = dao.empOneList(m);
				if(emp == null)
					System.out.println("조회결과가없습니다");
				else {
					System.out.println(emp.toString());
				}

				
			} 
			else if(menu ==6) {
				System.out.println("조회할 이름 입력");
				String m = scn.next();
				List<Employee> ena = dao.empNameList(m);
				System.out.println(ena.toString());
				
				
			}
			else if (menu == 9) {
				System.out.println("종료");
				break;
			}

		} // while
		System.out.println("end of program");
		scn.close();
	} // main

}// class
