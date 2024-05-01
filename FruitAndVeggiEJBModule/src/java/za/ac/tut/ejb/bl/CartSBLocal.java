/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package za.ac.tut.ejb.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.ejb.entities.LineItems;

/**
 *
 * @author Gonts
 */
@Local
public interface CartSBLocal {
    
    public List<LineItems> getCart();
    public void removeItem(String code);
    public void addItem(LineItems item);
    public Double amount_due();
    public void updateQuantity(Integer quantity, String code);
    
}
