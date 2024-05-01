<%-- 
    Document   : cust_menu
    Created on : Apr 30, 2024, 7:02:31 PM
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
        <h1>Customer Menu</h1>
        <p>1.Click <a href="shop_prods.jsp">Here</a> to shop.</p>
        <p>1.Click <a href="address_page.jsp">Here</a> to shop CHECKOUT.</p>
        <form action="CustomerController.do" method="POST">
            <input type="submit" value="view cart" name="viewCartBtn">
        </form>
    </body>
</html>
