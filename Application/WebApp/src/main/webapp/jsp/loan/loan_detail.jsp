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
    <table class="table bordered">
        <tbody>
            <tr>
                <td><s:text name="Titre"/></td>
                <td><s:property value="ouvrage.titre"/></td>
            </tr>
            <tr>
                <td><s:text name="Date debut pret"/></td>
                <td><s:property value="loan.dateDebutPret"/></td>
            </tr>
           	<tr>
                <td><s:text name="Date fin pret"/></td>
                <td><s:property value="loan.dateFinPret"/></td>
            </tr>
            <tr>
                <td><s:text name="Etat"/></td>
                <td><s:property value="loan.etat"/></td>
            </tr>
            <tr>
                <td><s:text name="Prolonger"/></td>
                <s:if test="!loan.prolongation && loan.etat !='rendu'">
                    <td><s:a action = "extend_loan">
                            <s:param name="loanId" value="loan.id"/>
                        <s:text name="Prolonger"/>
                        </s:a>
                   	</td>
                </s:if>
                <s:elseif test="loan.prolongation">
                    <td><s:text name="Pret deja prolonge"/></td>
                </s:elseif>
                 <s:elseif test="loan.etat == 'rendu'">
                    <td><s:text name="Pret rendu"/></td>
                </s:elseif>
            </tr>
        </tbody>
    </table>
</s:if>
</body>
</html>