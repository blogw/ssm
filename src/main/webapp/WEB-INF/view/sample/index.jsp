<%--
  Created by IntelliJ IDEA.
  User: blogw
  Date: 2017/04/13
  Time: 15:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${not empty user}">
    ${user.name}=${user.age}
</c:if>
</body>
</html>
