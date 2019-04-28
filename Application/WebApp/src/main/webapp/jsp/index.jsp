<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Thomas
  Date: 04/11/2018
  Time: 18:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<html>
<head>
    <title>Accueil</title>
    <sb:head/>
</head>
<body>
<header>
    <%@ include file="_include/navbar.jsp" %>
</header>
	<div class="container-fluid">
		<div class="text-center">
			<strong>Rechercher un ouvrage</strong>	
		</div>
		<br/>
		<div class="row ">
			<s:form action="ouvrages_research" theme="simple" cssClass="form-search">
				<div class="col-md-5"></div>
				<div class="col-md-2">
					<s:textfield type="text" key="research" class="form-control" placeholder="Recherche"/>
				</div>
				<div class="col-md-2">
					<s:submit class="btn btn-primary" />
				</div>
				<div class="col-md-3"></div>
			</s:form>					
			<s:if test="hasActionErrors()">
				<div class="errors">
					<s:actionerror/>
				</div>
			</s:if>
		</div>
	</div>
</body>
</html>
