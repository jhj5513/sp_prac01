<%@ page contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page language="java"
	import="java.util.*, java.sql.*, javax.servlet.http.*"%>
<%@ page import="java.io.*, java.text.*"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>



<script type="javascript">


	function writeCheck() {
		var form = document.writeform;

		if (!form.tbname.value) {
			alert("�̸��� �����ּ���");
			form.dbname.focus();
			return;
		}

		if (!form.tbtitle.value) {
			alert("������ �����ּ���");
			form.tbtitle.focus();
			return;
		}

		if (!form.tbcontents.value) {
			alert("������ �����ּ���");
			form.tbcontents.focus();
			return;
		}

		form.submit();
	}

	

</script>

<html>
<head>
<title>�Խ��� �۾���</title>
<!-- <LINK rel="stylesheet" type="text/css"
	href="/annotation/common/board_css.css"> -->
	
<jsp:useBean id="now" class="java.util.Date" />
<fmt:formatDate value="${now}" pattern="yyyy-MM-dd a hh:mm" var="today"/>
</head>
<form name="writeform" method=post action="board_write.do">

	<div class="board_list_table">
		<table width=600 border=0 cellspacing=0 cellpadding=5>
			<tr>
				<td><b>��¥</b></td>
				<td><!-- -->				
 					<div id = "today"><%-- ${today} --%>
 					<input type=text name=reg_dtm value="${today}"></div>
 					<input type=hidden name=mod_dtm value="${today}"></div>
 					
				</td>
			</tr>
			<tr>
				<td><b>�̸�</b></td>
				<td><input type=text name=mem_id size=50 maxlength=50></td>
			</tr>
			
			<tr>
				<td><b>����</b></td>
				<td><input type=text name=title size=50 maxlength=50></td>
			</tr>
			<tr>
				<td><b>����</b></td>
				<td><textarea name=text cols=45 rows=10></textarea></td>
				<!-- <input type=hidden name=del_flg value=0></div>
				<input type=hidden name=mod_dtm value=0></div> -->
			</tr>
		</table>
	</div>



<table cellspacing=0 cellpadding=0 border=0 width=500>
	<tr>
		<td><input type="submit" value="���"
			name="boardlist"></td>
<!-- OnClick="javascript:writeCheck();" -->
	</tr>
</table>

</form>
</html>
