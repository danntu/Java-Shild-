<%--
  Created by IntelliJ IDEA.
  User: mdaniyar
  Date: 9/29/17
  Time: 2:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <form name="form1" action="/ColorGetServlet">
    <b>Color:</b>
        <select name="color" size="1">
            <option option ="Red">Red</option>
            <option option ="Green">Green</option>
            <option option ="Blue">Blue</option>
        </select>
        <input type="submit" value="submit">
    </form>
</center>
</body>
</html>
