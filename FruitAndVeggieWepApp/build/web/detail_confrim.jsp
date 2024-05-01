<%-- 
    Document   : detail_confrim
    Created on : May 1, 2024, 1:48:55 AM
    Author     : Gonts
--%>

<%@page import="za.ac.tut.ejb.entities.Address"%>
<%@page import="za.ac.tut.ejb.entities.LineItems"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Detail Confirmation</h1>
        <h3>Items</h3>
        <hr>
        <table>
            
        
         <%
            
            List<LineItems> cart = (List<LineItems>)request.getAttribute("cart");
            Double amount_due = (Double)request.getAttribute("amount_due");
            Address addr = (Address)session.getAttribute("addr");
            
            String street = addr.getStreet();
            String area = addr.getArea();
            String code = addr.getArea_code();
            
            for (int i = 0; i < cart.size(); i++) {
                    
                    String prod_name = cart.get(i).getName();
                    Integer quantity = cart.get(i).getQuantity();
                    String url_pic = cart.get(i).getProduct().getPic_url();
                    
                    
                    
            
            
        %>
        <tr>
            <td><img style="height: 50px;width: 50px" src="assets/<%=url_pic%>" /></td>
            <td><%=prod_name%></td>
            <td>Quantity: <%=quantity%></td>
        </tr>
        <%}%>
        <tr>
            <td>Amount Due:</td>
            <td>R<%=amount_due%></td>
        </tr>
        
        </table>
        <hr>
        <h3>Address</h3>
        <table>
            <tr>
                <td>Street:</td>
                <td><%=street%></td>
            </tr>
            <tr>
                <td>Area:</td>
                <td><%=area%></td>
            </tr>
            <tr>
                <td>Area Code:</td>
                <td><%=code%></td>
            </tr>
        </table>
            <hr>
            <form action="CustomerController.do" method="POST">
                <input type="submit" name="paybtn" value="PAY">
            </form>
    </body>
</html>
