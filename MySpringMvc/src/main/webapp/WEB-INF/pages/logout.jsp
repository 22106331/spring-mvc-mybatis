<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 22106331qqcom
  Date: 2017/12/22
  Time: 下午3:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
  <h1>dsfsdfds</h1>
  ${message } <br/>
  <c:forEach items="${bookList}" var="node">
    <c:out value="${node}"></c:out>
  </c:forEach>
</body>
</html>
