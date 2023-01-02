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
					<a href="ms?command=loginForm">로그아웃</a>
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
					<td><a style="color:red;" href="ms?command=view&code=${movie.code}">${movie.title }</a></td>
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
	
	<div class="page">
		<p>전체 게시글 수: <span style="color:red">${paging.getTotalCount() }</span></p>
	</div>
	
	
	<div class="pagination">
	
		<c:set var="page" value="${paging.getCurrentPage() }"/> <!--  현재 페이지 -->
		<c:set var="beginPage" value="${paging.getBeginPage() }"/>
		<c:set var="endPage" value="${paging.getEndPage() }"/>
		<c:set var="totalPage" value="${paging.getTotalPage() }"/>
		<c:set var="url" value="${url }"/>
		<c:set var="displayPage" value="${paging.getDisplayPage() }"/>
	
	
	<!--  처음으로  -->
		<a href="${url}&page=1">
		<span> ◁&nbsp; </span>
		</a>
		
	<!--  이전으로 -->	
		<c:if test="${ page<=1 }">
				<span>이전</span>
		</c:if>
		<c:if test="${ page>1 }">
			<a href="${url }&page=${page-1}">이전</a>
		</c:if>
		
		<!--  넘버링 부분 -->
		<c:forEach var="item" varStatus = "status" begin="${beginPage }" end="${endPage }" step = "1">
		
		<c:if test="${page == item }">	<!--  현재 페이지는 클릭 못함 -->
			${item }
		</c:if>
		
		<c:if test="${page != item }">  <!--  현재 페이지가 아니면 클릭 가능 -->
			<a href="${url }&page=${item}">${item }</a>
		</c:if>
		
		</c:forEach>
		
		
		<!--  다음으로 -->	
		<c:if test="${ page>=totalPage }">
				<span>다음</span>
		</c:if>
		<c:if test="${ page<totalPage }">
			<a href="${url }&page=${page+1}">다음</a>
		</c:if>
		
	<!-- 마지막으로  -->
		<a href="${url}&page=${totalPage}">
		<span> ▷&nbsp; </span>
		</a>
		
	</div>
</body>
</html>