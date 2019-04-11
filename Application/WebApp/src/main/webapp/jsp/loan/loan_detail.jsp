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
    <title>Loan detail</title>
</head>
<body>
<h2><s:text name="Detail du pret"/></h2>
<header>
    <%@ include file="../_include/navbar.jsp" %>
</header>
<s:if test="#session.user">
    <table>
        <tbody>
            <tr>
                <td><s:text name="Titre"/></td>
                <td><s:property value="ouvrage.titre"/></td>
            </tr>
            <tr>
                <td><s:text name="Date debut pret"/></td>
                <td><s:property value="loan.dateDebutPret"/></td>
            </tr>
            <s:if test="!loan.prolongation">
            	<tr>
	                <td><s:text name="Date fin pret"/></td>
	                <td><s:property value="loan.dateFinPret"/></td>
	            </tr>
            </s:if>
            <tr>
                <td><s:text name="Prolonger"/></td>
                <s:if test="loan.prolongation">
                    <td><s:a action = "extend_loan">
                            <s:param name="loanId" value="loan.id"/>
                        <s:text name="Prolonger"/>
                        </s:a></td>
                </s:if>
                <s:else>
                    <td><s:text name="Impossible de prolonger ce pret"/></td>
                </s:else>
            </tr>
        </tbody>
    </table>
</s:if>
</body>
</html>