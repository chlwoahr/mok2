package jae;

public class Textile {
	private int texnu;
	private String texna;
	private String texco;
	private int texam;
	
	public Textile() {
		
	}
	
	public Textile(int texnu, String texna, String texco, int texam) {
		super();
		this.texnu = texnu;
		this.texna = texna;
		this.texco = texco;
		this.texam = texam;
	}
	//me
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
	@Override
	public String toString() {
		return "섬유정보 [오더번호=" + texnu + ", 아이템=" + texna + ", 색상=" + texco + ", 수량=" + texam + "]";
	}
	

}
