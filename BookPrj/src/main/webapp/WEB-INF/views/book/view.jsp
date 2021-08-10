<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>도서 정보 상세 조회</h1>
<table border ="1">
<tr>
	<th>도서 번호</th>
	<td>${book.bookId}</td>
</tr>
<tr>
	<th>도서 제목</th>
	<td>${book.bookTitle}</td>
</tr>
<tr>
	<th>도서 이미지</th>
	<td><img	src='<c:url	value="/img/${book.bookId}"/>'	width="100"	class="img-thumbnail"></td>
</tr>
<tr>
	<th>도서 저자</th>
	<td>${book.bookAuthor}</td>
</tr>
<tr>
	<th>도서 가격</th>
	<td>${book.bookPrice}</td>
</tr>
<tr>
	<th>위치 이름</th>
	<td>
		<c:forEach var ="location" items ="${locationList}">
		<c:if test="${book.locationId == location.locationId}">
			<option value ="${location.locationId}" selected>${location.locationName}</option>
		</c:if>
		</c:forEach>
	</td>
</tr>
</table>
<a href ="update?bookid=${book.bookId}">수정하기</a>
<a href ="delete?bookid=${book.bookId}">삭제하기</a>
</body>
</html>