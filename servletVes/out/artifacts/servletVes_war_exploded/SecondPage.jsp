<%@ page session="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>2nd Page</title>
</head>
<body>
<form action="web3" method="get">
   <%--@declare id="name3"--%><label for="name3">Last Name</label>
    <input type="text" name="name3">
    <input type="submit" value="Next">
</form>

<P>name1=<%= session.getAttribute("name1") %>
<P>name2=<%= session.getAttribute("name2") %>

</body>
</html>