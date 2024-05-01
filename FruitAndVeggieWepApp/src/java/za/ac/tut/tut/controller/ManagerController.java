/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.tut.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.ejb.bl.ProductFvFacadeLocal;
import za.ac.tut.ejb.entities.ProductFv;

/**
 *
 * @author Gonts
 */
public class ManagerController extends HttpServlet {

    @EJB
    private ProductFvFacadeLocal pfl;
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        String addbtn = request.getParameter("addbtn");
        String url = "";
        
        if (addbtn != null) {
            
            
            String prod_name = request.getParameter("prod_name");
            String prod_code = request.getParameter("prod_code");
            Double prod_price = Double.parseDouble(request.getParameter("prod_price"));
            Integer prod_quant = Integer.parseInt(request.getParameter("prod_quantity"));
            String prod_urlImage =request.getParameter("prod_url");
            
            ProductFv  prod = new ProductFv(prod_name,prod_price, prod_code, prod_quant,prod_urlImage, new Date());
            
            pfl.create(prod);
            
            url="add_outcome.jsp";
        }
        
        
        
        
        
        
        
        
        RequestDispatcher disp = request.getRequestDispatcher(url);
        disp.forward(request, response);
        
        
    }

   
}
