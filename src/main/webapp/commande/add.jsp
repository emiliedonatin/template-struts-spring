<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>

	<h2>Passer une commande</h2>

	<s:actionerror />

	<s:form action="addAction">
		<s:textfield name="commande.dateCommande" label="Date de la commande" />
	
		<s:textfield name="commande.dateLivraison"  label="Date de livraison" />

		<s:select label="products" headerKey="-1" name="product.id" headerValue="Liste des produits" 
			list="products" ></s:select>
			
		<s:select label="employees" headerKey="-1" name="employee.id" headerValue="Liste des employés" list="employees"></s:select>
		
		<s:submit />
	</s:form>



</body>
</html>