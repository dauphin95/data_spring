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
<h1>대여 정보 입력</h1>
<form action="./insert" method="post">
<table border="1">
<tr>
	<th>rent_id</th>
	<td><input type="number" name="rentId" required></td>
</tr>
<tr>
	<th>book_id</th>
	<td>
		<select name="bookId">
		<c:forEach var="book" items="${bookList}">
			<option value="${book.bookId}">${book.book_title}</option>
		</c:forEach>
		</select>
	</td>
</tr>
<tr>
	<th>user_id</th>
	<td>
		<select name="userId">
		<c:forEach var="users" items="${bookList}">
			<option value="${users.userId}">${users.user_name}</option>
		</c:forEach>
		</select>	
	<td>
</tr>
<tr>
	<th>rent_date</th>
	<td><input type="date" name="rentDate" required></td>
</tr>
<tr>
	<th>return_date</th>
	<td><input type="date" name="returnDate" ></td>
	
</tr>
<tr>
	<th>&nbsp;</th>
	<td>
		<input type="submit" value="저장">
		<input type="reset" value="취소">
	</td>
</tr>
</table>
</form>
</body>
</html>