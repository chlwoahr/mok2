package com.edu.api;

public class Member {
	private String id;
//	private String name;
	
	public Member(String id) {
		this.id = id;
//		this.name = name;
	}
	
	
	@Override
	public int hashCode() {
		return 1111;
	}


//	@Override
//	public boolean equals(Object obj) {
//		
//		if(obj instanceof Member) {
//			Member member = (Member) obj;
//			if(id.equals(member.id)) {
//				return true;
//			}return false;
//		}
		
			
		
		
		//기본 equals member == obj로 주소값만 비교하기떄문에
	//오버라이딩하여 재정의 obj타입이 맴버와 동일하다면 형변환하여 obj에 id값 비교 
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Member) {
			Member member = (Member) obj;
		return	this.id == member.id;
			} return false;
	}
}
