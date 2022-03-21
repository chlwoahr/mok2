package com.edu;

public class UnivFriend extends Friend {
	//학교: 학교이름, 전공
	private String university; 
	private String major;
	

public UnivFriend() {
		super(); // Frend(); 부모클래스 생성자
		
	}
	public UnivFriend(String name, int age, double height, double weight, String phone) {
		super(name, age, height, weight, phone); // Friend(n,a,h,w,p)
		
	}
	public UnivFriend(String name, int age, double height, double weight, String phone,String university, String major) {
		super(name, age, height, weight, phone); // Friend(n,a,h,w,p)
		this.university = university;
		this.major = major;
	}
public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	@Override
	public String getPhone() {
		// TODO Auto-generated method stub
		return super.getPhone();
	}
	@Override
	public void setPhone(String phone) {
		// TODO Auto-generated method stub
		super.setPhone(phone);
	}
	@Override
	public String toString() {
		String str = "친구의 이름은"+ super.getName()+"이고 \n";
		str += "나이는"+super.getAge()+"이고 \n";
		str += "연락처는"+this.getPhone() + "입니다\n";
		str += "========<추가정보>=========\n";
		str += "학교는"+getUniversity()+"이고 \n";
		str += "전공은"+getMajor()+"입니다 \n";
		return str;
	}
	

}
