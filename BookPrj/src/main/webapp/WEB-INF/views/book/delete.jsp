<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 정보 삭제</title>
</head>
<body>
<h1>도서 정보 삭제</h1>
'${book.bookTitle}' 도서의 정보를 삭제를 삭제합니다.<p>
삭제를 원하시는 ${book.bookId}번 도서의 도서제목을 입력해주세요. <p>
(주의 : 삭제 후 해당 데이터는 복구될 수 없습니다. 도서제목을 정확히게 입력해주세요.)
<form action ="./delete" method="post">
도서제목 : <input type ="text" name="booktitle">
<input type="hidden" name="bookid" value="${book.bookId}">
<input type="submit" value="삭제">
</form> 
</body>
</html>
