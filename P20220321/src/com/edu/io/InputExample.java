package com.edu.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputExample {
	public static void main(String[] args) {
		try {
			// 입력 스트림 생성(first.dat 파일을 입력스트림의 소스
			InputStream is = new FileInputStream("first.dat");
			int readByte = 0; // 입력한값을 읽는다 읽은값이없으면 -1로 안에 들어있는 내용만큼 출력후 종료
			while ((readByte = is.read()) != -1) {
				System.out.println(readByte);
			}
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
