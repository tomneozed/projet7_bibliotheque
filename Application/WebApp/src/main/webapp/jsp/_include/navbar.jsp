<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>

<html>
<head>
    <title></title>
    <sb:head/>
</head>
<body>

<br/>
<div class="container-fluid">
	<div class="row">
		<!-- <div class="col-md-1"></div> -->
		<div class="col-md-2">
			<s:a action="index">
            	<s:text name="Accueil"/>
        	</s:a>
        	<br/>
        	<s:a action="all_ouvrages">
			    <s:text name="Tous les ouvrages"/>
			</s:a>
		</div>
		<div class="col-md-8 text-center">
			<h1><strong>BIBLIOTHEK</strong></h1>
		</div>
		<div class="col-md-2">
		<s:if test="#session.user">
	            <s:property value="#session.user.username"/>
	            <br/>
	            <s:a action="logout">Deconnexion</s:a>
		    </s:if>
		    <s:else>
            	<s:a action="goToLoginPage">Se connecter</s:a>
   			</s:else>
			<s:if test="#session.user">
				<br/>
        		<s:a action="currentLoans">
            		<s:text name="Prets en cours"/>
        		</s:a>
    		</s:if>
		</div>
		<!-- <div class="col-md-1"></div> -->
	</div>
</div>
<br/>
<br/>
<br/>
</body>
</html>
