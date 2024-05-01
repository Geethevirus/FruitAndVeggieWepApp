/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.tut.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.ejb.bl.CartSBLocal;
import za.ac.tut.ejb.bl.Customer_ordersFacadeLocal;
import za.ac.tut.ejb.bl.ProductFvFacadeLocal;
import za.ac.tut.ejb.entities.Address;
import za.ac.tut.ejb.entities.Customer_orders;
import za.ac.tut.ejb.entities.LineItems;
import za.ac.tut.ejb.entities.ProductFv;

/**
 *
 * @author Gonts
 */
public class CustomerController extends HttpServlet {
    
    @EJB
    private ProductFvFacadeLocal pfl;
    @EJB
    private CartSBLocal cart;
    @EJB
    private Customer_ordersFacadeLocal col;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        HttpSession session = request.getSession(true);
        
        String cartbtn = request.getParameter("addToCartbtn");
        String removeBtn = request.getParameter("removeBtn");
        String updateBtn = request.getParameter("updateBtn");
        String addrBtn = request.getParameter("addrBtn");
        String paybtn = request.getParameter("paybtn");
        
        
        
        String url = "cart_view.jsp";
        
        if (cartbtn != null) {
            
            String code = request.getParameter("prod_code");
            
            
            ProductFv prod = getProduct(code);
            
            LineItems item = new LineItems(prod, prod.getDescription(),1 );
            
            cart.addItem(item);
            
            url = "cart_view.jsp";
            
        }
        
        if (removeBtn != null) {
            
            String code = request.getParameter("prod_code");
            cart.removeItem(code);
            
            url = "cart_view.jsp";
        }
        
        if (updateBtn != null) {
            
            String code = request.getParameter("prod_code");
            Integer q = Integer.valueOf(request.getParameter("prod_quantity"));
            
            cart.updateQuantity(q,code);
            url = "cart_view.jsp";
            
        }
        if (addrBtn != null) {
            
            String street = request.getParameter("street");
            String area_code = request.getParameter("area_code");
            String area = request.getParameter("area");
            
         
          
            Address addr = new Address(street, area, area_code);
            session.setAttribute("addr", addr);
            
            url="detail_confrim.jsp";
        }
        
        List<LineItems> cartItems = cart.getCart();
        Double amount_due = cart.amount_due();
        
        if (paybtn != null) {
            
            Address addr = (Address)session.getAttribute("addr");
            
            
            Customer_orders co = new Customer_orders();
            co.setAddress(addr);
            co.setAmount_due(amount_due);
            co.setCreation_time(new Date());
            co.setOrderedItems(cartItems);
            
            col.create(co);
            
            
            url="order_outcome.jsp";
        }
        
        request.setAttribute("cart", cartItems);
        request.setAttribute("amount_due", amount_due);
        
        RequestDispatcher disp = request.getRequestDispatcher(url);
        disp.forward(request, response);
        
    }
    public ProductFv getProduct(String prod_code)
    {
        
        List<ProductFv> prods = pfl.findAll();
        
        for (int i = 0; i < prods.size(); i++) {
            
            if (prods.get(i).getCode().equalsIgnoreCase(prod_code)) {
                return prods.get(i);
            }
            
        }
        
        return null;
    }
 
}
