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
    <title>Loans List</title>
</head>
<body>
<header>
    <%@ include file="../_include/navbar.jsp" %>
</header>
    <h2><s:text name="Loans List"/></h2>
        <ul>
            <s:iterator value="loansList">
                <li>
                    <s:a action="loan_detail">
                        <s:param name="loanId" value="id"/>
                        <s:property value="dateDebutPret"/>
                    </s:a>
                </li>
            </s:iterator>
        </ul>
</body>
</html>