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
	<h1> 영화 등록 </h1>
</div>

<div class = "insert">

<form action="ms?command=insert" method="post" enctype="multipart/form-data">
		<!--  Http의 바디부분에 데이터를 여러 부분으로 나누어서 전송함 -->
		
	<input type="hidden" name="id" value="${member.id }">
	<table>
		<tr>
		<th>제목</th>
		<td><input type="text" name="title"></td>
		</tr>
		
		<tr>
		<th>감독</th>
		<td><input type="text" name="director"></td>
		</tr>
		
		<tr>
		<th>배우</th>
		<td><input type="text" name="actor"></td>
		</tr>
	
		<tr>
		<th>가격</th>
		<td><input type="number" name="price"></td>
		</tr>
		
		<tr>
		<th>포스터</th>
		<td><div><input type="file" name="poster" onchange="readURL(this);" style="padding:0; text-align:center;">
		<img style="width:500px; height:150px; " id="preview"/></div></td>
		</tr>
		
		
		<tr>
		<th>synopsis</th>
		<td><textarea rows="7" cols="40" name="synopsis">
		
		</textarea></td>
		</tr>		
		
	</table>
	
	<div class="i_button">
		<input type="submit" value="영화등록">&nbsp;
		<input type="button" onclick="location.href='ms?command=list'" value="목록보기">
	</div>
	</form>
</div>
<script>
	function readURL(input) {
	  if (input.files && input.files[0]) {
	    var reader = new FileReader();
	    reader.onload = function(e) {
	      document.getElementById('preview').src = e.target.result;
	    };
	    reader.readAsDataURL(input.files[0]);
	  } else {
	    document.getElementById('preview').src = "";
	  }
	}
</script>
</body>
</html>