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

<div class = "title">
	<h1> 회원가입 </h1>
</div>

<div class = "sign">

<form action="ms" method="post" enctype="multipart/form-data">
						<!--  Http의 바디부분에 데이터를 여러 부분으로 나누어서 전송함 -->
	<input type="hidden" name="command" value="sign">
	<table>
		<tr>
		<th>아이디</th>
		<td><input type="text" name="id"></td>
		</tr>
		
		<tr>
		<th>비밀번호</th>
		<td><input type="text" name="pw"></td>
		</tr>
		
		<tr>
		<th>이름</th>
		<td><input type="text" name="name"></td>
		</tr>
	
		<tr>
		<th>권한</th>
		<td>
			<label for="admin">관리자</label><input type="radio" name="auth" id="admin" value="1">&emsp;
			<label for="user">사용자</label><input type="radio" name="auth" id="user" value="2">
		</td>
		</tr>
	</table>
	
	<div class="s_button">
		<input type="submit" value="회원가입">&nbsp;
		<input type="button" onclick="location.href='ms?command=loginForm'" value="이전으로">
	</div>
	</form>
</div>

</body>
</html>