<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List Products</title>
</head>
<body>
	<table border="1px" cellpadding="8px">
		<tr>
			<th>ID</th>
			<th>REF</th>
			<th>DESC</th>
		</tr>
		<s:iterator value="products">
			<tr>
				<td><s:property value="id" /></td>
				<td><s:property value="ref" /></td>
				<td><s:property value="description" /></td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>
