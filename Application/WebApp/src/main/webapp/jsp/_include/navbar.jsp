<%--
  Created by IntelliJ IDEA.
  User: Thomas
  Date: 16/11/2018
  Time: 16:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<ul>
    <li><s:a action="index">
            <s:text name="Home"/>
        </s:a>
    </li>

    <s:if test="#session.user">
        <li><s:a action="currentLoans">
            <s:text name="Current Loans"/>
        </s:a>
        </li>
    </s:if>
    <s:if test="#session.user">
        <li>
            <s:property value="#session.user.username"/>
        </li>
        <li>
            <s:a action="logout">Logout</s:a>
        </li>
    </s:if>
    <s:else>
        <li>
            <s:a action="login">Login</s:a>
        </li>
    </s:else>
</ul>

</body>
</html>
