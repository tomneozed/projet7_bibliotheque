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
<div class="container">
	<h2 class="text-center"><s:text name="Confirmation nouveau pret"/></h2>
	<s:if test="loanAlreadyExists">
		<div class="text-center">
			<s:text name="Vous avez deja un emprunt sur ce livre"/>
			<s:a action="all_ouvrages">
		    	<s:text name="Tous les ouvrages"/>
			</s:a>
		</div>
	</s:if>
	<s:else>
	<table class="table bordered">
	    <tbody>
	    	<tr>
	            <td><s:text name="Ouvrage"/></td>
	            <td><s:property value="ouvrageTitle"/></td>
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
</div>
</body>
</html>