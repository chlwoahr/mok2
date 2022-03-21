package com.edu;

import java.security.PKCS12Attribute;

public class FriendListApp {
	public static void main(String[] args) {
		Friend[] frineds = new Friend[10];
		
		Friend f1 = new Friend();
		f1.setName("진휘용");
		f1.setAge(25);
		f1.setHeight(178.3);
		f1.setWeight(68.9);
		f1.setPhone("010-2323-9845");
		
		UnivFriend f2 = new UnivFriend("서현일",29,178.3,69.2,"010-1111,2222");
		f2.setUniversity("대구대학교");
		f2.setMajor("컴퓨터공학과");
		
		
		
		ComFriend f3 = new ComFriend("최규완",29,179.3,75.2,"010-1111,2222","네이버","지도앱 개발");
		
		
		Friend f4 = new Friend();
		f4.setName("진휘용");
		f4.setAge(25);
		f4.setHeight(178.3);
		f4.setWeight(68.9);
		f4.setPhone("010-2323-9845");
		
		UnivFriend f5 = new UnivFriend("QQQ",29,178.3,69.2,"010-1111,2222");
		f5.setUniversity("경대");
		f5.setMajor("임베");
		
		
		
		ComFriend f6 = new ComFriend("BBB",29,179.3,75.2,"010-1111,2222","네이버","지도앱 개발");
		
		frineds[0]=f1;
		frineds[1]=f2;
		frineds[2]=f3;
		frineds[3]=f4;
		frineds[4]=f5;
		frineds[5]=f6;
		
		//학교 친구만 출력,
		for(int i=0;i<frineds.length;i++) {
			if(frineds[i] instanceof UnivFriend && frineds[i]!=null) {
				System.out.println(frineds[i]); 
			}
		}
		
		for(int i=0;i<frineds.length;i++) {
			if(frineds[i]!= null ) //다형성 동일한 기능이지만 인스턴스의 종류에따라 다른 실행결과 출력
			System.out.println(frineds[i]);
			
		}      
		Friend friend = f2;//univFriend // UnivFriend;  getUniversity() getMajor()
		//univFriend  // friend
		friend  = f1; //f2(univFriend) =  f1(friend;)
		UnivFriend uni = null;
		if(friend instanceof UnivFriend) { // uni변수값이 univfriend의 인스턴스인지
		uni = (UnivFriend) friend; // 강제형변환
		uni.getUniversity();// 부모클래스의 참조변수 > 자식클래스의 참조변수 할당.
		}
		}
}
