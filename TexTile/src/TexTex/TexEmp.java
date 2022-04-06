package TexTex;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class TexEmp {
	private int empnu;
	private String empna;
	private String emphi;
	private String empjo;
	private int empsa;
	private String empar;
	private int emppa;
	
	
	public TexEmp() {
		
	}
	
	
	


	public TexEmp(String empjo, int emppa) {
		super();
		this.empjo = empjo;
		this.emppa = emppa;
	}





	public TexEmp(int empnu, String empna, String emphi, String empjo, int empsa, String empar, int emppa) {
		super();
		this.empnu = empnu;
		this.empna = empna;
		this.emphi = emphi;
		this.empjo = empjo;
		this.empsa = empsa;
		this.empar = empar;
		this.emppa = emppa;
	}





	public String getEmpjo() {
		return empjo;
	}
	public void setEmpjo(String empjo) {
		this.empjo = empjo;
	}
	public int getEmpnu() {
		return empnu;
	}
	public void setEmpnu(int empnu) {
		this.empnu = empnu;
	}
	public String getEmpna() {
		return empna;
	}
	public void setEmpna(String empna) {
		this.empna = empna;
	}
	public String getEmphi() {
		return emphi;
	}
	public void setEmphi(String emphi) {
		this.emphi = emphi;
	}
	public int getEmpsa() {
		return empsa;
	}
	public void setEmpsa(int empsa) {
		this.empsa = empsa;
	}
	public String getEmpar() {
		return empar;
	}
	public void setEmpar(String empar) {
		this.empar = empar;
	}
	public int getEmppa() {
		return emppa;
	}
	public void setEmppa(int emppa) {
		this.emppa = emppa;
	}
	@Override
	public String toString() {
		return "사원정보 [사원번호= " + empnu + ", 사원이름= " + empna + ", 입사날짜= " + emphi +" 부서= "+empjo+ ", 급여= " + empsa + ", 근무지역= "
				+ empar + ", 비밀번호= " + emppa + "]";
	}
	
	
	
	
	
	
	
}