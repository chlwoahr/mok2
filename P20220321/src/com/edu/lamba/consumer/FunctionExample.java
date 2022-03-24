package com.edu.lamba.consumer;

import java.util.function.ToIntFunction;

import com.edu.collect.Student;
// Function 인터페이스 : 매핑작업.(Student > in)
public class FunctionExample {
	public static void main(String[] args) {
		ToIntFunction<Student> func = (student) -> student.getE() + student.getK();

		int result = func.applyAsInt(new Student(101, "홍", 80, 90));
		System.out.println(result);
	}
}
