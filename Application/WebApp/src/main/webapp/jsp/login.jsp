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
    <title>Login</title>
</head>
<body>
<header>
    <%@include file="_include/navbar.jsp"%>
</header>
	<s:form action="login" theme="simple" cssClass="form-search">
		<div class="row">
			<div class="col-md-5"></div>
			<div class="col-md-2">
				<s:textfield placeholder="Login" label="Login" key="user.username" class="form-control"/>
			</div>
		    <div class="col-md-5"></div>
	    </div>
	    <div class="row">
	    	<div class="col-md-5"></div>
		    <div class="col-md-2">
		    	<s:password placeholder="mot de passe" label="Mot de passe " key="user.password" class="form-control"/>
		    </div>
		    <div class="col-md-5"></div>
	    </div>
	    <div class="row">
	    	<div class="col-md-5"></div>
	    	<div class="col-md-2">
	    		<s:submit class="btn btn-primary"/>
	    	</div>
	    	<div class="col-md-5"></div>
	    </div>
	    <s:if test="hasActionErrors()">
	    	<br/>
		    <div class="row">
		    	<div class="col-md-5"></div>
		    	<div class="col-md-2">
		    		<s:actionerror/>
		    	</div>
		    	<div class="col-md-5"></div>
		    </div>
	    </s:if>
	</s:form>
</body>
</html>
