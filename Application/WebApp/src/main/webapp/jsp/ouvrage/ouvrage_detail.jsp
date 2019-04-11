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
<h2><s:text name="Detail de l'ouvrage"/></h2>
	<s:if test="#session.user && ouvrage.nombreExemplairesDispo > 0">
        <s:a action="new_loan">
	  		<s:param name="ouvrageId" value="ouvrageId"></s:param>
	      	<s:text name="Reserver cet ouvrage"/>
        </s:a>
    </s:if>
    <s:if test="ouvrage.nombreExemplairesDispo == 0">
    	<s:text name="Plus d'exemplaires disponibles"/>
    </s:if>
    <table>
        <tbody>
        <tr>
            <td><s:text name="OuvrageID"/></td>
            <td><s:property value="ouvrageId"/></td>
        </tr>
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
            <td><s:text name="Nombre d'exemplaires disponibles"/></td>
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
        </tbody>
    </table>
    
</body>
</html>