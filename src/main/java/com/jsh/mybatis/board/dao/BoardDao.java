package com.jsh.mybatis.board.dao;

import java.util.ArrayList;

import com.jsh.mybatis.board.dto.BoardDto;

public interface BoardDao {

	public ArrayList<BoardDto> listDao();
	public BoardDto viewDao(String bnum);
	public void deleteDao(String bnum);
	public void writeDao(String bid, String btitle, String bcontent);
	public void modifyDao(String bnum, String btitle, String bcontent);
}
