package com.jsh.mybatis.member.dao;

public interface MemberDao {

	public void joinMemberDao(String mid, String mpw, String mname, String memail);
	public int loginDao(String mid, String mpw);
}
