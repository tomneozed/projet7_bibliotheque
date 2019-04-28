<%--
  Created by IntelliJ IDEA.
  User: Thomas
  Date: 04/11/2018
  Time: 18:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ouvrages</title>
</head>
<body>
<header>
    <%@ include file="../_include/navbar.jsp" %>
</header>
<h2 class="text-center">Liste des Ouvrages</h2>

<table class="table bordered">
	<thead>
		<tr>
			<th>Titre</th>
			<th>Nombre d'exemplaires disponibles</th>
		</tr>
	</thead>
	<s:iterator value="ouvrageList">
	<tbody>
		<s:if test="nombreExemplairesDispo > 0">
			<tr class="success">
				<td><s:a action="ouvrage_detail">
						<s:param name="ouvrageId" value="id"/>
						<s:property value="titre"/>
					</s:a>
				</td>
				<td>
					<s:property value="nombreExemplairesDispo"/>
				</td>
			</tr>
		</s:if>
		<s:else>
			<tr class="danger">
			<td><s:a action="ouvrage_detail">
					<s:param name="ouvrageId" value="id"/>
					<s:property value="titre"/>
				</s:a>
			</td>
			<td>
				<s:property value="nombreExemplairesDispo"/>
			</td>
		</tr>
		</s:else>
		
		
	</tbody>	
	</s:iterator>
	
</table>




</body>
</html>