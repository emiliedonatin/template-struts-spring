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
			<th>First name</th>
			<th>Last name</th>
			<th>Email</th>
			<th>Telephone</th>
		</tr>
		<!-- c'est l'équivalent du foreach -->
		<s:iterator value="employees">
			<tr>
				<td><s:property value="id" /></td>
				<td><s:property value="firstname" /></td>
				<td><s:property value="lastname" /></td>
				<td><s:property value="email" /></td>
				<td><s:property value="telephone" /></td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>
