package TexTex;


import java.util.List;

public interface TexIf {
	public void insertTexTile(TexTile textile); // 입력

	public TexTile getTexTile(int nu); // 한건조회

	public List<TexTile> textileList();// 전체목록

	public boolean modifyTexTile(TexTile textile);// 한건수정

	public void removeTx(int a);// 한건삭제
	
	public void  ma (TexTile t,int a); // 출고

	 
	    	
	    
}
