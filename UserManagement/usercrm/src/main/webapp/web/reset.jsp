<%@page  contentType="text/html; UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>密码重置</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="css/style.css" />
	</head>
	<body>
		<div id="wrap">
			<div id="top_content">
					<div id="header">

						<div id="navigation">
						</div>
					</div>
				<div id="content">
					<p id="whereami">
					</p>
					<h1>
						密码重置
					</h1>
					<form action="${pageContext.request.contextPath}/user/reset" method="post">
						<table cellpadding="0" cellspacing="0" border="0"
							class="form_table">
							<tr>
								<td valign="middle" align="right">
									用户名:
								</td>
								<td valign="middle" align="left">
									<input type="text" class="inputgri" name="username" />
								</td>
							</tr>

							<tr>
								<td valign="middle" align="right">
									原密码:
								</td>
								<td valign="middle" align="left">
									<input type="password" class="inputgri" name="password" />
								</td>
							</tr>

							<tr>
								<td valign="middle" align="right">
									新密码:
								</td>
								<td valign="middle" align="left">
									<input type="password" class="inputgri" name="newpassword" />
								</td>
							</tr>

						</table>
						<p>
							<input type="Submit" class="button" value="提交 &raquo;" />
						</p>
					</form>
				</div>
			</div>
			<div id="footer">
				<div id="footer_bg">
					@余钦科
				</div>
			</div>
		</div>
	</body>
</html>
