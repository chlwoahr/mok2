package com.edu.collect;

import java.io.*;
import java.util.*;

public class StudentServiceFile implements StudentService {

	List<Student> list = new ArrayList<Student>();
	File file;

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
			BufferedWriter bw = new BufferedWriter(fw);

			for (Student stdu : list) {
				bw.write(stdu.getNu()+","+ stdu.getNa()+","+ stdu.getE()+","+stdu.getK()+"\n");
			
			}
			bw.close();
			fw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
