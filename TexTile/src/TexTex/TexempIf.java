package TexTex;

import java.util.List;



public interface TexempIf {

	public void insertTexEmp(TexEmp texemp); // 입력

	public TexEmp getTexEmp(int nu); // 한건조회

	public List<TexEmp> texemplist();// 전체목록

	public void modifyTexEmp(TexEmp texemp);// 한건수정

	public void removeTexEmp(int a);// 한건삭제
	
	public TexEmp log(int a, int b);//로그인 


}
