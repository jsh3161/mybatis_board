<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page pageEncoding="utf-8" session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<input type="button" value="로그인" onclick="javascript:window.location='login'">
<input type="button" value="회원가입" onclick="javascript:window.location='join_member'"><br>
<img src="resources/img/tou.png">

</body>
</html>
