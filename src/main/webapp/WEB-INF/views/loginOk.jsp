<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		String loginCheck = request.getAttribute("loginCheck").toString();
		if(loginCheck.equals("0")) {
	%>
		<script type="text/javascript">
			alert('아디비번 틀림');
			history.go(-1);
		</script>
	<%
		}
	%>
	
	<h2>${memberId }로그인 성공</h2> <br>
	<input type="button" value="게시판" onclick="javascript:window.location='list'">
	
	
</body>
</html>