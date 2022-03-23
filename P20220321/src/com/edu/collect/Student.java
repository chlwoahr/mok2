package com.edu.collect;

public class Student {
	//학생번호 int , 학생이름 str, 영어 int, 국어 int 
	private int nu;
	private int e;
	private int k;
	private String na;
	
	public Student() {
		
	}
	
	
	public Student(int nu, String na,int e, int k) {
		super();
		this.nu = nu;
		this.e = e;
		this.k = k;
		this.na = na;
	}
	public int getNu() {
		return nu;
	}
	public void setNu(int nu) {
		this.nu = nu;
	}
	public int getE() {
		return e;
	}
	public void setE(int e) {
		this.e = e;
	}
	public int getK() {
		return k;
	}
	public void setK(int k) {
		this.k = k;
	}
	public String getNa() {
		return na;
	}
	public void setNa(String na) {
		this.na = na;
	}


	@Override
	public String toString() {
		return "학생정보 [학번:"+nu+", 이름:"+na+", 국어점수:"+k+", 영어점수:"+e+"]";
	}
	
	// tostring 재정의
	
	
}
