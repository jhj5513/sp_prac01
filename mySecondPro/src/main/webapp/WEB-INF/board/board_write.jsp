<%@ page contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page language="java"
	import="java.util.*, java.sql.*, javax.servlet.http.*"%>
<%@ page import="java.io.*, java.text.*"%>

<!-- <script language="javascript">
	function writeCheck()
	{
		var form = document.writeform;
		
		if( !form.tbname.value )
		{
			alert( "�̸��� �����ּ���" );
			form.dbname.focus();
			return;
		}

		if( !form.tbtitle.value )
		{
			alert( "������ �����ּ���" );
			form.tbtitle.focus();
			return;
		}

		if( !form.tbcontents.value )
		{
			alert( "������ �����ּ���" );
			form.tbcontents.focus();
			return;
		}



		form.submit();
	}
</script>  -->

<html>
<head>
<title>�Խ��� �۾���</title>
<LINK rel="stylesheet" type="text/css"
	href="/annotation/common/board_css.css">
</head>
<form name=writeform method=post action="board_write_insert.jsp">

	<div class="board_list_table">
		<table width=600 border=0 cellspacing=0 cellpadding=5>
			<tr>
				<td><b>�̸�</b></td>
				<td><input type=text name=tbname size=50 maxlength=50></td>
			</tr>
			<tr>
				<td><b>����</b></td>
				<td><input type=text name=tbtitle size=50 maxlength=50></td>
			</tr>
			<tr>
				<td><b>����</b></td>
				<td><textarea name=tbcontents cols=50 rows=10></textarea></td>
			</tr>
		</table>
	</div>
</form>


<table cellspacing=0 cellpadding=0 border=0 width=500>
	<tr>
		<td><input type=button value="���"
			OnClick="javascript:writeCheck();"></td>
	</tr>
</table>
</html>
