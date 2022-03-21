package com.pud;

public class Person {
	private String name;
	private int age;
	private double height;
	private double weight;
	
	
	// 생성자
	// 생성자 여러개 정의 = 오버로딩
	public Person() {
		
	}
	public Person(String name) {
		this.name = name;
	}
	
	public Person(String name, int age, double height, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	// 메소드
	public void setName(String name) {
		this.name = name;
		
	}
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}


	
}
