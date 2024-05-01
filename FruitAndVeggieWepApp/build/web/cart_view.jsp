<%-- 
    Document   : cart_view
    Created on : Apr 30, 2024, 11:53:40 PM
    Author     : Gonts
--%>

<%@page import="za.ac.tut.ejb.entities.LineItems"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Your cart</h1>
        <hr>
        <table>
            
        <%
            
            List<LineItems> cart = (List<LineItems>)request.getAttribute("cart");
            Double amount_due = (Double)request.getAttribute("amount_due");
            String cartsize = "";
            if (cart.size()==0) {
                    
                    cartsize = "You cart is EMPTY";

            
                }
            
            for (int i = 0; i < cart.size(); i++) {
                    
                    String prod_name = cart.get(i).getName();
                    Integer quantity = cart.get(i).getQuantity();
                    String url_pic = cart.get(i).getProduct().getPic_url();
                    String prod_code = cart.get(i).getProduct().getCode();
                    
                    
            
            
        %>
        
        <form action="CustomerController.do" method="POST">
            <tr>
                <td><%=prod_name%></td>
                <td><img style="height: 50px; width: 50px" src="assets/<%=url_pic%>"/></td>
                <td>Quantity: <input type="text" value="<%=quantity%>" name="prod_quantity"></td>
                <td><input type="submit" value="Update" name="updateBtn"></td>
                <td><input type="submit" value="Remove" name="removeBtn"></td>
                <td><input type="hidden" value="<%=prod_code%>" name="prod_code"></td> 
            </tr>
            <hr>
        </form>
        
        
        <%}%>
        <hr>
        <tr>
            <td>Total amount:</td>
            <td></td>
            <td><%=amount_due%></td>
        </tr>
        </table>
        
        <h1><%=cartsize%></h1>
        <br>
        <p>Click <a href="cust_menu.jsp">Here</a> to go to the <strong>menu Page</strong> or <br>
            Click <a href="shop_prods.jsp">Here</a> to <strong>continue shopping</strong> .
        </p>
        <a href="address_page.jsp">CHECKOUT</a>
    </body>
</html>
