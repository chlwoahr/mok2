package com.edu;

public class Account {
	//(계좌번호, 예금주, 예금금액)
	private String accNo;
	private String accName;
	private int money;
	// 생성자
	public Account(String accNo, String accName, int money) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.money = money;
	}
	public static String bankName; //static은 클래스가 
	static {
		bankName = "한일은행";
	}
	public static void showBankName() {
		System.out.println("한일은행입니다.");
	}
	public Account() {
		
	}
	// 생성자,메소드 여러개 만드는것 : 오버로딩
	//method.
	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accName=" + accName + ", money=" + money + "]";
	}
}
