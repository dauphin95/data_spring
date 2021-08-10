<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 정보</title>
</head>
<body>
<a href="<c:url value ='/book/insert'/>"> 신규 도서 정보 입력 </a>
<table border="1">
<tr>
	<th>도서 번호</th>
	<th>도서 제목</th>
	<th>도서 표지</th>
	<th>도서 저자</th>
	<th>도서 가격</th>
	<th>위치 번호</th>
</tr>
<c:forEach var ="book" items="${bookList}">
<tr>
	<td><a href="<c:url value ='book/${book.bookId}'/>">${book.bookId}</a></td>
	<td>${book.bookTitle}</td>
	<td><img src='<c:url	value="/img/${book.bookId}"/>'	width="100"	class="img-thumbnail"></td>
	<td>${book.bookAuthor}</td>
	<td>${book.bookPrice}</td>
	<td>${book.locationId}</td>
</tr>
</c:forEach>
</table>
</body>
</html>