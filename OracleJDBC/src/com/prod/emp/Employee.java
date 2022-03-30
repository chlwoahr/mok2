package com.prod.emp;

public class Employee {
	// employees 테이블의 컬럼에 해당되는 필드 설정
	private int employeeId; // employees.employee_id < 테이블 컬럼
	private String firstName; // employees.first_name
	private String lastName; // employees.last_name
	private String email; // employees.email
	private int salary; // employees.salary
	private String hireDate;
	private String jobId;
	private String phoneNumber;

	public Employee() {

	}

	public Employee(int employeeId, String lastName, String email, String hireDate, String jobId) {
		super();
		this.employeeId = employeeId;

		this.lastName = lastName;
		this.email = email;

		this.hireDate = hireDate;
		this.jobId = jobId;

	}
	

	public Employee(int employeeId) {
		super();
		this.employeeId = employeeId;
	}

	public Employee(String firstName, String phoneNumber,int salary,int employeeId) {
		super();
		
		this.firstName = firstName;
		this.salary = salary;
		this.phoneNumber = phoneNumber;
		this.employeeId = employeeId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", salary=" + salary + ", hireDate=" + hireDate + ", jobId=" + jobId + "]";
	}

}
