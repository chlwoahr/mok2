package TexTex;

import java.util.Date;

public class TexTile {
	private int texnu;
	private String texna;
	private String texco;
	private int texam;
	private String date;
	
	public TexTile() {
		
	}
	
	
	
	

	




	public TexTile(int texnu, String texna, String texco, int texam) {
		super();
		this.texnu = texnu;
		this.texna = texna;
		this.texco = texco;
		this.texam = texam;
		
	}










	public int getTexnu() {
		return texnu;
	}
	public void setTexnu(int texnu) {
		this.texnu = texnu;
	}
	public String getTexna() {
		return texna;
	}
	public void setTexna(String texna) {
		this.texna = texna;
	}
	public String getTexco() {
		return texco;
	}
	public void setTexco(String texco) {
		this.texco = texco;
	}
	public int getTexam() {
		return texam;
	}
	public void setTexam(int texam) {
		this.texam = texam;
	}














	public String getDate() {
		return date;
<<<<<<< HEAD
=======
	}










	public void setDate(String date) {
		this.date = date;
	}










	@Override
	public String toString() {
		return "[오더번호 = " + texnu + ", 이름= " + texna + ", 색상= " + texco + ", 수량= " + texam + " 최종 수정시간 = "+date+"]\n"	;
>>>>>>> refs/remotes/origin/master
	}










	public void setDate(String date) {
		this.date = date;
	}










	@Override
	public String toString() {
		return "오더번호 = " + texnu + ", 이름= " + texna + ", 색상= " + texco + ", 수량= " + texam + " 최종 수정시간 = "+date+"\n"	;
	}

	public String to2String() {
		return "오더번호= " + texnu + "\n"+ "이름= " + texna +"\n"+ "색상= " + texco + "\n"+ "수량= " + texam + "\n"+ "최종 수정시간 = "+date+"\n"
				+"---------------------------------";
	}
	public String to3String() {
		return "오더번호= " + texnu + "\n"+ "이름= " + texna +"\n"+ "색상= " + texco + "\n"+ "최근 출고 수량= " + texam + "\n" 
				+"------------------";
	}

  

	
	
	
	
	
	
	
}