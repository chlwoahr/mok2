package com.edu;

public class SoccerMember extends Member {
	// 축구반의 코치이름.
	// 락커룸의 이름.(A, B, C, D)
	
	// 정보출력시 => 코치이름: 홍길동, 락커룸: A 
	private String scNa;
	private String scRna;
	public String getScNa() {
		return scNa;
	}
	public void setScNa(String scNa) {
		this.scNa = scNa;
	}
	public String getScRna() {
		return scRna;
	}
	public void setScRna(String scRna) {
		this.scRna = scRna;
	}

	public SoccerMember(int memberId, String memberName, String phone, String scNa, String scRna) {
		super(memberId, memberName, phone);
		this.scNa = scNa;
		this.scRna = scRna;
	}
	@Override
	public String toString() {
		return "축구반 [회원번호 ="+getMemberId()+" 회원이름 = "+getMemberName()+" 연락처 = "+getPhone()+" 코치이름 = "+scNa+" 락커름 = "+scRna+"]";
	}

}
