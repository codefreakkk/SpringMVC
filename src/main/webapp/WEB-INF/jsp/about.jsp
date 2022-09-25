<%--
  Created by IntelliJ IDEA.
  User: Harsh
  Date: 26-09-2022
  Time: 00:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    this is about page <%String name = (String) request.getAttribute("name");%>
    <%=name%>
</body>
</html>
