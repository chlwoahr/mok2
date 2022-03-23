package com.edu.api;

public class IDCheck {
	// 주민번호 입력 > 남자 1,3,여자 2,4
	// 중간 하이폰대신 공백, 공백없이 기재
	// String getGender() -> 남자, 여자
	public String getGender(String a) {
		char aa = a.charAt(7);
		
		String b = null;
		if(a.length()==13) {
			if(a.charAt(6) == '1'|| a.charAt(6) == '3') {
				b="남자";
			}else if(a.charAt(6) == '2'|| a.charAt(6) == '4') {
				b="여자";
			}
		}
		switch (aa) {
		case'1': 
		case'3':
		
		b = "남자";
			break;
		case'2': 
		case'4': 
		b = "여자";	
			break;
		} return b ;


	}

}
