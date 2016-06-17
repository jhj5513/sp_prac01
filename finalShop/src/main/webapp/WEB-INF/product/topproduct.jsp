<%@page import="product.dto.ProductDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<link rel="shortcut icon" href="../favicon.ico">
<link rel="stylesheet" type="text/css"
	href="/finalShop/resources/common/css/demo.css" />
<link rel="stylesheet" type="text/css"
	href="/finalShop/resources/common/css/style.css" />
<link
	href='http://fonts.googleapis.com/css?family=Open+Sans+Condensed:700,300,300italic'
	rel='stylesheet' type='text/css'>
<script type="text/javascript"
	src="/finalShop/resources/common/js/modernizr.custom.79639.js"></script>

<%
	ArrayList<ProductDTO> topproduct = (ArrayList<ProductDTO>) request.getAttribute("topprdlist");
	int size = topproduct.size();
%>
</head>
<body>
	<div class="container">


		<section class="main">

		<div class="ia-container">
			<%=size%>

			<%
				for (int i = 0; i < size; i++) {
					ProductDTO pro = topproduct.get(i);
			%>
			<figure> <img
				src="/finalShop/resources/images/product/<%=pro.getImg_gen_file_nm()%>" alt=" image01" />
			<input type="radio" name="radio-set" /> <figcaption> <span><%=pro.getPrd_nm()%></span></figcaption>
			<%
				}
			%> 
			</figure>
			</figure>
			</figure>
			</figure>
			</figure>
			</figure>
			</figure>
			</figure>



		</div>
		<!-- ia-container --> </section>

	</div>
</body>
</html>