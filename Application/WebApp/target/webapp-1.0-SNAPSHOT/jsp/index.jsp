<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Thomas
  Date: 04/11/2018
  Time: 18:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index</title>
</head>
<body>
<header>
    <%@ include file="_include/navbar.jsp" %>
</header>
INDEX

<s:a action="all_ouvrages">
    <s:text name="Rechercher un ouvrage"/>
</s:a>
</body>
</html>
