<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>대여 정보 상세 조회</h1>
<table border="1">
<tr>
	<th>rent_id</th>
	<td>${book_rent.rentId}</td>
</tr>
<tr>
	<th>book_id</th>
	<td>${book_rent.bookId}</td>
</tr>
<tr>
	<th>user_id</th>
	<td>${book_rent.userId}</td>
</tr>
<tr>
	<th>rent_date</th>
	<td>${book_rent.rentDate}</td>
</tr>
<tr>
	<th>return_date</th>
	<td>${book_rent.returnDate}</td>
</tr>
</table>
<a href="update?rentid=${book_rent.rentId}">수정하기</a>
<a href="delete?rentid=${book_rent.rentId}">삭제하기</a>
</body>
</html>