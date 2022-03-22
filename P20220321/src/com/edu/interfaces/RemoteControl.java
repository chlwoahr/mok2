package com.edu.interfaces;

public interface RemoteControl {
	// 생성자 불가. 필드 불가
	
	public static final int MAX_VOLUM = 10;//상수 선언
	public static final int MIN_VOLUM = 10;//상수 선언
	
	public void powerOn(); //추상메소드
	public void powerOff();
}
