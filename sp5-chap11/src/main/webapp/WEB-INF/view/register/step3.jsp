<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>회원 가입</title>
</head>
<body>
	<p><strong>${registerRequest.name}님</strong>
		회원 가입을 완료했습니다.</p>
	<p><a href="<c:url value="/main" />">[첫 화면 이동]</a></p>
</body>
</html>