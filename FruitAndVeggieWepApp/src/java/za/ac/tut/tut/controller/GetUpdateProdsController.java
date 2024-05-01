/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.tut.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.ejb.bl.ProductFvFacadeLocal;
import za.ac.tut.ejb.entities.ProductFv;

/**
 *
 * @author Gonts
 */
public class GetUpdateProdsController extends HttpServlet {
    
    
    @EJB
    private ProductFvFacadeLocal pfl;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession(true);
        
        
        List<ProductFv> products =pfl.findAll();
        
        
        
        session.setAttribute("products",products);
        
           
        
        RequestDispatcher disp = request.getRequestDispatcher("cust_menu.jsp");
        disp.forward(request, response);
        
        
    }

    
    

}
