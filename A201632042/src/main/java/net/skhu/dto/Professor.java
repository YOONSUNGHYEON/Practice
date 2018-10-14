package net.skhu.dto;

public class Professor {

	int id;
	String professorName;
	int departmentId;
	String departmentName;

	public int getDepartmentId() {
		return departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public int getId() {
		return id;
	}
	public String getProfessorName() {
		return professorName;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setProfessorName(String professorName) {
		this.professorName = professorName;
	}





}


