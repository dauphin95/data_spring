<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>신규 도서 입력</title>
</head>
<body>
<h1>신규 도서 정보 입력</h1>
<form action = "./insert" method="post">
<table border ="1">
<tr>
	<th>도서 번호</th>
	<td><input type ="number" name="bookId" required></td>
</tr>
<tr>
	<th>도서 제목</th>
	<td><input type ="text" name="bookTitle" required></td>
</tr>
<tr>
	<th>도서 이미지</th>
	<td><input type ="file" name="bookImage" required></td>
</tr>
<tr>
	<th>도서 저자</th>
	<td><input type ="text" name="bookAuthor" required></td>
</tr>
<tr>
	<th>도서 가격</th>
	<td><input type ="number" name="bookPrice" required></td>
</tr>
<tr>
	<th>위치 이름</th>
	<td>
		<select name ="locationId">
		<c:forEach var = "location" items ="${locationList}">
			<option value = "${location.locationId}">${location.locationName}</option>
		</c:forEach>
		</select>
	</td>
</tr>
<tr>
	<th>&nbsp;</th>
	<td>
		<input type ="submit" value ="저장">
		<input type ="reset" value ="취소">
	</td>
</tr>
</table>
</form>
</body>
</html>