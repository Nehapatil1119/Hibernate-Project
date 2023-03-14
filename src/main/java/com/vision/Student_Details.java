package com.vision;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student_Details {
	@Id
	private int sid;
	
	private String name;
	
	private Certificate certi;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Certificate getCerti() {
		return certi;
	}

	public void setCerti(Certificate certi) {
		this.certi = certi;
	}

	public Student_Details(int sid, String name) {
		super();
		this.sid = sid;
		this.name = name;
	}

	public Student_Details() {
		super();
		// TODO Auto-generated constructor stub
	}

}
