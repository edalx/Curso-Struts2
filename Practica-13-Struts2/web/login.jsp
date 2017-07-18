<%-- 
    Document   : login
    Created on : 06/07/2017, 11:52:56
    Author     : edd_a
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <br/><br/><br/><br/>
    <center>
        <h1>Formulario de Autenticaci&oacute;n</h1> 
        <form action="grabar.action" method="post">
            <table>
                <tr><td>Usuario</td><td><input type="text" name="username"/> </td></tr>
                        <tr><td align="center" colspan="2">
                                <input type="submit" value="Entrar"/></td>   
                    </tr>
            </table>
        </form>
    </center>
       
    </body>
</html>
