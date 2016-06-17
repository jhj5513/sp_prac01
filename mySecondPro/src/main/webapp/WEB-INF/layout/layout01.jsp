<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- 외부 라이브러리에서 가져오는 태그를 쓸 때 -->
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %> 

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>

<style type = "text/css" >
	#left{
		width: 25%;
		float: left;
	}
	#content {
		width : 75%;
		float : right;
	}

</style>
<body>
	<div id = "header">
		<tiles:insertAttribute name="header"></tiles:insertAttribute>
	</div>
	<div id = "left">
		<tiles:insertAttribute name="left"></tiles:insertAttribute>	
	</div>
	<div id = "content">
		<tiles:insertAttribute name="content"></tiles:insertAttribute>
	</div>
</body>
</html>