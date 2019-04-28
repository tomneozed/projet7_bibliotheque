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
    <title>Liste des prets</title>
</head>
<body>
<div class="container">

	<header>
	    <%@ include file="../_include/navbar.jsp" %>
	</header>
    <h2 class="text-center"><s:text name="Liste des prets"/></h2>
    <table class="table bordered">
    	<thead>
    		<tr>
    			<th>Titre</th>
    			<th>Date de debut de pret</th>
    			<th>Date de fin de pret</th>
    			<th>Etat</th>
    			<th> </th>
    		</tr>
    	</thead>
    	<s:iterator value="loansToDisplay">
    		<tbody>
	    		<s:if test="loan.etat == 'non rendu'">
		    		<tr class="danger">
		    			<td>
		    				<s:a action="loan_detail">
		                        <s:param name="loanId" value="loan.id"/>
		                        <s:property value="ouvrage.titre"/>
		                    </s:a>
		    			</td>
		    			<td>
		    				<s:property value="loan.dateDebutPret" />
		    			</td>
		    			<td>
		    				<s:property value="loan.dateFinPret" />
		    			</td>
		    			<td>
		    				<s:property value="loan.etat"/>
		    			</td>
		    			<td>
		    				<s:a action="loan_return">
		                        <s:param name="loanId" value="loan.id"/>
		                        <s:text name="Retourner ouvrage"/>
		                    </s:a>
		    			</td>
		    		</tr>
	    		</s:if>
	    		<s:elseif test="loan.etat == 'rendu'">
	    			<tr class="success">
		    			<td>
		    				<s:a action="loan_detail">
		                        <s:param name="loanId" value="loan.id"/>
		                        <s:property value="ouvrage.titre"/>
		                    </s:a>
		    			</td>
		    			<td>
		    				<s:property value="loan.dateDebutPret" />
		    			</td>
		    			<td>
		    				<s:property value="loan.dateFinPret" />
		    			</td>
		    			<td>
		    				<s:property value="loan.etat" />
		    			</td>
		    		</tr>
	    		</s:elseif>
	    		<s:else>
	    			<tr>
		    			<td>
		    				<s:a action="loan_detail">
		                        <s:param name="loanId" value="loan.id"/>
		                        <s:property value="ouvrage.titre"/>
		                    </s:a>
		    			</td>
		    			<td>
		    				<s:property value="loan.dateDebutPret" />
		    			</td>
		    			<td>
		    				<s:property value="loan.dateFinPret" />
		    			</td>
		    			<td>
		    				<s:property value="loan.etat" />
		    			</td>
		    			<td>
		    				<s:a action="loan_return">
		                        <s:param name="loanId" value="loan.id"/>
		                        <s:text name="Retourner ouvrage"/>
		                    </s:a>
		    			</td>
		    		</tr>
	    		</s:else>
	    	</tbody>
    	</s:iterator>													
    </table>
</div>
</body>
</html>