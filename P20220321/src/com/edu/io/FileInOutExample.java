package com.edu.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInOutExample {
 
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:/temp/ii.jpg"); //입력스트림
			FileOutputStream fos = new FileOutputStream("C:/temp/copy2.jpg"); //출력스트림
			
			int readByte = -1;
			byte[] readBytes = new byte[100]; // 100byte씩 처리
			while((readByte = fis.read(readBytes)) !=-1) { // 읽은 크기만큼 처리 , 빠른데이터 처리
				fos.write(readBytes,0,readByte);// 배열,시작위치,파일크기만큼 
			}
			fos.close();
			fis.close();

		} catch (IOException e) {
			e.printStackTrace();
		}System.out.println("end");
	}

}
