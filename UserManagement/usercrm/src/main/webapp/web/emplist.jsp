<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page  contentType="text/html; UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>员工信息界面</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/web/css/style.css" />
	</head>
	<body>
		<div id="wrap">
			<div id="top_content"> 
				<div id="header">
					<div id="topheader">
						<h1 id="title">
							<a href="#">欢迎使用员工管理系统！</a>
						</h1>
					</div>
					<div id="navigation">
					</div>
				</div>
				<div id="content">
					<p id="whereami">
					</p>
					<h1>
						Welcome ${sessionScope.user.realname}!
					</h1>
					<table class="table">
						<tr class="table_header">
							<td>
								ID
							</td>
							<td>
								名字
							</td>
							<td>
								工资
							</td>
							<td>
								年龄
							</td>
							<td>
								操作
							</td>
						</tr>
						<c:forEach items="${requestScope.emps}" var="emp">
							<tr class="row1">
								<td>
									${emp.id}
								</td>
								<td>
									${emp.name}
								</td>
								<td>
									${emp.salary}
								</td>
								<td>
									${emp.age}
								</td>
								<td>
									<a href="${pageContext.request.contextPath}/emp/delete?id=${emp.id}">删除信息</a>&nbsp;
									<a href="${pageContext.request.contextPath}/emp/findOne?id=${emp.id}">更改信息</a>
								</td>
							</tr>
						</c:forEach>


					</table>
					<p>
						<input type="button" class="button" value="增加员工信息" onclick="location='${pageContext.request.contextPath}/usercrm/addEmp.jsp'"/>
					</p>
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
