package com.jsh.mybatis.member.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jsh.mybatis.member.dao.MemberDao;

@Controller

public class MemberController {
	
	@Autowired
	private SqlSession sqlSession;

	
	@RequestMapping(value = "/login")
	public String login() {
		
		return "login";
	}
	
	
	@RequestMapping(value = "/join_member")
	public String join_member() {
		
		return "join_member";
	}
	
	
	@RequestMapping(value = "/joinOk")
	public String joinOk(HttpServletRequest request) {
		
		MemberDao dao = sqlSession.getMapper(MemberDao.class);
		
		
		dao.joinMemberDao(request.getParameter("mid"), request.getParameter("mpw"), request.getParameter("mname"), request.getParameter("memail"));
		
		return "redirect:/";
	}
	
	
}
