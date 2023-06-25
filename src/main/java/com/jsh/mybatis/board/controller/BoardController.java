package com.jsh.mybatis.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jsh.mybatis.board.dao.BoardDao;
import com.jsh.mybatis.board.dto.BoardDto;

@Controller
public class BoardController {

	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping(value = "/list")
	public String list(Model model) {
		
		BoardDao dao = sqlSession.getMapper(BoardDao.class);
		
		model.addAttribute("list", dao.listDao());
		
		return "list";
	}
	
	
	@RequestMapping(value = "/content_view")
	public String content_view(HttpServletRequest request, Model model) {
		
		//request.getParameter("bnum");
		
		BoardDao dao = sqlSession.getMapper(BoardDao.class);
		
		BoardDto boardDto = dao.viewDao(request.getParameter("bnum"));
		
		model.addAttribute("boardDto",boardDto);
		
		return "content_view";
	}
	

	
	@RequestMapping(value = "/delete_form")
	public String delete_form(HttpServletRequest request) {
		
		BoardDao dao = sqlSession.getMapper(BoardDao.class);
		
		dao.deleteDao(request.getParameter("bnum"));
		
		return "redirect:list";
	}
	
	@RequestMapping(value = "/write_form")
	public String write_form(HttpSession session, Model model) {
		
		String sessionId = (String) session.getAttribute("sessionId");
		
		if(sessionId == null) {
			model.addAttribute("sessionId", "GUEST");
		} else {
			model.addAttribute("sessionId", sessionId);
		}
		
		return "write_form";
	}
		
	
	@RequestMapping(value = "/write")
	public String write(HttpServletRequest request) {
		
		BoardDao dao = sqlSession.getMapper(BoardDao.class);
		
		dao.writeDao(request.getParameter("bid"), request.getParameter("btitle"), request.getParameter("bcontent"));
		
		return "redirect:list";
	}
		

	@RequestMapping(value = "/modify_form")
	public String modify_form(HttpServletRequest request, Model model) {
		
		BoardDao dao = sqlSession.getMapper(BoardDao.class);
		
		BoardDto boardDto = dao.viewDao(request.getParameter("bnum"));
		
		model.addAttribute("boardDto", boardDto);
		
		return "modify_form";
	}
		
	
	@RequestMapping(value = "/modify")
	public String modify(HttpServletRequest request) {
		
		
		
		
		BoardDao dao = sqlSession.getMapper(BoardDao.class);
		
		dao.modifyDao(request.getParameter("bnum"), request.getParameter("btitle"), request.getParameter("bcontent"));
		
		
		return "redirect:list";
	}
	
}
