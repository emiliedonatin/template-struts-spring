<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Available actions</h1>
        <a href="pages/AddEmployee.jsp">Add Employee</a>
        
        <h1>Locale</h1>
        
        <s:url id="localeEN" namespace="/" action="locale" >
            <s:param name="request_locale" >en</s:param>
        </s:url>
        <s:url id="localeFR" namespace="/" action="locale" >
            <s:param name="request_locale" >fr</s:param>
        </s:url>

        <s:a href="%{localeEN}" >English</s:a>
        <s:a href="%{localeFR}" >French</s:a>
        
        <h2>Message</h2>
        
        <s:text name="test.message" />
        
    </body>
</html>
