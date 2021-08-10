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
<h1>대여 목록</h1>
<a href="<c:url value='/rent/insert'/>">신규 대여 정보 입력</a>
<table border="1">
<tr>
	<th>rent_id</th>
	<th>book_id</th>
	<th>user_id</th>
	<th>rent_date</th>
	<th>return_date</th>
</tr>
<c:forEach var="rent" items="${rentList}">
<tr>
	<td><a href="<c:url value='/rent/${book_rent.rentId}'/>">${book_rent.rentId}</a></td>
	<td><a href="<c:url value='/book/${book.bookId}'/>">${book_rent.bookId}</a></td>
	<td><a href="<c:url value='/user/${users.userId}'/>">${book_rent.userId}</a></td>
	<td>${book_rent.rentDate}</td>
	<td>${book_rent.returnDate}</td>
</tr>
</c:forEach>
</table>
</body>
</html>