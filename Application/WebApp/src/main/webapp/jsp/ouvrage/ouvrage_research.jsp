<%--
  Created by IntelliJ IDEA.
  User: Thomas
  Date: 09/12/2018
  Time: 17:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Recherche d'ouvrage</title>
</head>
<body>
<header>
    <%@ include file="../_include/navbar.jsp" %>
</header>
<h2>Recherche</h2>

<ul>
    <s:iterator value="ouvrageList">
        <li>
            <s:a action="ouvrage_detail">
                <s:param name="id" value="id" />
                <s:property value="titre"/>
            </s:a>
        </li>
    </s:iterator>
</ul>

</body>
</html>
