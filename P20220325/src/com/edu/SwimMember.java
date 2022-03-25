package com.edu;

public class SwimMember extends Member{
	// 강습반의 강사이름.
	// 수영등급(A,B,C,D)
	
	// 정보출력시 => 강사이름: 홍길동, 등급: A 
	private String swNa;
	private String swd;
	public String getSwNa() {
		return swNa;
	}
	public void setSwNa(String swNa) {
		this.swNa = swNa;
	}
	public String getSwd() {
		return swd;
	}
	public void setSwd(String swd) {
		this.swd = swd;
	}
	public SwimMember(int memberId, String memberName, String phone, String swNa, String swd) {
		super(memberId, memberName, phone);
		this.swNa = swNa;
		this.swd = swd;
	}
	@Override
	public String toString() {
		return "수영반 [회원번호 ="+getMemberId()+" 회원이름 = "+getMemberName()+" 연락처 = "+getPhone()+" 강사이름 = "+swNa+" 등급 ="+swd+"]";
	}

	
}
