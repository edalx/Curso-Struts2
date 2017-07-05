<%-- 
    Document   : login
    Created on : 05/07/2017, 9:51:49
    Author     : fing.labcom
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Formulario de autenticación</h1>
        <form action="paquete1/login.action" method="post">
        <table>
            <tr>
                <td> Usuario </td> <td> <input type="text" name="username"/></td>
            </tr>
            <tr>
                <td> Password</td> <td> <input type="text" name="password"/></td>
            </tr>
            <tr>
                <td align="center" colspan="2"><input type="submit" value="Entrar"/></td>
            </tr>
        </table>
            </form>
    </body>
</html>
