<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>註冊失敗</title>
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
						<h3>帳號重複</h3>
					<tr>
						<td align="center">
						<a href="addMember.jsp">重新註冊</a>
				</table>
		<tr>
			<td height=50 align="center">
			<jsp:include page="end.jsp"></jsp:include>
	</table>
</body>
</html>