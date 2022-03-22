package com.edu.interfaces;

public class MainExe {

	public static void main(String[] args) {
		// 리모콘 > TV, Radio, 냉장고 
		// 클래스 호출 - 인터페이스명 변수 = new implements한 클래스
		RemoteControl rm = new Tv();
		rm.powerOff();
		rm.powerOn();
		
		rm = new Radio();
		rm.powerOff();
		rm.powerOn();
		
		rm = new Refrigerator();
		rm.powerOff();
		rm.powerOn();
		
		rm = new Computer();
		rm.powerOff();
		rm.powerOn();
		
		
		
	}

}
