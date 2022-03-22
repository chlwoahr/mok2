package com.edu.interfaces;

public class Tv implements RemoteControl {
	public void powerOn() {
		System.out.println("TV를 켭니다");
	}
	public void powerOff() {
		System.out.println("TV를 끕니다.");
	}
}
