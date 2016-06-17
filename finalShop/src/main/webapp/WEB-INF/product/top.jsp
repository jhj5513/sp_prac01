<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>


<link rel="stylesheet" href="/finalShop/resources/common/css/lavalamp_test.css" type="text/css"
	media="screen">
<script type="text/javascript" src="/finalShop/resources/common/js/jquery-1.2.3.min.js"></script>
<script type="text/javascript" src="/finalShop/resources/common/js/jquery.easing.min.js"></script>
<script type="text/javascript" src="/finalShop/resources/common/js/jquery.lavalamp.min.js"></script>
<script type="text/javascript">



</script>


</head>
<body>
	<div style ="margin-left: auto; margin-right: auto; " >
		<h1 style= "float: left; font: 40px Georgia Bold, sans-serif;text-align: center;">자바나라 쇼핑몰</h1>

		<div>
			<h5 style="float: right; margin-left: 10px" id=a>
				<a href="#">오늘의날씨</a>
			</h5>
			<h5 style="float: right; margin-left: 10px">
				<a href="#">게시판</a>
			</h5>
			<h5 style="float: right; margin-left: 10px">e-book</h5>


			<h5 style="float: right; margin-left: 10px">님</h5>
			<h5 style="float: right; margin-left: 10px">
				<a href="#">로그아웃</a>
			</h5>


			<h5 style="float: right; margin-left: 10px">
				<a href="#">회원가입</a>
			</h5>

			<h5 style="float: right; margin-left: 10px">
				<a href="#">로그인</a>
			</h5>

		</div>
		<div>
			<ul class="lavaLampNoImage" id="menu">
				<li class="current"><a href="/finalShop/resources/prdlist.do">Home</a></li>
				
				<li><a href="/finalShop/resources/prdlist.do?category=CAT000000001&pathurl=../prdlist.jsp">DRESS</a></li>
				<li><a href="/finalShop/resources/prdlist.do?category=CAT000000002&pathurl=../prdlist.jsp">TOP</a></li>
				<li><a href="/finalShop/resources/prdlist.do?category=CAT000000003&pathurl=../prdlist.jsp">BOTTOM</a></li>
				<li><a href="/finalShop/resources/prdlist.do?category=CAT000000004&pathurl=../prdlist.jsp">OUTER</a></li>
				<li><a href="/finalShop/resources/prdlist.do?category=CAT000000005&pathurl=../prdlist.jsp">ACC</a></li>
				<li><a href="/finalShop/resources/prdlist.do?category=CAT000000006&pathurl=../prdlist.jsp">CARDIGAN</a></li>
			</ul>
		</div>
	</div>
</body>
</html>