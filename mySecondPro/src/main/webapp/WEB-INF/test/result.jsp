<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>JSP called by Spring</h1>
	<hr/>
	<h3>JSP로 출력 : <%=request.getAttribute("msg") %></h3>
	<h3>EL(expression Language)로 출력: ${msg}</h3>
	
	<th><spring:message code="member.form.id"/></th>
	<th><spring:message code="member.form.pass" /></th>
	<th><spring:message code="member.form.name" /></th>
	<th><spring:message code="member.form.addr" /></th>
</body>
</html>