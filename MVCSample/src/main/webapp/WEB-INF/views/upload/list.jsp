<%@ page language="java" contentType="text/html; charset=UTF-8" trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   <%@	taglib	prefix="fn"	uri="http://java.sun.com/jsp/jstl/functions"%>
   <%@	taglib	prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"	content="width=device-width,	initial-scale=1.0">
<title>업로드 자료  리스트</title>
<link	href="<c:url	value='/favicon.png'/>"	rel="icon"	type="image/png">
<script	src="//code.jquery.com/jquery-1.11.3.min.js"></script>
<script	type="text/javascript"> 
</script>
</head>
<body>
<h1>자료 목록</h1>
<table border ="1">
<tr>
	<th>파일아이디</th>
	<th>파일</th>
	<th>디렉토리</th>
	<th>파일이름</th>
	<th>파일크기</th>
	<th>형식</th>
	<th>업로드날짜</th>
	<th>삭제</th>
</tr>
<c:forEach var="file" items = "${fileList}">
<tr>
	<td>${file.fileId}</td>
	<td>
		<c:set	var="len"	value="${fn:length(file.fileName)}"/>
		<c:set	var="filetype"	value="${fn:toUpperCase(fn:substring(file.fileName,	len-4,	len))}"/>
		<c:if	test="${(filetype	eq	'.JPG')	or	(filetype	eq	'JPEG')	or	(filetype	eq	'.PNG')	or	(filetype	eq	'.GIF')}">
		<img	src='<c:url	value="/img/${file.fileId}"/>'	width="100"	class="img-thumbnail">
		</c:if>
	</td>
	<td>${file.directoryName}</td>
	<td><a href="../pds/${file.fileId}">${file.fileName}</a></td>
	<td>${file.fileSize}</td>
	<td>${file.fileContentType}</td>
	<td>${file.fileUploadDate}</td>
	<td><a href="./delete/${file.fileId}">삭제</a></td>
</c:forEach>
</table>
</body>
</html>