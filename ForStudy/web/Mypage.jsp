<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.DateFormat" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%!
    String getFormattedDate()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");
        return sdf.format(new Date());
    }
%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Добро пожаловать, JSP!</title>
</head>
<body>
<h1>Добро пожаловать!</h1>
<i>Сегодня <%= getFormattedDate() %></i>
</body>


<form action="${pageContext.request.contextPath}/out" method="get">
    <label><p>Name:
        <input type="text" name="username"><br /></p>
        <input type="submit" value="Go" />
    </label>
</form>


</html>