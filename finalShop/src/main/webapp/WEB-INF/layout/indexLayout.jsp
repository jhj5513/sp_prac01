<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>SHOP</title>
</head>

<body>
	<div style="width: 800px;margin-left: auto;margin-right: auto;">
		<div id = "header">
			<tiles:insertAttribute name="header"></tiles:insertAttribute>
		</div>
		<div id = "top-content">
			<tiles:insertAttribute name="top-content"></tiles:insertAttribute>
		</div>
		<div id = "content">
			<tiles:insertAttribute name="content"></tiles:insertAttribute>
		</div>
		
	</div>
</body>
</html>