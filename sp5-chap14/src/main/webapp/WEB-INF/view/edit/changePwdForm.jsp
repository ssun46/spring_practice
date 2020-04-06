<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title><spring:message code="change.pwd.title" /></title>
</head>
<body>
	<form:form>
	<form:errors />
	<p>
		<label><spring:message code="currentPassword" />
		<form:input path="currentPassword" />
		<form:errors path="currentPassword" />
		</label>
	</p>
	<p>
		<label><spring:message code="newPassword" />
		<form:password path="newPassword" />
		<form:errors path="newPassword" />
		</label>
	</p>
	<input type="submit" value="<spring:message code="change.btn" />">
	</form:form>
</body>
</html>