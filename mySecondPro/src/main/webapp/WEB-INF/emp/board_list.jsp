<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<head>
<title>게시판</title>

<LINK rel="stylesheet" type="text/css" href="/annotation/common/board_css.css">
</head>


<body>

<!-- 등록버튼 시작 -->
<div id="boardcss_list_add_button_table">
	<div class="boardcss_list_add_button">
		<p class="add_button"><a href="board_write.jsp">글쓰기</a></p>
		<ul></ul>
	</div>
</div>
<!-- 등록버튼 종료 -->

<!-- 테이블 시작 -->
<div class="boardcss_list_table">
	<table class="list_table">
		<caption>게시판 연습</caption>
		<colgroup>
			<col width="15%" />
			<col width="45%" />
			<col width="20%" />
			<col width="20%" />
		</colgroup>
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>이름</th>
				<th>등록일자</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>1</td>
				<td>하이</td>
				<td>정혜지</td>
				<td>2016-06-01</td>
			</tr>
		</tbody>
	</table>
</div>
<!-- 테이블 종료 -->

</body>
</html>
