package com.jsh.mybatis.member.dto;

import java.sql.Timestamp;

public class MemberDto {

	private String mdi;
	private String mpw;
	private String mname;
	private String memail;
	private Timestamp mdate;
	public MemberDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MemberDto(String mdi, String mpw, String mname, String memail, Timestamp mdate) {
		super();
		this.mdi = mdi;
		this.mpw = mpw;
		this.mname = mname;
		this.memail = memail;
		this.mdate = mdate;
	}
	public String getMdi() {
		return mdi;
	}
	public void setMdi(String mdi) {
		this.mdi = mdi;
	}
	public String getMpw() {
		return mpw;
	}
	public void setMpw(String mpw) {
		this.mpw = mpw;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMemail() {
		return memail;
	}
	public void setMemail(String memail) {
		this.memail = memail;
	}
	public Timestamp getMdate() {
		return mdate;
	}
	public void setMdate(Timestamp mdate) {
		this.mdate = mdate;
	}
	
	
	
}
