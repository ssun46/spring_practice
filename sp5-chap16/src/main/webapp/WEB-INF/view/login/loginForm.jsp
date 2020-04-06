<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title><spring:message code="login.title" /></title>
</head>
<body>
	<form:form modelAttribute="loginCommand">
	<form:errors />
	<p>
		<label><spring:message code="email" />
		<form:input path="email" />
		<form:errors path="email" />
		</label>
	</p>
	<p>
		<label><spring:message code="password" />
		<form:password path="password" />
		<form:errors path="password" />
		</label>
	</p>
	<p>
		<label><spring:message code="rememberEmail" />:
		<form:checkbox path="rememberEmail" />
		</label>
	</p>
	<input type="submit" value="<spring:message code="login.btn" />">
	</form:form>
</body>
</html>