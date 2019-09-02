<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 08.08.2019
  Time: 14:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Person</title>
</head>
<body>
<form action="Name" method="post">
    <table>
        <tr>
            <td> <%--@declare id="firstname"--%><label for="firstname">firstname</label> </td>
            <td> <input type = "text" name="firstname" size="20"> </td>
        </tr>
        <tr>
            <td> <%--@declare id="lastname"--%><label for="lastname">lastname</label> </td>
            <td> <input type = "text" name="lastname" size="20"> </td>
        </tr>
        <tr>
            <td> <%--@declare id="password"--%><label for="password">password</label> </td>
            <td> <input type = "password" name="password" size="20"> </td>
        </tr>
        <tr> <td>sex</td>
        <td> <input type = "radio" name="sex" value ="male" checked
                ="checked">male
            <input type = "radio" name="sex" value ="female">female </td>
        </tr>
    </table>
    <br> <input type="submit" name="press" value="OK" size="20">
         <input type="submit" name="press" value="Cancel" size="20">
</form>
</body>
</html>
