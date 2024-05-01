<%-- 
    Document   : address_page
    Created on : May 1, 2024, 1:14:53 AM
    Author     : Gonts
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>You almost done :)</h1>
        <p>Please enter your address details</p>
        <hr>
        <form action="CustomerController.do" method="POST">
            <table>
                <tr>
                    <td>Street:</td>
                    <td><input type="text" name="street"></td>
                </tr>
                <tr>
                    <td>Area:</td>
                    <td><input type="text" name="area"></td>
                </tr>
                <tr>
                    <td>Code:</td>
                    <td><input type="text" name="area_code"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="CONTINUE" name="addrBtn"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
