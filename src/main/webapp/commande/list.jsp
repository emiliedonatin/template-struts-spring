<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List Employee</title>
</head>
<body>
	<table border="1px" cellpadding="8px">
		<tr>
			<th>ID</th>
			<th>Date de la commande</th>
			<th>Date de livraison</th>
			<th>Liste des produits</th>
			<th>Nom du client</th>
		</tr>
		<!-- c'est l'équivalent du foreach -->
		<s:iterator value="commandes">
			<tr>
				<td><s:property value="id" /></td>
				<td><s:property value="dateCommande" /></td>
				<td><s:property value="dateLivraison" /></td>
				<td><s:property value="products" /></td>
				<td><s:property value="employee" /></td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>
