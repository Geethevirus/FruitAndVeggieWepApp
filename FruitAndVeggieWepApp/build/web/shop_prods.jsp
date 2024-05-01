<%-- 
    Document   : shop_prods
    Created on : Apr 30, 2024, 7:04:09 PM
    Author     : Gonts
--%>

<%@page import="java.util.List"%>
<%@page import="za.ac.tut.ejb.entities.ProductFv"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Available Items</h1>
        
         <table>
            <thead>
                <th>Product name</th>
                <th>Product Picture</th>
                <th>Product Price</th>
                <th></th>
            </thead>
        
        <%
            List<ProductFv> prods = (List<ProductFv> ) session.getAttribute("products");
            
            
            for (int i = 0; i < prods.size(); i++) {
                    
                String prod_name = prods.get(i).getDescription();
                Double prod_price = prods.get(i).getPrice();
                String prod_code = prods.get(i).getCode();
                String pic_url = prods.get(i).getPic_url();
                
            

        %>
        
        <form action="CustomerController.do" method="POST"> 
            <tr>
                <td><%=prod_name%></td>
                <td><img style="width: 100px; height: 100px" src="assets/<%=pic_url%>"/></td>
                <td>R<%=prod_price%></td>
                <td><input type="submit" name="addToCartbtn" value="Add To Cart"></td>
                <td><input type="hidden" value="<%=prod_code%>" name="prod_code"></td>
            </tr>
        </form>
            
        <%}%>
        </table>
       <p>Click <a href="cust_menu.jsp">Here</a> to navigate to the menu page.</p> 
    </body>
</html>
