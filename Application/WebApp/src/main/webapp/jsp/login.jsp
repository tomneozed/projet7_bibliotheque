<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Thomas
  Date: 09/11/2018
  Time: 20:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<s:form action="login">
    <s:textfield label="Username " key="username" />
    <s:password label="Password " key="password" />
    <s:submit />
</s:form>
</body>
</html>
