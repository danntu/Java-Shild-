<%--
  Created by IntelliJ IDEA.
  User: mdaniyar
  Date: 9/28/17
  Time: 3:27 PM
  To change thistest template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Testing</title>
  </head>
  <body>
  <a href="http://localhost:8080/HelloServlet">Servlet</a>
  <form name="from1" method="post" action="/HelloServlet">
  Employee <input type="text" name="e">
    Phone <input type="text" name="p">
    <input type="submit" value="Submit">
  </form>
  </body>
</html>
