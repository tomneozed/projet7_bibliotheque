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
<header>
    <%@include file="_include/navbar.jsp"%>
</header>
<s:if test="#session.user">
    <li>
        <s:property value="#session.user.username"/>
    </li>
</s:if>
    <ul>
        <li><s:a action="currentLoans">
                <s:text name="Loans"/>
            </s:a>
        </li>
    </ul>
</body>
</html>