<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../css/movie.css">
</head>
<body>

<div class = "title" >
	<h1> 로그인 </h1>
</div>

<div class = "login" >

<form action="ms" method="post">

	<input type="hidden" name="command" value="login">
	
	<table>
		<tr>
		<th>아이디</th>
		<td><input type="text" name="id" autofocus></td>
		</tr>
		
		<tr>
		<th>비밀번호</th>
		<td><input type="password" name="pw"></td>
		</tr>
	</table>
	
	<div class="l_button">
		<input type="submit" value="로그인">&nbsp;
		<input type="button" value="회원가입" onclick="location.href='ms?command=signForm'">
	</div>
	</form>
</div>

</body>
</html>