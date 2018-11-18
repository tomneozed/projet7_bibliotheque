<%--
  Created by IntelliJ IDEA.
  User: Thomas
  Date: 04/11/2018
  Time: 18:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Ouvrages</title>
</head>
<body>
<header>
    <%@ include file="../_include/navbar.jsp" %>
</header>
<h2>Liste des projets</h2>

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