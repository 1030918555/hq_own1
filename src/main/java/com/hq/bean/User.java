package com.hq.bean;

public class User {
	private Integer uid;
	private String uname;
	private String password;
	private Double score;
	private Dept dept;
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", password=" + password + ", score=" + score + ", dept="
				+ dept + "]";
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
