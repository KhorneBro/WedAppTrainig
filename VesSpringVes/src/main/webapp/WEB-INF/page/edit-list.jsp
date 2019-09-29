<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Edit Existing Record</h1>

<%--?id=${userAttribute.id}--%>

<%--@elvariable id="userAttribute" type="com.example.entity.UsersEntity"--%>
<c:url var="saveUrl" value="/edit?id=${userAttribute.id}" />
<form:form modelAttribute="userAttribute" method="Post" action="${saveUrl}">
	<table>
		<tr>
			<td><form:label path="name">Name :</form:label></td>
			<td><form:input path="name"/></td>
		</tr>

		<tr>
			<td><form:label path="secondname">Surname :</form:label></td>
			<td><form:input path="secondname"/></td>
		</tr>

		<tr>
			<td><form:label path="lastname">Last Name :</form:label></td>
			<td><form:input path="lastname"/></td>
		</tr>
	</table>
	
	<input type="submit" value="Save" />
</form:form>

</body>
</html>