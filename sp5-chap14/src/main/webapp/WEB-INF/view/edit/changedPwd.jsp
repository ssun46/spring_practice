<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title><spring:message code="change.pwd.title" /></title>
</head>
<body>
	<p>
		<spring:message code="change.pwd.done" />
	</p>
	<p>
		<a href="<c:url value="/main" />">
			[<spring:message code="go.main" />]
		</a>
	</p>
</body>
</html>