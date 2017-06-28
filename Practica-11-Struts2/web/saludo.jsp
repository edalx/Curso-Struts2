<%-- 
    Document   : saludo
    Created on : 28/06/2017, 10:01:30
    Author     : fing.labcom
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <h1> <s:property value="mensaje"/> </h1>
        <h3>Fecha actual: <b><s:property value="fechaHora"/> </b> </h3>
    </body>
</html>
