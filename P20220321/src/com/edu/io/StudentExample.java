package com.edu.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;  
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.edu.io.*;

public class StudentExample {
	static Scanner scn = new Scanner(System.in);
	static List<Student> list = new ArrayList<Student>();

	public static void main(String[] args) {
		writeStudent();
		readStudent(); // 텍스트 101 홍길동 30 50 > Student ()
//		for (Student student : list) {
//			System.out.println(student.toString());
//		}
//		System.out.println("end");

	} // end main

	public static void readStudent() {
		try {
			FileReader fr = new FileReader("student.txt");
			BufferedReader br = new BufferedReader(fr);
//			br.readLine(); // 한라인을 읽음
			String readStr = null;

			while ((readStr = br.readLine()) != null) {
				String[] contents = readStr.split(" "); // 101 hong 20 30 읽은값중 공란을 잘라줌
				list.add(new Student(Integer.parseInt(contents[0]), contents[1], Integer.parseInt(contents[2]),
						Integer.parseInt(contents[3])));

				System.out.println(readStr);
			}
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void writeStudent() {
		try {
			FileWriter fw = new FileWriter("student.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			while (true) {
				System.out.println("이름입력>>");
				String name = scn.nextLine(); // 한라인 전체를 읽음.
				if (name.equals("stop")) {
					break;
				}

				bw.write(name + "\n");
			}
			bw.close();
			fw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
