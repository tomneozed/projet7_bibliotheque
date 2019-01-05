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
    <h2><s:text name="Loans List"/></h2>
        <s:if test="#session.user">
        <li>
            <s:property value="#session.user.username"/>
            <s:a action="logout">Logout</s:a>
        </li>

        <ul>
            <s:iterator value="loansList">
                <li>
                    <s:a action="loan_detail">
                        <s:param name="loanId" value="id"/>
                        <s:property value="ouvrage.titre"/>
                    </s:a>
                </li>
            </s:iterator>
        </ul>
    </s:if>
</body>
</html>