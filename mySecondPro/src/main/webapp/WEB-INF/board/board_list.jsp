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
<title>�Խ���</title>

<LINK rel="stylesheet" type="text/css" href="/mySecondPro/res/css/board_css.css">
</head>


<body>

<h3>�Խ���</h3>
<hr>

<!-- ���̺� ���� -->
<div class="boardcss_list_table">
	<table class="list_table">
		<caption>�Խ��� ����</caption>
		<colgroup>
			<col width="5%" />
			<col width="45%" />
			<col width="10%" />
			<col width="10%" />
			<col width="5%" />
		</colgroup>
		<thead>
			<tr>
				<th>��ȣ</th>
				<th>����</th>
				<th>�̸�</th>
				<th>�������</th>
				<th>��ȸ��</th>
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
<!-- ���̺� ���� -->
<hr>
<!-- ��Ϲ�ư ���� -->
<div id="boardcss_list_add_button_table">
	<div class="boardcss_list_add_button">
		<p class="add_button"><a href="board_write.do">�۾���</a></p>
		<ul></ul>
	</div>
</div>
<!-- ��Ϲ�ư ���� -->

</body>
</html>
