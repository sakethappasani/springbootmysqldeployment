<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="jakarta.tags.core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Students</title>
</head>
<body>
	<h3 align="center">View All Students</h3>
	<table align="center" border="1px solid black">
		<tr>
			<td>Student ID</td>
			<td>Student Name</td>
		</tr>
		<c:forEach var="student" items="${stuList}">
			<tr>
				<td>${student.id}</td>
				<td>${student.name}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>