<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.util.*,emp.dto.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<% ArrayList<MyEmpDTO> userlist  =
			(ArrayList<MyEmpDTO>)request.getAttribute("userlist"); 
	   int size = userlist.size();	%>
	<h1>회원목록(MVC)</h1>
	
	<hr/>
	<table align="center" border="1" width="600">
		<tr bgcolor="pink">
			<th><spring:message code="member.form.id"/></th>
			<th><spring:message code="member.form.pass" /></th>
			<th><spring:message code="member.form.name" /></th>
			<th><spring:message code="member.form.addr" /></th>
			<th>부서번호</th>
			<th>삭제</th>
		</tr>
		<%for(int i = 0;i<size;i++){
			MyEmpDTO user = userlist.get(i);%>
			<tr>
				<td>
				<a href = "read.do?id=<%=user.getId()%>">
				<%= user.getId() %></a></td>
				<td><%= user.getPass() %></td>
				<td><%= user.getName() %></td>
				<td><%= user.getAddr()%></td>
				<td><%= user.getDeptno()%></td>
				<td>
		<a href="mybatisdelete.do?id=<%= user.getId() %>">삭제</a></td>
			</tr>
		<%} %>
	</table>
	
</body>
</html>










