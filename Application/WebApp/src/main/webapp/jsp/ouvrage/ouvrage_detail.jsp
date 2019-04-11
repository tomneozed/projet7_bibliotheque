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
    <title>Ouvrage detail</title>
    <%@ include file="../_include/navbar.jsp" %>
</head>
<body>
<h2><s:text name="Ouvrage detail"/></h2>

    <table>
        <tbody>
        <tr>
            <td><s:text name="Titre"/></td>
            <td><s:property value="ouvrage.titre"/></td>
        </tr>
        <tr>
            <td><s:text name="Auteur"/></td>
            <td><s:property value="ouvrage.editeur"/></td>
        </tr>
        <tr>
            <td><s:text name="Nombre de pages"/></td>
            <td><s:property value="ouvrage.nombrePages"/></td>
        </tr>
        <tr>
            <td><s:text name="Nombre d/'exemplaires disponibles"/></td>
            <td><s:property value="ouvrage.nombreExemplairesDispo"/></td>
        </tr>
        <tr>
            <td><s:text name="Nature"/></td>
            <td><s:property value="ouvrage.nature"/></td>
        </tr>
        <tr>
            <td><s:text name="Prix"/></td>
            <td><s:property value="ouvrage.prix"/></td>
        </tr>
        <%--<tr>--%>
            <%--<td><s:text name="Prolonger"/></td>--%>
            <%--<s:if test="loan.prolongation">--%>
                <%--<td><s:a action = "extend_loan">--%>
                    <%--<s:param name="loanId" value="loan.id"/>--%>
                    <%--<s:text name="Prolonger"/>--%>
                <%--</s:a></td>--%>
            <%--</s:if>--%>
            <%--<s:else>--%>
                <%--<td><s:text name="Impossible de prolonger ce pret"/></td>--%>
            <%--</s:else>--%>
        <%--</tr>--%>
        </tbody>
    </table>
    
</body>
</html>