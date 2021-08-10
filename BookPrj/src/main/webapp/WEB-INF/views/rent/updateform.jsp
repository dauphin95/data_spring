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
<h1>대여 정보 수정</h1>
<form action="./update" method="post"></form>
<table border="1">
<tr>
	<th>rent_id</th>
	<td><input type="number" name="rentId" value="${book_rent.rentId}" readonly></td>
</tr>
<tr>
	<th>book_id</th>
	<td>
		<select name="bookId">
		<c:forEach var="book" items="${bookList}">
			<c:if test="${book_rent.bookId == book.bookId}">
				<option value="${book.bookId}" selected> ${book.book_title}</option>
			</c:if>
			<c:if test="${book_rent.bookId != book.bookId}">
				<option value="${book.booId}">${book.book_title}</option>
			</c:if>
		</c:forEach>
		</select>
</tr>
<tr>
	<th>user_id</th>
	<td>
		<select name="userId">
		<c:forEach var="users" items="${userList}">
			<c:if test="${book_rent.Id == users.usersId}">
				<option value="${users.userId}" selected> ${users.user_name}</option>
			</c:if>
			<c:if test="${book_rent.bookId != users.userId}">
				<option value="${users.userId}">${users.user_name}</option>
			</c:if>
		</c:forEach>
		</select>
</tr>
<tr>
	<th>rent_date</th>
	<td><input type="date" name="rentDate" value="${book_rent.rentDate}" required></td>
</tr>
<tr>
	<th>rent_id</th>
	<td><input type="date" name="returnDate" value="${book_rent.returnDate}" required></td>
</tr>

</table>
</body>
</html>