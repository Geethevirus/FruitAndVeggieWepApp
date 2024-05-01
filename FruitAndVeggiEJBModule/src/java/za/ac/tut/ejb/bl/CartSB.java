/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatefulEjbClass.java to edit this template
 */
package za.ac.tut.ejb.bl;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateful;
import za.ac.tut.ejb.entities.LineItems;


/**
 *
 * @author Gonts
 */
@Stateful
public class CartSB implements CartSBLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    List<LineItems> cart = new ArrayList<>();
   // List<OrderedItems> ordered_items = new ArrayList<>();
    
    
    @Override
    public void addItem(LineItems item)
    {
        
        for (int i = 0; i < cart.size(); i++) {
            
            
            if (cart.get(i).getProduct().getCode().equalsIgnoreCase(item.getProduct().getCode())) {
                
                Integer q = cart.get(i).getQuantity() + item.getQuantity();
                cart.get(i).setQuantity(q);
                return; 
            }
        }
        cart.add(item);
        
    }
    
    
    @Override
    public void removeItem(String code)
    {
        
        for (int i = 0; i < cart.size(); i++) {
            
            
            if (cart.get(i).getProduct().getCode().equalsIgnoreCase(code)) { 
                
                cart.remove(i);
                
            }
        }
        
    }

    @Override
    public List<LineItems> getCart() {
        return cart;
    }
    
    @Override
    public Double amount_due()
    {
        Double total = 0.0;
        for (int i = 0; i < cart.size(); i++) {
            
            total += cart.get(i).getProduct().getPrice()*cart.get(i).getQuantity();
            
        }
        
        return total;
    }
    
    @Override
    public void updateQuantity(Integer quantity, String code)
    {
        
        for (int i = 0; i < cart.size(); i++) {
            
            if (cart.get(i).getProduct().getCode().equalsIgnoreCase(code)) {
                
                cart.get(i).setQuantity(quantity);
                break;
            }
            
        }
        
    }
    
}
