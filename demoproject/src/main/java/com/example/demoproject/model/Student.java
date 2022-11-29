package com.example.demoproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "records")
public class Student {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int sid;
	
	
	@Column(name = "sdept")
	private String dept;
	
	@Column(name = "smarks")
	private int marks;
	
	@Column(name = "sname")
	private String name;
	
	public int getId() {
		return sid;
	}
	public void setId(int id) {
		this.sid = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String sname) {
		this.name = sname;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String sdept) {
		this.dept = sdept;
	}
	public int getMarks() {
		return marks;


	}
	public void setMarks(int smarks) {
		this.marks=smarks;
	}
}

