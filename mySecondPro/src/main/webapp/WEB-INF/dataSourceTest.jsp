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
	<h1>JNDI�� �̿��ؼ� connection pool �����ϱ�~!!</h1>
	
	<hr/>
	<h3>
	WAS���� �����ϴ� connection pool�� �̿��Ͽ� connection�����ϱ�:
	WAS���� ��ϵ� Ŀ�ؼ� Ǯ�� �����ϴ� ����� ��� �ٸ��⿡ Ŀ�ؼ��� ���� �� �ִ� ǥ�� API�� �־�� �ϰ�.
	javax.sql ��Ű���� datasource�� ǥ�� API��.
	context.xml <resource>�� ��ϵǾ��ִ� name���� lookup �ؼ� ã�ƿ� �� �̿�
	</h3>
	<% 
		//1. WAS�� ��ϵ� �ڿ��� ã�ƿ��� ���� ��ü�� ����
		InitialContext context = new InitialContext();
	
		//2. InitialContext ��ü�� lookup�޼ҵ忡 ã�� resource�� �̸��� �����Ͽ� �ڿ��� ã�ƿ´�
		//context.lookup("java:comp/env/jdbc/myspring");
		DataSource ds = (DataSource)context.lookup("java:comp/env/jdbc/myspring");
		//���� driverManager�� �̿��ؼ� Connection�� ���ϴ� �۾���, ��û�� ���� ������
		//Conenction�� ���� return������
		//DataSource�� �̿��ؼ� Connection �� ���ϴ� �۾��� �̸� ����� ���� Ŀ�ؼ� Ǯ�� �����ؼ�
		//Ŀ�ؼ��� �޾ƿ� �����Ѵ�.
		Connection con = ds.getConnection();
		System.out.println("Connection : " + con);
	%>

</body>
</html>