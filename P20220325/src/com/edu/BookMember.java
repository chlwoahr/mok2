package com.edu;

public class BookMember extends Member {
	private String boNa;
	private String boNu;
	// 도서반의 반장이름.
	// 도서반의 강의실정보.(지혜실, 지식실, 모험실)
	// 정보출력시 => 반장이름: 홍길동, 강의실: 모험실 
	public String getBoNa() {
		return boNa;
	}
	public void setBoNa(String boNa) {
		this.boNa = boNa;
	}
	public String getBoNu() {
		return boNu;
	}
	public void setBoNu(String boNu) {
		this.boNu = boNu;
	}
	public BookMember(int memberId, String memberName, String phone, String boNa, String boNu) {
		super(memberId, memberName, phone);
		this.boNa = boNa;
		this.boNu = boNu;
	}
	@Override
	public String toString() {
		return "도서반 [회원번호 ="+getMemberId()+" 회원이름 = "+getMemberName()+" 연락처 = "+getPhone()+" 도서반장 = "+boNa+" 강의실 = "+boNu+"]";
	}
	

	
	
}
