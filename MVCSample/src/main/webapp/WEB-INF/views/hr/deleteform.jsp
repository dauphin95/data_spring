<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사원 정보 삭제</title>
</head>
<body>
<h1>사원 정보 삭제 페이지</h1>
*** ${emp.employeeId}번 사원 ${emp.firstName} ${emp.lastName} 정보 삭제 ***<p>
삭제를 원하시는 ${emp.employeeId}번 사원의 email을 입력해주세요. <p>
(주의 : 삭제 후 해당 데이터는 복구될 수 없습니다. email을 정확히게 입력해주세요.)
<form action ="./delete" method="post">
Email : <input type ="text" name="email">
<input type="hidden" name="empid" value="${emp.employeeId}">
<input type="submit" value="삭제">
</form> 
</body>
</html>