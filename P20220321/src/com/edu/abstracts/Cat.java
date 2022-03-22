package com.edu.abstracts;

public class Cat extends Animal {
	private String jo;
	
	

	
	
	
	public String getJo() {
		String str = jo;
		return jo;
	}



	public void setJo(String jo) {
		this.jo = jo;
	}





	@Override
	public void eat() {
		System.out.println("고양이가 먹습니다.");
		
	}

	@Override
	public void speak() {
		System.out.println("야옹");
		
	}

}
