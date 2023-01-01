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
	<h1> 영화 상세 </h1>
</div>

<div class = "view">

<form action="ms" method="post" enctype="multipart/form-data">
						<!--  Http의 바디부분에 데이터를 여러 부분으로 나누어서 전송함 -->
						
	<input type="hidden" name="command" value="updateForm">
	<table>
		<tr>
		<th>제목</th>
		<td><input type="text" name="title" value="${movie.title}" readonly></td>
		</tr>
		
		<tr>
		<th>감독</th>
		<td><input type="text" name="director" value="${movie.director}" readonly></td>
		</tr>
		
		<tr>
		<th>배우</th>
		<td><input type="text" name="actor" value="${movie.actor}" readonly></td>
		</tr>
	
		<tr>
		<th>가격</th>
		<td><input type="number" name="price" value="${movie.price}" readonly></td>
		</tr>
		
		<tr>
		<th>포스터</th>
		<td><img src="upload/${movie.poster }"></td> <!--  업로드할 경로에 파일명을 저장한다. -->
		</tr>
		
		<tr>
		<th>synopsis</th>
		<td><textarea rows="7" cols="40" name="synopsis" readonly>
		${movie.synopsis}
		</textarea></td>
		</tr>		
		
	</table>
	
	<div class="v_button">
	
		<c:if test="${member.auth eq '1'}"><!--  관리자인 경우에만 -->
			<input type="submit" value="수정화면">
			<input type="button" onclick="location.href='ms?command=delete&code=${movie.code}'" value="삭제하기">
		</c:if>
		
		<input type="button" onclick="location.href='ms?command=list&code=${movie.code}'" value="목록보기">
	</div>
	</form>
</div>

</body>
</html>