<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>회원 가입</title>
</head>
<body>
	<h2>회원 정보 입력</h2>
	<form:form action="step3" modelAttribute="registerRequest">
	<p>
		<label>이메일:<br>
		<form:input path="email" />
		</label>
	</p>
	<p>
		<label>이름:<br>
		<form:input path="name" />
		</label>
	</p>
	<p>
		<label>비밀번호:<br>
		<form:password path="password" />
		</label>
	</p>
	<p>
		<label>비밀번호 확인:<br>
		<form:password path="confirmPassword" />
		</label>
	</p>
	<input type="submit" value="가입 완료">
	</form:form>
</body>
</html>