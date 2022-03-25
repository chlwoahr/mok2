package com.edu.io;

import java.io.*;

public class BufferdExample {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("C:/temp/ii.jpg");
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:/temp/copy3.jpg"));) {
			int readBtye = -1;
			while ((readBtye = bis.read()) != -1) {
				bos.write(readBtye);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}System.out.println("end");
	}
}
