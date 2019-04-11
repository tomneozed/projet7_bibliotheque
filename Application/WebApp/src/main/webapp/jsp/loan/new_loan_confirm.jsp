<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nouveau Pret</title>
</head>
<body>
<header>
    <%@ include file="../_include/navbar.jsp" %>
</header>
<h2><s:text name="Confirmation nouveau pret"/></h2>
<s:if test="loanAlreadyExists">
	<s:text name="Vous avez déjà un emprunt sur ce livre"/>
	<s:a action="all_ouvrages">
	    <s:text name="Tous les ouvrages"/>
	</s:a>
</s:if>
<s:else>
<table>
    <tbody>
    	<tr class="col-12 row">
            <td class="col-4"><s:text name="Ouvrage"/></td>
            <td class="col-4"><s:property value="ouvrageTitle"/></td>
        </tr>
        <tr>
            <td><s:text name="Date debut pret"/></td>
            <td><s:property value="dateDebutToDisplay"/></td>
        </tr>
        <s:if test="!loan.prolongation">
        	<tr>
             <td><s:text name="Date fin pret"/></td>
             <td><s:property value="dateFinToDisplay"/></td>
         </tr>
        </s:if>
    </tbody>
</table>
</s:else>

</body>
</html>