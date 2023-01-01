<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../css/movie.css">
</head>
<body>

	<div class="title">
		<h1>영화 리스트</h1>
	</div>

	<div class="main">
		<table>

			<tr>
				<td colspan="6"
					style="border: 0; text-align: right; margin-top: 2vw;">
					
					<c:if test="${member.auth eq '1' }"><!-- 관리자인 경우에만 -->
					<a href="ms?command=insertForm">영화등록</a>&nbsp;&nbsp; 
					</c:if>
					<a href="#">로그아웃</a>
				</td>
			</tr>

			<tr>
				<th>제목</th>
				<th>감독</th>
				<th>배우</th>
				<th>가격</th>
				<th>수정</th>
				<th>삭제</th>
			</tr>

			<c:forEach var="movie" items="${movies }">
				<tr>
					<td><span style="color: red"><a
							href="ms?command=view&code=${movie.code}">${movie.title }</a></span></td>
					<td>${movie.director }</td>
					<td>${movie.actor }</td>
					<td>${movie.price }</td>
					
				
					<c:choose>
						<c:when test="${member.auth eq '1' }">	<!-- 관리자인 경우 -->
							<td><a href="ms?command=updateForm&code=${movie.code}">정보
									수정</a></td>
							<td><a href="ms?command=delete&code=${movie.code }">정보
									삭제</a></td>
						</c:when>
						<c:otherwise>
							<td>사용자는 수정불가</td>
							<td>사용자는 삭제불가</td>
						</c:otherwise>

					</c:choose>

				</tr>
			</c:forEach>


		</table>
	</div>
</body>
</html>