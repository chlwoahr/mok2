package com.edu.collect;

import java.util.List;
import java.util.spi.AbstractResourceBundleProvider;

public interface StudentService {//기능 정의
	
	
	public void insertStudent(Student student); //입력
	public Student getStudent(int sno); //한건조회
	public List<Student> studentList();//전체목록
	public void modifyStudent(Student student);//한건수정
	public void removest(int a);//한건삭제
	public List<Student> searchStudents(String name); //이름조회
	
	
	
	
	
	
}
