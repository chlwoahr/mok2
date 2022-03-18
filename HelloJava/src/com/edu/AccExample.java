package com.edu;

import java.util.concurrent.atomic.AtomicBoolean;

public class AccExample {

	public static void main(String[] args) {
		Account a1 = new Account(); //인스턴드를 생성.
		System.out.println(Account.bankName); //static는 인스턴스생성없이 바로사용가능
		Account.showBankName();
		Calcurator.sum(10,20); //공용 static 인스턴스없이 호출
		
		Calcurator.getArea(3);
		System.out.println();
		
		
		
		
		// 공용 = static 각각다른 = 인스턴스
	}

}
