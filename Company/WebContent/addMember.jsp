<%@ page language="java" contentType="text/html; charset=BIG5"
	pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>會員註冊</title>
</head>
<body>
	<table border=1 width=600 align="center">
		<tr>
			<td height=100 align="center"><jsp:include page="title.jsp"></jsp:include>
		<tr>
			<td height=400>
				<form action="AddMemberController" method="post">
					<table width=400 align="center">
						<tr>
							<td colspan=2 align="center">
								<h3>會員註冊</h3>
						<tr>
							<td align="center">帳號
							<td align="center"><input type="text" name="username">
						<tr>
							<td align="center">密碼
							<td align="center"><input type="password" name="password">
						<tr>
							<td align="center">姓名
							<td align="center"><input type="text" name="name">
						<tr>
							<td align="center">地址
							<td align="center"><input type="text" name="address">
						<tr>
							<td align="center">電話
							<td align="center"><input type="text" name="phone">
						<tr>
							<td align="center">行動
							<td align="center"><input type="text" name="mobile">
						<tr>
							<td colspan=2 align="center"><input type="submit" value="OK">
					</table>

				</form>
		<tr>
			<td height=50 align="center"><jsp:include page="end.jsp"></jsp:include>
	</table>
</body>
</html>