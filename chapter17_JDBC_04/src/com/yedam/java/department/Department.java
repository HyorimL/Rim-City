package com.yedam.java.department;

public class Department {

	
	private int departmentId;
	private String departmentName;
	private String managerId;
	private int locationId;
	
	
	
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	@Override
	public String toString() {
		return "Department [부서번호=" + departmentId + ", 부서이름=" + departmentName + ", managerId="
				+ managerId + ", 지역번호=" + locationId + "]";
	}
	
	
	
}
