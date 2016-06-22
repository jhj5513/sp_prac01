<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.util.*,board.dto.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<% ArrayList<MyBoardDTO> boardlist  =
			(ArrayList<MyBoardDTO>)request.getAttribute("boardlist"); 
	   int size = boardlist.size();	
	   %>
<head>
<title>게시판</title>

<LINK rel="stylesheet" type="text/css" href="/mySecondPro/res/css/board_css.css">
</head>


<body>

<h3>게시판</h3>
<hr>

<!-- 테이블 시작 -->
<div class="boardcss_list_table">
	<table class="list_table">
		<caption>게시판 연습</caption>
		<colgroup>
			<col width="5%" />
			<col width="45%" />
			<col width="10%" />
			<col width="10%" />
			<col width="5%" />
		</colgroup>
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>이름</th>
				<th>등록일자</th>
				<th>조회수</th>
			</tr>
		</thead>
		<tbody>
		
	<% for(int i = 0;i<size;i++){
			MyBoardDTO blist = boardlist.get(i);%>
		
			<tr>
				<td><%= blist.getBoard_no() %></td>
				<td><a href="#">
				<%= blist.getTitle() %></a></td>
				<td><%= blist.getMem_id() %></td>
				<td><%= blist.getMod_dtm() %></td>
				<td><%= blist.getCount() %></td>
			</tr>
		</tbody>
			<%} %>
	</table>
</div>
<!-- 테이블 종료 -->
<hr>
<!-- 등록버튼 시작 -->
<div id="boardcss_list_add_button_table">
	<div class="boardcss_list_add_button">
		<p class="add_button"><a href="board_write.do">글쓰기</a></p>
		<ul></ul>
	</div>
</div>
<!-- 등록버튼 종료 -->

</body>
</html>
