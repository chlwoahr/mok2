package com.edu.collect;

import java.io.*;
import java.util.*;

//StudentServiceImpl(중첩클래스의 기능대체)
//입력,수정,삭제 -> 파일에 저장이 되도록.
public class StudentServiceFile implements StudentService {
	List<Student> list = new ArrayList<Student>();
	File file;

	// 생성자
	// 기본생성자의 파일에 저장되어 있는 파일정보를 읽어 list에 값을 담아준다.
	public StudentServiceFile() {
		try {
			FileReader fr = new FileReader("studentList.data");
			BufferedReader br = new BufferedReader(fr);
			String readBuffer = null;
			while ((readBuffer = br.readLine()) != null) {
				String[] contents = readBuffer.split(","); // 101,홍길동,30,40
				// contests[0] <- 101,contests[1] <-홍길동,contests[2] <-30 ,contests[3] <- 40,
				list.add(
						new Student(Integer.parseInt(contents[0]), 
						contents[1], 
						Integer.parseInt(contents[2]),
						Integer.parseInt(contents[3])));
			}br.close();
			 fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 메소드
	@Override
	public void insertStudent(Student student) { // 입력
		list.add(student);
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
	public List<Student> studentList() {
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
		// 작성했던 ArrayList<student> list > 파일저장
		try {
			FileWriter fw = new FileWriter("studentList.data");
			BufferedWriter bw = new BufferedWriter(fw); // 보조스트림의 생성자의 매개값으로 기본스트림

			for (Student stdu : list) { // 작성했던 ArrayList<student> list > 파일저장
				bw.write(stdu.getNu() + "," + stdu.getNa() + "," + stdu.getE() + "," + stdu.getK() + "\n");

			}
			bw.close();
			fw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
