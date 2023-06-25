<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 글쓰기</title>
</head>
<body>
	<h2>게시판 글쓰기</h2>
	<hr>
	<table border="1">
		
		
		
		
		<form action="modify">
		
		<input type="hidden" name="bnum" size="60" value="${boardDto.bnum }">
		<tr>
			<td>이 름</td>
			<td><input type="text" name="bid" value="${boardDto.bid }" size="60" readonly></td>
		</tr>
		<tr>
			<td>제 목</td>
			<td><input type="text" name="btitle" value="${boardDto.btitle }" size="60"></td>
		</tr>
		<tr>
			<td>내 용</td>
			<td><textarea rows="10" cols="45" name="bcontent"> ${boardDto.bcontent } </textarea></td>
		</tr>	
		<tr>
			<td colspan="2">
				<input type="submit" value="글수정">&nbsp;&nbsp;
				<input type="button" value="글목록" onclick="javascript:window.location.href='list'">
			</td>
		</tr>
		</form>
	</table>
</body>
</html>