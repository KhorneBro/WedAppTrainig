<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Records</h1>

<c:url var="addUrl" value="/" />
<table style="border: 1px solid; width: 100%; text-align:center">
	<thead style="background:#d3dce3">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Surname</th>
			<th>Middle Name</th>
			<th colspan="2"></th>
			<%--<th>Опыт Работы</th>--%>
			<%--<th>Специальность</th>--%>
			<%--<th colspan="3"></th>--%>
		</tr>
	</thead>
	<tbody style="background:#ccc">

	<c:forEach items="${usersEntity}" var="usersEntities">
		<c:url var="editUrl" value="/edit?id=${usersEntities.id}" />
		<c:url var="deleteUrl" value="/delete?id=${usersEntities.id}" />

			<tr>
				<td><c:out value="${usersEntities.id}" /></td>
				<td><c:out value="${usersEntities.name}" /></td>
				<td><c:out value="${usersEntities.secondName}" /></td>
				<td><c:out value="${usersEntities.lastName}" /></td>
				<%--<td><c:out value="${webEntity.experience}"/></td>--%>
				<%--<td><c:out value="${webEntity.specialty}"/></td>--%>
				<td><a href="${editUrl}">Edit</a></td>
				<td><a href="${deleteUrl}">Delete</a></td>
			</tr>
	</c:forEach>
	</tbody>
</table>

<c:if test="${empty usersEntity}">
	<h2>No records found.</h2>
</c:if>

<p><a href="${addUrl}">Create new record</a></p>

</body>
</html>