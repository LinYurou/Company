<%@ page language="java" contentType="text/html; charset=BIG5"
	pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>登入失敗</title>
</head>
<body>
	<table width=600 align="center" border=1>
		<tr>
			<td height=100 align="center">
			<jsp:include page="title.jsp"></jsp:include>
		<tr>
			<td height=400 align="center">
				<table width=400 align="center">
					<tr>
						<td align="center">
						<h3>帳號密碼錯誤~請重新登入~</h3>
					<tr>
						<td align="center">
						<a href="index.jsp">回登入頁</a> 
						<a href="addMember.jsp">註冊頁</a>
				</table>
		<tr>
			<td height=50 align="center">
			<jsp:include page="end.jsp"></jsp:include>
	</table>
</body>
</html>