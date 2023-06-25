package com.jsh.mybatis.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	
	
	@RequestMapping(value = "/joinOk", method = RequestMethod.POST)
	public String joinOk(HttpServletRequest request, Model model) {
		
		MemberDao dao = sqlSession.getMapper(MemberDao.class);
				
		dao.joinMemberDao(request.getParameter("mid"), request.getParameter("mpw"), request.getParameter("mname"), request.getParameter("memail"));
		
		model.addAttribute("memberId", request.getParameter("mid"));
		
		return "joinOk";
	}
	
	@RequestMapping(value = "/loginOk", method = RequestMethod.POST)
	public String loginOk(HttpServletRequest request, Model model, HttpSession session) {
		
		String mid = request.getParameter("mid");
		String mpw = request.getParameter("mpw");
		
		MemberDao dao = sqlSession.getMapper(MemberDao.class);
		
		int loginFlag = dao.loginDao(mid, mpw);
		
		if(loginFlag == 1) {
			session.setAttribute("sessionId", mid);
			model.addAttribute("memberId",mid);
		}
		
		model.addAttribute("loginCheck", loginFlag);
		
		return "loginOk";
	}
	
	
}
