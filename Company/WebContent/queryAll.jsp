<%@page import="Dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>查詢(全部)</title>
</head>
<body>
	<table width=600 align="center" border=1>
		<tr>
			<td height=100 align="center">
			<jsp:include page="title.jsp"></jsp:include>
		<tr>
			<td height=400 align="center" valign=top>
			<%=new MemberDao().queryAll() %>
				
		<tr>
			<td height=50 align="center">
			<jsp:include page="end.jsp"></jsp:include>
	</table>
</body>
</html>