<%@ page language="java" contentType="text/html; charset=BIG5"
	pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>會員登入</title>
</head>
<body>
	<table border=1 width=600 align="center">
		<tr>
			<td height=100 align="center"><jsp:include page="title.jsp"></jsp:include>
		<tr>
			<td height=400>
				<form action="LoginController" method="post">
					<table width=400 align="center">
						<tr>
							<td align="center">帳號
							<td align="center"><input type="text" name="username">
						<tr>
							<td align="center">密碼
							<td align="center"><input type="password" name="password">
						<tr>
							<td colspan=2 align="center"><input type="submit" value="OK">
					</table>
				</form>
		<tr>
			<td height=50 align="center"><jsp:include page="end.jsp"></jsp:include>
	</table>
</body>
</html>