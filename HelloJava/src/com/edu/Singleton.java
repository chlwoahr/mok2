package com.edu;

public class Singleton { //하나의 내용만 담을수있음
	private static Singleton instance = new Singleton();
	
	private Singleton() {
		
	}
	public static Singleton getInstance() {
		return instance;
	}
}
