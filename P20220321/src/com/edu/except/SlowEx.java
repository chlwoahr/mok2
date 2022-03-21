package com.edu.except;

public class SlowEx {

	public static void main(String[] args) {
		
		showInterval("Hello, World\n"+"nice world");
	}
	
	public static void showInterval(String str) {
		for(int i=0; i<str.length();i++) {
			System.out.print(str.charAt(i)); // charAt 문자를하나씩갖고오는기능
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}

}
