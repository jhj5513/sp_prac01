<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.sql.*, javax.sql.*, javax.naming.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>JNDI를 이용해서 connection pool 접근하기~!!</h1>
	
	<hr/>
	<h3>
	WAS에서 지원하는 connection pool을 이용하여 connection관리하기:
	WAS마다 등록된 커넥션 풀에 접근하는 방법이 모두 다르기에 커넥션을 얻어올 수 있는 표준 API가 있어야 하고.
	javax.sql 패키지의 datasource가 표준 API임.
	context.xml <resource>에 등록되어있는 name으로 lookup 해서 찾아온 후 이용
	</h3>
	<% 
		//1. WAS에 등록된 자원을 찾아오기 위한 객체를 생성
		InitialContext context = new InitialContext();
	
		//2. InitialContext 객체의 lookup메소드에 찾을 resource의 이름을 정의하여 자원을 찾아온다
		//context.lookup("java:comp/env/jdbc/myspring");
		DataSource ds = (DataSource)context.lookup("java:comp/env/jdbc/myspring");
		//기존 driverManager를 이용해서 Connection을 구하는 작업은, 요청이 들어올 때마다
		//Conenction을 만들어서 return하지만
		//DataSource를 이용해서 Connection 을 구하는 작업은 미리 만들어 놓은 커넥션 풀에 접근해서
		//커넥션을 받아와 리턴한다.
		Connection con = ds.getConnection();
		System.out.println("Connection : " + con);
	%>

</body>
</html>