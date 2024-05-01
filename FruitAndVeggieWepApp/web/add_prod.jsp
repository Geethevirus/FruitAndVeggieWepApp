<%-- 
    Document   : add_prod
    Created on : Apr 30, 2024, 6:14:42 PM
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
        <h1>Enter Product details</h1>
        <form action="ManagerController.do" method="POST">
            <table>
                <tr>
                    <td>Description(Name):</td>
                    <td><input type="text" name="prod_name" required></td>
                </tr>
                <tr>
                    <td>Price:</td>
                    <td><input type="text" name="prod_price" required></td>
                </tr>
                <tr>
                    <td>Quantity number(1-10):</td>
                    <td><input type="number" step="1" min="1" max="10" name="prod_quantity" required=""></td>
                </tr>
                <tr>
                    <td>Code:</td>
                    <td><input type="text" name="prod_code" required></td>
                </tr>
                <tr>
                    <td>Product Picture url:</td>
                    <td><input type="text" name="prod_url" required></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" name="addbtn" value="submit"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
