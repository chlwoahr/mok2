package com.edu;

public class Taxi extends Vehicle {
	
	
	public Taxi() {
		super.setMaxSpeed(120);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("taxi 가 달립니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("taxi 가 멈춥니다.");
	}
	@Override
	public String toString() {
		return "버스의 최고속도는 "+ getMaxSpeed();
	}

}
