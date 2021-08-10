<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>대여 정보 삭제</h1>
${book_rent.rentId}대여 ${book_rent.bookId}책의 정보를 삭제합니다.<p>
${book.rent.userId}정보를 지우시려면 사용자 아이디를 입력하세요.
<form action="./delete" method="post">
사용자 : <input type="number" name="userId">
<input type="hidden" name="rentid" value="${book_rent.rentId}">
<input type="submit" value="삭제">
</form> 
</body>
</html>